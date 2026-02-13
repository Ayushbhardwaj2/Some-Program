import java.util.Arrays;
import java.util.Scanner;

public class DuplicateByXor {
    static int xor (int[] arr){
        int unique =0;
        for(int n:arr){
            unique =unique^n;
        }
        return unique;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int[] arr=new int[k];
        for(int i=0;i<k;i++){
            arr[i]=sc.nextInt();
        }
//        System.out.println(Arrays.toString(arr);
        int c=xor(arr);
        System.out.println(c);
    }
}
