import java.util.*;

public class que1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                arr[i] = (int) Math.pow(arr[i], 2);
            } else {
                arr[i] = (int) Math.pow(arr[i], 3);
            }

        }
        for (int j = 0; j < n; j++) {
            System.out.println(arr[j]);
        }
    }
}
