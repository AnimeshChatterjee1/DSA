import java.util.*;

public class que5_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter limit N");
        int n = sc.nextInt();
        System.out.println("enter a1");
        int a1 = sc.nextInt();
        System.out.println("enter a2");
        int a2 = sc.nextInt();
        System.out.println("enter n1 and n2 for two APs");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println("enter common ratio r1 and r2 for the two APs");
        int r1 = sc.nextInt();
        int r2 = sc.nextInt();
        if (n1 <= n && n2 <= n) {
            int flag = 0;
            for (int k = 1; k <= n; k++) {
                for (int j = 1; j <= n; j++) {
                    if ((a1 + (k - 1) * r1) == (a2 + (j - 1) * r2)) {
                        flag++;
                    }
                      if (flag != 0) {
                System.out.println(flag+"Common elements are present in the both AP");
                
            }

                }

            }
          
            else {
                System.out.println("no common element found");
            }



        }
        else {
            System.out.println("Invalid input for commin ratio");
        }
    }
}