public class NumberPattern {

    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.print("");
            System.out.println();
        }
    }
}
// isme innenr loop jo hai woh i jitna chalega and fir hum j ki value hi print
// karwa denge//