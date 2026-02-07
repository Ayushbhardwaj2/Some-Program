import java.util.Arrays;
import java.util.Scanner;

public class Numfreq {
    static int count(int[] nums,int c,int j,int n) {
        for (int i = 0; i < n; i++) {
            if (nums[i] == j) {
                c=c+1;
            }
        }
        return c;
    }
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        int [] nums=new int[n];
        System.out.println("Enter the elements of array");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(nums));
        System.out.println("Enter the value of num want to cal freq");
        int j=sc.nextInt();
        int a=count(nums,0,j,n);
        System.out.println(a);
    }


}
