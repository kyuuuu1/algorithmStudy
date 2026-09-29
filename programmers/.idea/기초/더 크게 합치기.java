class Solution {
    public int solution(int a, int b) {

        int ab = Integer.parseInt(String.valueOf(a) + b);
        int ba = Integer.parseInt(String.valueOf(b) + a);

        if (ab >= ba) {
            return ab;
        } else {
            return ba;
        }
    }
}