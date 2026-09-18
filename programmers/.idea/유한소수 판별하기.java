class Solution {
    public int solution(int a, int b) {

        int gcd = 1;

        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }

        b = b / gcd;

        while (b % 2 == 0) {
            b /= 2;
        }

        while (b % 5 == 0) {
            b /= 5;
        }

        if (b == 1) {
            return 1;
        }

        return 2;
    }
}