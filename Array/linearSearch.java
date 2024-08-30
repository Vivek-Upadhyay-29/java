import java.util.*;

public class linearSearch {
    public static void main(String[] args) {
        System.out.println("enter the size of array");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] numArr = new int[size];
        System.out.println("Enter the value in array :");

        for (int i = 0; i < size; i++) {
            numArr[i] = sc.nextInt();
        }

        System.out.println("Enter the element to found");
        int x = sc.nextInt();

        for (int i = 0; i < numArr.length; i++) {
            if (numArr[i] == x) {
                System.out.println("the x found on the index " + i);
            }
        }
    }
}
