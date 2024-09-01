import java.util.*;

class practice {
    public static void main(String[] args) {
        // Hollow Cube
        // int rows = 5;
        // int colum = 4;
        // for (int i = 0; i < rows; i++) {
        // for (int j = 0; j < colum; j++) {
        // if (i == 0 || i == rows - 1 || j == 0 || j == colum - 1) {
        // System.out.print("*");
        // } else {
        // System.out.print(" ");

        // }
        // System.out.println();
        // }

        // }

        int n = 5;
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
