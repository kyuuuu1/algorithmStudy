import java.util.Arrays;

class Solution {
    public int solution(String[] spell, String[] dic) {
        Arrays.sort(spell);

        for(int i=0; i<dic.length; i++){

            String word =dic[i];

            if(word.length() != spell.length){
                continue;
            }

            char[] chars = word.toCharArray();
            Arrays.sort(chars);

            String sortedWord = new String(chars);

            if(sortedWord.equals(String.join("", spell))){
                return 1;
            }
        }
        return 2;
    }
}