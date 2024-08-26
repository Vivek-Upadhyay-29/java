import java.util.*;

public class Pattern1 {
    public static void main(String[] args) {
        System.out.println("Enter the number of rows and column");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.print("*");
            }
            System.out.println("*");
        }

    }
}
