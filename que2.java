import java.util.*;

public class que2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList<>();
        System.out.println("Enter no. of elements");
        int n = sc.nextInt();
        System.out.println("enter the elsements :");
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            a.add(num);
        }
        System.out.println("the elements");
        for (int j : a) {
            System.out.println(j);
        }
    }
}
