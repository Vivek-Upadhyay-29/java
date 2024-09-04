public class stri {
    public static void main(String[] args) {

        String name = "Vivek";

        int len = name.length() - 1;
        String newNmae = "";
        for (int i = len; i >= 0; i--) {
            newNmae += name.charAt(i);
        }
        System.out.println(newNmae);

    }
}
