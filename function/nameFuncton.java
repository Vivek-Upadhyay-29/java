import java.util.*;

public class nameFuncton {
    public static void nameFuc(String name) {
        System.out.println("Hello how are you :" + name);
        return;
    }

    public static void main(String[] args) {
        System.out.println("Type your name here");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        nameFuc(name);

    }
}
