import java.util.Arrays;
import java.util.Scanner;

public class balloon {
    
    public static int maxMinutes(int[] balloons, int N, int K) {
        int minutes = 0;
        while (N >= K) {
            Arrays.sort(balloons);
            for (int i = N - K; i < N; i++) {
                balloons[i]--;
                if (balloons[i] == 0) {
                    N--;
                }
            }
            
            minutes++;
        }
        
        return minutes;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of groups (N): ");
        int N = scanner.nextInt();
        
        int[] balloons = new int[N];
        System.out.println("Enter the number of balloons in each group:");
        for (int i = 0; i < N; i++) {
            balloons[i] = scanner.nextInt();
        }
        
        System.out.print("Enter the value of K: ");
        int K = scanner.nextInt();
        
        int maxMinutes = maxMinutes(balloons, N, K);
        System.out.println("Maximum minutes the gun will be activated: " + maxMinutes);
        
        
}
}