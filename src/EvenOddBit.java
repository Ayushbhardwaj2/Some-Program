import java.net.SocketOption;
import java.util.Scanner;

public class EvenOddBit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int  n=sc.nextInt();
        if((n&1)==1){
            System.out.println("It is an odd no.");
        }
        else {
            System.out.println("It is an even no.");
        }
    }
}
