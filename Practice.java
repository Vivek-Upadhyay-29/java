import java.util.*;

class Practice {

    // public static int Fibo(int n) {
    // if (n == 0 || n == 1) {
    // System.out.println(n);
    // }
    // int a = 0;
    // int b = 1;
    // int c = 1;

    // for (int i = 2; i <= n; i++) {
    // c = a + b;
    // a = b;
    // b = c;

    // }
    // return (c);
    // }

    // public static void main(String[] args) {
    // System.out.println("Enter the number :");
    // Scanner sc = new Scanner(System.in);
    // int n = sc.nextInt();
    // int result = Fibo(n);
    // System.out.println(result);

    // }
    public static void main(String[] args) {

        int arr[] = { 3, 5, 6, 7, 8, 9, 11 };
        int x = 9;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                System.out.println(arr[i]);
            }
        }
    }
}