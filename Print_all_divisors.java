import java.util.*;
public class Print_all_divisors {
    public static ArrayList<Integer> sumOfAllDivisors(int n){
        ArrayList<Integer> al=new ArrayList<>();

        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                al.add(i);
                if(n/i!=1){
                    al.add(n/i);
                }
            }

        }
        Collections.sort(al);
        return al;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(sumOfAllDivisors(n));

    }
}