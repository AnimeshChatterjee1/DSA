import java.util.*;
public class que3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter amount ");
        int n = sc.nextInt();
        System.out.println("enter price of plastic bottle");
        int p = sc.nextInt();
        System.out.println("Enter the price of glass bottle");
        int g = sc.nextInt();
        System.out.println("Enter the exchange rate of glass bottle");
        int r = sc.nextInt();
        int max = 0;
        while (n >= p || n >= g) {
            if (n >= g) {
                int bottles = n / g;
                max += bottles;
                n = n - (bottles * g) + (bottles * r);
            }
            else {
                int bottles = n / p;
                max += bottles;
                n -= (bottles * p);
            
            }
        }
        System.out.println("Maximum bottles possible\t"+max);
    }
    
}
