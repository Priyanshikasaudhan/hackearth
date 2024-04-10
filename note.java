// import java.lang.Scanner;
import java.util.*;
class addarray {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j] == target){
                    return new int[] {i, j};
                }
            
        }
        }
       throw new IllegalArgumentException("No two sum solution");
    }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for(int i=0;i<nums.length;i++){
            nums[i] = sc.nextInt();
        }
        int target = sc.nextInt();
          addarray solution = new addarray();
        int[] result = solution.twoSum(nums, target);
        
    }
}