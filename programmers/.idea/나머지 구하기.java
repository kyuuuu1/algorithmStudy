class Solution {
    public int solution(int num1, int num2) {
        int answer = -1;
        answer = num1/num2;
        int a = num1 - num2*answer;
        return a;
    }
}