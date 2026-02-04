public class Printrevrec {
    static void print(int n,int count){

        if(count==0){
            return ;
        }


        System.out.println(count);
        count--;
        print(n,count);
    }
    public static void main(String[] args) {


        print(5,5);

    }
}

