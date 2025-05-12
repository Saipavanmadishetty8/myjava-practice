public class Squareroot {
    public static int sqrt(int n) {
        if (n == 0 || n == 1) return n; // Edge cases

        int left = 1, right = n, ans = 0;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (mid * mid == n) return mid; // Perfect square
            if (mid * mid < n) {
                ans = mid;  // Store potential answer
                left = mid + 1; // Search in right half
            } else {
                right = mid - 1; // Search in left half
            }
        }
        return ans; // Return closest integer sqrt
    }

    public static void main(String[] args) {
        System.out.println(sqrt(17)); // Output: 4
    }
}
