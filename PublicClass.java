import java.util.*;

class PublicClass {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();
        // Scanner sc

        // System.out.println("Your name is : "+name);
        // System.out.println("hello");
        // System.out.println("*\n**\n***\n****");

        // System.out.println("Enter the valur of A & B : ");
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();

        // int sum = a + b ;
        // System.out.println(sum);
        // Scanner sc = new Scanner(System.in)
        // int age = sc.nextInt();

        // if (age%2 == 0){
        // System.out.println("You are even");
        // }
        // else{
        // System.out.println("You are odd5");
        // }
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();

        switch (button) {
            case 1:
                System.out.println("Namaste");

                break;
            case 2:
                System.out.println("kem cho"); // syso
                break;
            case 3:
                System.out.println("welcome!!");
                break;
            default:
                System.out.println("Enter a valid number");
                break;
        }
    }
}