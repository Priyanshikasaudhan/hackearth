import java.util.Scanner;
class BinarySearchuserinput {
    public static int BinarySearch(int num[],int key){
        int start=0;
        int end=num.length - 1;
        while(start<=end){
            int mid = (start + end)/2;
            if(num[mid] == key){
                return mid;
            }
            if(num[mid] < key){
                mid = start +1;
            }else{
                start = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        int num[] = new int[size];
        System.out.println("Enter the value");
        for(int i=0;i<size;i++){
        num[i] = sc.nextInt();
            }
            System.out.println("Enter the key: ");
           int key = sc.nextInt();
        int result = BinarySearch(num, key);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
    }
