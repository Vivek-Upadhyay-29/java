import java.util.*;

public class GCD {
    public static void main(String[] args) {
        System.out.println("Enter two number :");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int i = 1; i <= a; i++) {
            if (a % i == 0 && b % i == 0) {
                System.out.println(i);
            }
        }

    }
}
