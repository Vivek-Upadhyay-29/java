import java.util.*;

public class factorial {

    public static int calFact(int fact) {
        int sum = 1;

        for (int i = 1; i <= fact; i++) {
            sum = sum * i;
            System.out.println(sum);

        }
        return sum;

    }

    public static void main(String[] args) {
        System.out.println("Enter the value");

        Scanner sc = new Scanner(System.in);

        int fact = sc.nextInt();

        System.out.println("the factorail of no is : " + calFact(fact));

    }
}
