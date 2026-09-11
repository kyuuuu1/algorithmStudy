class Solution {
    public int solution(int[] slides) {
        int answer = 0;
        int max=0;
        int sum=0;

        for(int i = 0; i<slides.length; i++){
            if(max < slides[i]){
                max = slides[i];
            }
            sum += slides[i];
        }
        if(max < sum-max){
            return 1;
        } else{
            return 2;
        }

    }
}