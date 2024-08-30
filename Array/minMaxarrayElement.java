import java.util.*;

public class minMaxarrayElement {
    public static void main(String args[]) {

        System.out.println("Enter the array :");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arrLen = new int[size];

        for (int i = 0; i < size; i++) {
            arrLen[i] = sc.nextInt();
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < size; i++) {
            if (arrLen[i] < min) {
                min = arrLen[i];

            }
            if (arrLen[i] > max) {
                max = arrLen[i];
            }
        }
        System.out.println("The min value of this array is " + min);
        System.out.println("The maximum value of this array is " + max);

    }
}
