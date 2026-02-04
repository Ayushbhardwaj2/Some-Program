import java.util.Scanner;

public class Fibonacci {
    static int fibo(int n){

        if(n==0) {
            return 0;
        }
        if (n==1){
            return  1;
        }


        else {
            return fibo(n - 1)+(n-2);
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();


        fibo(n);
        System.out.println(fibo(n));

    }
}



