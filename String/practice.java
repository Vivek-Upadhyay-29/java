import java.util.*;

public class practice {

    public static void main(String[] args) {
        // System.out.println("Enter your name :");

        // Scanner sc = new Scanner(System.in);
        // String nameee = sc.nextLine();
        // String name = "vivek";
        // String name2 = "Vivek2";

        // if (name.compareTo(name2) == 0) {
        // System.out.println("Right");
        // }
        // System.out.println("Your name is " + name + " " + nameee);
        //

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int toole = 0;
        String arr[] = new String[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.next();

            toole += arr[i].length();
        }
        System.out.println(toole);

    }
}
