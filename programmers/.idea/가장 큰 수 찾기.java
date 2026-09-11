class Solution {
    public int[] solution(int[] array) {

        int max = 0;
        int index = 0;

        for(int i = 0; i<array.length; i++){
            if(max< array[i]){
                max = array[i];
                index = i;
            }
        }
        int[] answer = new int[]{max, index};

        return answer;
    }
}