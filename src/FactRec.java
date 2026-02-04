import java.util.Scanner;

public class FactRec {
    static int factorial(int n){

        if(n==0) {
            return 1;
        }
            if (n==1){
                return  1;
        }
        else {
            return factorial(n - 1)*n;
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();


        factorial(n);
        System.out.println(factorial(n));

    }
}

