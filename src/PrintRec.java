public class PrintRec {

        //   public static int count=0;
        static void print(int n,int count){

            if(count==n){
                return;
            }


            System.out.println(count);
            count++;
            print(n,count);
        }
        public static void main(String[] args) {


            print(5,0);

        }
    }

