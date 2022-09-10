package leetcode;


import org.junit.Assert;

public class Question0088 {

    /**
     * merget sorted number arrays
     *
     * @param nums1 a-z
     * @param m
     * @param nums2 a-z
     * @param n
     */
    public void merge1(int[] nums1, int m, int[] nums2, int n) {
        if (nums2.length == 0) return;
        int last = nums1.length - 1;
        int firstLast = m - 1;
        int secondLast = n - 1;

        while (last >= 0) {
            if ((firstLast >= 0 && secondLast < 0) || (firstLast >= 0 && secondLast >= 0 && nums1[firstLast] >= nums2[secondLast])) {
                nums1[last--] = nums1[firstLast--];
            } else if (secondLast >= 0) {
                nums1[last--] = nums2[secondLast--];
            }
        }
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (nums2.length == 0) return;
        int last = nums1.length - 1;
        int firstLast = m - 1;
        int secondLast = n - 1;

        while (firstLast >= 0 && secondLast >= 0) {
            nums1[last--] = nums1[firstLast] >= nums2[secondLast] ? nums1[firstLast--] : nums2[secondLast--];
        }
        if (secondLast >= 0) {
            System.arraycopy(nums2, 0, nums1, 0, secondLast + 1);
        }
    }

    static void printArray(int nums1[]) {
        for (int i = 0; i < nums1.length; i++) {
            System.out.print(nums1[i]);
            System.out.print(",");
        }
        System.out.println();
    }

    public static void main(String[] args) {


    }
}


