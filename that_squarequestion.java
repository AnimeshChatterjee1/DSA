
//logic - add upar wala and left wala 
// 1 1 1 1 1 1 1 1 1 
// 1 2 3 4 5 6 7 8 
// 1 3 6 
// 1
// 1
// 1
// 1


import java.util.Scanner;
public class that_squarequestion
{
    public static void solve(int m, int n)
     {
         int [][]mat = new int[m][n];
         for (int i = 0; i < m; ++i)
		    mat[i][0] = 1;
		    
		for (int j = 0; j < n; ++j)
		    mat[0][j] = 1;
		    
		for (int i = 1; i < m; ++i)
		 {
		     for (int j = 1; j < n; ++j)
		        mat[i][j] = mat[i - 1][j] + mat[i][j - 1];
		 }
		 
		System.out.print(mat[m - 1][n - 1]);
     }
	public static void main(String[] args) {
		System.out.println("Hello World");
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		
// 		for (int i = 0; i < m; ++i)
// 		 {
// 		     for (int j = 0; j < n; ++j)
// 		        mat[i][j] = sc.nextInt();
// 		 }
		solve(m, n);
	}
}