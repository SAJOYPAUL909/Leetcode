import java.util.Arrays;

class Solution {
    public int candy(int[] ratings) {
        int count = 0;
        int arr[] = new int[ratings.length];
        int arr1[] = new int[ratings.length];
        Arrays.fill(arr, 1);
        Arrays.fill(arr1, 1);

        for (int i = 1; i < ratings.length; i++) {
            if (ratings[i] > ratings[i - 1]) {
                arr[i] = arr[i - 1] + 1;
            }
        }

        for (int i = ratings.length - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                arr1[i] = arr1[i + 1] + 1;
            }
        }

        for (int i = 0; i < ratings.length; i++) {
            count += Math.max(arr[i], arr1[i]);
        }

        return count;
    }
}