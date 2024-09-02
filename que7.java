import java.util.Scanner;
public class que7
{
    public static String solve(String s, String key)
     {
         int f[] = new int[26];
         String r = "";
         for (int i = 0; i < s.length(); ++i)
            f[s.charAt(i) - 97]++;
            
         for (int i = 0; i < key.length(); ++i)
          {
              while (f[key.charAt(i) - 97] > 0)
                {
                    r += key.charAt(i);
                    --f[key.charAt(i) - 97];
                }
          }
          return r;
     }
	public static void main(String[] args) {
		System.out.println("Hello World");
		Scanner sc= new Scanner(System.in);
		String s = sc.nextLine();
		String key = sc.nextLine();
		System.out.print(solve(s, key));
	}
}