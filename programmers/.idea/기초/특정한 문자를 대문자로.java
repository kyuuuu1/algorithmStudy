class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";
        for(int i=0; i<my_string.length; i++){
            if(my_string[i]== alp){
                answer= my_string[i].toUpperCase();
            }
        }
        return answer;
    }
}