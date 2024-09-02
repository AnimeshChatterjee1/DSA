import java.util.Scanner;

public class recursion {
    public void print(int i, int n) {
        if (i <= n) {
            System.out.print(i + " ");
            print(i + 1, n);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        recursion obj = new recursion();
        obj.print(0, n);
    }
}