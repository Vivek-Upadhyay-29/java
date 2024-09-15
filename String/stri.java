public class stri {
    public static void main(String[] args) {

        // String name = "Vivek";
        // int len = name.length() - 1;
        // String newNmae = "";
        // for (int i = len; i >= 0; i--) {
        // newNmae += name.charAt(i);
        // }
        // System.out.println(newNmae);

        // String name = "Vivek";

        // StringBuilder info = new StringBuilder();
        // for (int i = name.length() - 1; i >= 0; i--) {
        // info.append(name.charAt(i) + " ");
        // }
        // System.out.println(info.toString());

        String name = "Vivek";
        String reverse = "";

        for (int i = name.length() - 1; i >= 0; i--) {

            reverse += name.charAt(i);

        }
        System.out.println(reverse);

        // for (int i = name.length() - 1; i >= 0; i--) {
        // reverse += reverse.charAt(i);
        // }
        // System.out.println(reverse);
    }
}
