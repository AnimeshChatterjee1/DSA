import java.util.*;

public class que4 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter m ,n for a matrix of m*n");
        int m = sc.nextInt();
        int n = sc.nextInt();
        System.out.println("Enter a position to check");
        int k = sc.nextInt();
        if (k <= m * n && k>=1) 
        {
            if (k % m == 2) 
            {
                System.out.println("mango");

            }
            else if(k>m && k<=2*m){
                System.out.println("mango tree found");
            }
            else if(k>=((n-2)*m)+1 && k<=m*(n-1)){
                System.out.println("Mango tree found");
            }
            else{
                System.out.println("Mango tree not found ");
            }

        }
        else {
            System.out.println("Invalidd!!!,enter a number in between 1 and m*n");
        }
    }

}
