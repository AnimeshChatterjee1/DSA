import java.util.*;

class patter_ultastar {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= n - i + 1) {
                System.out.print("* ");
                j = j + 1;
            }
            System.out.println();
            i += 1;

        }
    }
}
