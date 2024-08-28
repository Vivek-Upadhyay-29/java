import java.util.*;

public class sum {

    public static int sUMFunction(int a, int b) {
        return a * b;

    }

    public static void main(String[] args) {
        System.out.println("Enter a and b : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = sUMFunction(a, b);
        System.out.println(sum);

    }

}
