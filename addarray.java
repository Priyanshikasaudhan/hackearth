import java.lang.Scanner;
class addarray {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.lenght;i++){
            for(int j=1;j<nums.lenght;j++){
                if(nums[i]+nums[j]=target){
                    System.out.println(i,j);
                }
            }
        }
        return 0;
    }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for(int i=0;i<nums.lenght;i++){
            nums[i] = sc.nextInt();
        }
        int target = sc.nextInt();
    }
}