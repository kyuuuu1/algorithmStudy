class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {


        int num = numer1*denom2 + numer2*denom1;
        int den = denom1 * denom2;

        int gcd = gcd(num, den);

        num /= gcd;
        den /= gcd;

        int[] answer = {num,den};

        return answer;
    }

    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}