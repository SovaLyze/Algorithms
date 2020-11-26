package RemoveElement;

public class rmvElement {

    static public int removeElement(int[] nums, int val) {
        int i = 0;
        int n = nums.length;

        while (i < n) {
            if(nums[i] == val) {
                nums[i] = nums[n -1];
                n--;
            } else {
                i++;
            }
        }
        return n;
    }

    public static void main(String[] args) {

        int[] numbers = {2, 3, 4, 1};
        int value = 2;

        System.out.println(removeElement(numbers, value));

    }
}
