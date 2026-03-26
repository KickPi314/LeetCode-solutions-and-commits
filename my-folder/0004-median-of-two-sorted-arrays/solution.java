import java.util.Arrays;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] mergedNums = new int[m+n];
        double median;

        for (int i1 = 0; i1 < m; i1++) {
            mergedNums[i1] = nums1[i1];
        }

        for (int i2 = 0; i2 < n; i2++) {
            mergedNums[i2+m] = nums2[i2];
        }
        
        Arrays.sort(mergedNums);
        int ml = mergedNums.length;

        if (ml % 2 == 0) {
            median = (mergedNums[ml/2] + mergedNums[(ml/2) - 1])/2.0;
        } else {
            median = mergedNums[ml/2];
        }

        return median;

    }
}
