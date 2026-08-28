class Solution {
    public int[] decrypt(int[] code, int k) {

        int n = code.length;
        int[] result = new int[n];

        if (k == 0) {
            return result;
        }

        int windowSum = 0;

        if (k > 0) {

            // First window: next k elements of index 0
            for (int i = 1; i <= k; i++) {
                windowSum += code[i % n];
            }

            for (int i = 0; i < n; i++) {

                result[i] = windowSum;

                // Remove the old element
                windowSum -= code[(i + 1) % n];

                // Add the new element
                windowSum += code[(i + k + 1) % n];
            }

        } else {

            k = -k;

            // First window: previous k elements of index 0
            for (int i = 1; i <= k; i++) {
                windowSum += code[(n - i) % n];
            }

            for (int i = 0; i < n; i++) {

                result[i] = windowSum;

                // Remove old element
                windowSum -= code[(i - k + n) % n];

                // Add new element
                windowSum += code[i];
            }
        }

        return result;
    }
}