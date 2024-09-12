import java.util.*;

public class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out
                .print(" Enter the value of a & b and select the operation : \n 1 for add \n 2 for sub \n 3 for multiplication");

        int operation = sc.nextInt();
        switch (operation) {
            case 1:
                System.out.println(a + b);
                break;
            case 2:
                System.out.println(a - b);
                break;
            case 3:
                System.out.println(a * b);
                break;
            default:
                System.out.println("Enter a valid number");
                break;
        }
    }
}