import java.util.Scanner;
public class que6
{
    public static int solve(int p, int g, int e, int n)
     {
         if (n < p && n < g)
             return 0;
        
         if (g - p > e)
            return n / p;
        
         int b;
         int t = 0;
         while (n >= g)
          {
           b = n / g;
           t += b;
           n = n + b * (e - g);
          }
         if (n >= p)
         {
             b = n / p;
             t += b;
             n = n - b * p;
         }
         return t;
     }
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();
		int g = sc.nextInt();
		int e = sc.nextInt();
		int n = sc.nextInt();
		System.out.println("Milk = " + solve(p,g,e,n));
	}
}