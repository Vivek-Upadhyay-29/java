import java.util.*;

public class practice {

    public static void main(String[] args) {
        System.out.println("Enter your name :");

        Scanner sc = new Scanner(System.in);
        String nameee = sc.nextLine();
        String name = "vivek";
        String name2 = "Vivek2";

        if (name.compareTo(name2) == 0) {
            System.out.println("Right");
        }
        System.out.println("Your name is " + name + " " + nameee);
    }
}
