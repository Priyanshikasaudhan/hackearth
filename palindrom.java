// import java.lang.Scanner;
import java.util.*;
public class palindrom {
        public boolean isPalindrome(int x) {
     int r,sum=0,temp;
            temp = x;
            while(x>0){
                r=x%10;
                sum=(sum*10)+r;
                x=x/10;
            }
            if(temp==sum){
                return true;
            }else{
                return false;
            }
            
        }
        public static void main(String srg[]){
            Scanner sc = new Scanner(System.in);
            int n=sc.nextInt();
            palindrom solution = new palindrom();
            boolean result = solution.isPalindrome(n);
            System.out.println(result);
        }
    }

