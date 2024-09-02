import java.util.HashSet;
import java.util.Iterator;

public class hashset {
    public static void main(String[] args) {
        //creation
        HashSet<Integer> set = new HashSet<>(); 
        //insertion
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(2);
        //printing the set
        for (int i : set) {
            System.out.println(i);
        }
        
        //search-contains
        if (set.contains(1)) {
            System.out.println("is there");
        }
        // method to print set
        System.out.println(set);

        //Iterator
        Iterator it = set.iterator();
        //hasNext returns true or false
        // next returns the value
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
    
}
