class Solution {
    public String solution(String polynomial) {
        String[] terms = polynomial.split(" \\+ ");

        int xSum=0;
        int numSum=0;

        for(int i=0; i<terms.length; i++){
            String term = terms[i];

            if(term.contains("x")){
                if(term.equals("x")){
                    xSum += 1;
                } else{
                    xSum += Integer.parseInt(term.replace("x", ""));
                }
            }else{
                numSum += Integer.parseInt(term);
            }
        }

        String answer = "";

        if(xSum>0){
            if(xSum==1){
                answer = "x";
            }else{
                answer = xSum+ "x";
            }
        }
        if(numSum >0){
            if(!answer.equals("")){
                answer += " + ";
            }
            answer += numSum;
        }
        return answer;
    }
}