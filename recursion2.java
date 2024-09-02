import java.util.Scanner;

public class recursion2 {
    public int print(int n, int i, int sum) {
        if (i <= n) {
            sum += i;
            return print(n, i + 1, sum);
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        recursion2 r = new recursion2();
        int x = r.print(n, 0, 0);
        System.out.println(x);
    }
}