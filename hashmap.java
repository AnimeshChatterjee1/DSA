import java.util.HashMap;
import java.io.PushbackInputStream;
import java.util.*;

import javax.swing.SpinnerDateModel;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import javax.xml.transform.Source;

import java.util.*;
// HASHMAP
//{key : value}
// the key is always unique
public class hashmap {
    public static void main(String[] args) {
        //country(key),population(value)
        HashMap<String, Integer> map = new HashMap<>();
        //Insertion
        map.put("India", 120);
        map.put("Pakistan", 80);
        map.put("China", 150);
        System.out.println(map);

        //SEARCH
        if (map.containsKey("India")) {
            System.out.println("is present");
        }
        else {
            System.out.println("Nott Present");
        }

        System.out.println(map.get("India"));
        System.out.println(map.get("Syria"));

        //Iteration
        int arr[] = { 10, 20, 30 };
        //for(int val:arr)
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key+" "+map.get(key));
            
        }
        //DELETION
        System.out.println(map);
        map.remove("Pakistan");
        System.out.println(map);
    }
}
