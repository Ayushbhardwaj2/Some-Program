public class RevArrayRec {

    static void reverse(int[] arr, int start, int end) {

        // base case
        if (start >= end) {
            return;
        }

        // swap
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        // recursive call
        reverse(arr, start + 1, end - 1);
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        reverse(arr, 0, arr.length - 1);

        // print array
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
