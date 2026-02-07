public class RevArray {
        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4};

            int i = 0;
            int j = arr.length - 1;

            while (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                i++;
                j--;
            }
            i = 0;
            while (i < arr.length) {
                System.out.print(arr[i] + " ");
                i++;
            }
        }
    }


