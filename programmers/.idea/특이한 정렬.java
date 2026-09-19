class Solution {
    public int[] solution(int[] numlist, int n) {
        for(int i=0; i<numlist.length-1; i++){
            for(int j= i+1; j<numlist.length; j++){
                int dI= Math.abs(numlist[i]-n);
                int dJ=Math.abs(numlist[j]-n);

                boolean shouldSwap=
                        dI > dJ || (dI==dJ&& numlist[i]<numlist[j]);
                if(shouldSwap){
                    int temp = numlist[i];
                    numlist[i] = numlist[j];
                    numlist[j] = temp;
                }
            }
        }
        return numlist;
    }
}