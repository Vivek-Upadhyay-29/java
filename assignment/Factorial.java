import java.util.*;

public class Factorial {
    public static int Fibonacci(int n) {
        // Base case: If n is 0 or 1, return n directly
        if (n <= 1) {
            return n;
        }

        int a = 0; // Fibonacci(0)
        int b = 1; // Fibonacci(1)
        int c = 1;

        // Calculate Fibonacci using an iterative approach
        for (int i = 2; i <= n; i++) {
            c = a + b; // Fibonacci(i) = Fibonacci(i-1) + Fibonacci(i-2)
            a = b; // Move to the next position
            b = c; // Update b to the latest Fibonacci number
        }
        return c;
    }

    public static void main(String[] args) {
        System.out.println("Enter the number :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = Fibonacci(n);
        System.out.println("Fibonacci of " + n + " is: " + result);
    }
}
