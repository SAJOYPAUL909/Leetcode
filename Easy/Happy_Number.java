import java.util.HashSet;

class Solution {
    public int Squaresum(int n) {
        int sum = 0;
        while (n != 0) {
            sum += ((n % 10) * (n % 10));
            n /= 10;
        }
        return sum;
    }

    public boolean isHappy(int n) {

        HashSet<Integer> set = new HashSet<>();

        while (true) {
            n = Squaresum(n);
            if (n == 1)
                return true;

            if (set.contains(n))
                return false;
            set.add(n);
        }

    }
}