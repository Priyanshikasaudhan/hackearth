import java.util.Arrays;
import java.util.Scanner;

class demo {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int expectedNums = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[expectedNums]) {
                expectedNums++;
                nums[expectedNums] = nums[i];
            }
        }
        return expectedNums + 1;
    }

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int nums[] = new int[n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        demo solution = new demo();
        int result = solution.removeDuplicates(nums);

        // Sort the array after removing duplicates
        Arrays.sort(nums, 0, result);

        // Print the result after removing duplicates and sorting
        System.out.println("Length after removing duplicates: " + result);
        System.out.println("Array after removing duplicates and sorting:");
        for (int i = 0; i < result; i++) {
            System.out.print(nums[i] + " ");
        }

        // Assertions to validate the result
        assert result == nums.length; // Length should be equal to the number of unique elements
        for (int i = 1; i < result; i++) {
            assert nums[i] != nums[i - 1]; // Each element should be unique
        }
    }
}
  
