import java.util.Scanner;

// class singlenumber {
//     public static int singleNumber(int[] nums) {
//         int result = 0;
//         for (int i = 0; i < nums.length; i++) {
//             // for(int j=i+1;j<nums.length;j++){
//                 if (nums[i] != nums[i]) {
//                     result = nums[i];
//             }
//         }
//         return result;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number of elements: ");
//         int n = sc.nextInt();
//         int nums[] = new int[n];
//         System.out.println("Enter the elements:");
//         for (int i = 0; i < nums.length; i++) {
//             nums[i] = sc.nextInt();
//         }
//         int single = singleNumber(nums);
//         System.out.println("The single number is: " + single);
//     }
// }

import java.util.Scanner;

public class singlenumber {
    public static int singleNumber(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result ^= nums[i];
        }
        return result;
    }

    public static void main(String[] args) {
        // int[] nums = {2, 2, 1};
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for(int i=0;i<nums.length;i++){
            nums[i] = sc.nextInt();
        }
        int single = singleNumber(nums);
        System.out.println("The single number is: " + single);
    }
}
