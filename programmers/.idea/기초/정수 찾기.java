class Solution {
    public int solution(int[] num_list, int n) {
        int answer = 0;
        for(int str: num_list){
            if(n == str){
                answer =1;
            }
        }
        return answer;
    }
}