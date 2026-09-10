class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int a = 0;
        int b = 0;
        for(int i=0; i<numbers.length; i++){
            if(numbers[i]>a){
                b = a;
                a = numbers[i];
            }else if(numbers[i]>b){
                b = numbers[i];
            }
        }

        return a*b;
    }
}