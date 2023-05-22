import java.util.*;

public class patttern {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        while (i <= 3) {
            int j = 1;
            while (j <= i) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }
        int t = 2;
        while (t>0) {
            int z =1 ;
            while (z<=t) {
                System.out.print("* ");
                z=z+1;
            }
            System.out.println();
            t=t-1;
        }
        
    }
}
