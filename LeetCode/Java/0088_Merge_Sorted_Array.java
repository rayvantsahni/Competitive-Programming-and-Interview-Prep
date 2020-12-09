class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int left = m - 1;
        int right = n - 1;
        
        for (int i = nums1.length - 1; i >= 0; i--) {
            if (right < 0)
                break;
             
            if (left >= 0 && nums1[left] > nums2[right])
                nums1[i] = nums1[left--];
            else
                nums1[i] = nums2[right--];
        }
    }
}
