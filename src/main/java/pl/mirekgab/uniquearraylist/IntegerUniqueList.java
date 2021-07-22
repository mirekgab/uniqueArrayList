
package pl.mirekgab.uniquearraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class IntegerUniqueList {
    
    public void uniqueList() {
        ArrayList<Integer> list = new ArrayList(Arrays.asList(1,2,3,2,4,5,3,6,7));
        printList(list);
        ArrayList<Integer> uniqueList = new ArrayList(new HashSet<>(list));
        printList(uniqueList);
    }
    
    private void printList(ArrayList<Integer> list1) {
        System.out.println("");
        list1.forEach(e -> {
            System.out.println(e);
        });
    }    
}
