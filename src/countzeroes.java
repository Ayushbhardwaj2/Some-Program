public class countzeroes {
    public static void main(String[] args){
       int a= counting(2300900);
        System.out.println(a);
    }
    static int count=0;
    static int counting(int N){
        if(N==0){
            return count;
        }
         int rem=N%10;
         if(rem==0){
             count++;
         }
         counting(N/10);
         return count;
    }
}
