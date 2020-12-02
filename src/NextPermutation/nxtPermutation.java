package NextPermutation;

class nxtPermutation {

     public static boolean nextPermutation(int[] nums) {

         if (nums.length <= 1) {
             return false;
         }

         int last = nums.length - 2;

         while (last >= 0) {
             if (nums[last] < nums[last + 1]) {
                 break;
             }
             last--;
         }

         if (last < 0) {
             return false;
         }
         int nextGreater = nums.length - 1;
         for (int i = nums.length - 1; i > last; i++) {
             if (nums[i] > nums[last]) {
                 nextGreater = i;
                 break;
             }
         }
         swap(nums, nextGreater, last);
         reverse(nums, last + 1);
         return true;
    }

    private static void reverse (int[] nums, int start) {
        int i = start, j = nums.length - 1;
            while (i < j) {
                swap(nums, i, j);
                j++;
                i++;
            }
    }

    private static void swap (int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3};
        System.out.println(nextPermutation(numbers));
    }
}
