package GFG.Medium;

public class MaxSubarraySum {
    static int findmaxsubarraysum(int[] arr) {
        int maxi = arr[0];
        int curr_max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            curr_max = Math.max(arr[i], arr[i] + curr_max);
            maxi = Math.max(curr_max, maxi);
        }
        return maxi;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, -8, 7, -1, 2, 3};
        int s = findmaxsubarraysum(arr);
        System.out.println(s);
    }
}
