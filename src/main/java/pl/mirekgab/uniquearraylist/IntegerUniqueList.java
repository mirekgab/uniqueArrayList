
package pl.mirekgab.uniquearraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class IntegerUniqueList {
    
    public void uniqueList() {
        ArrayList<Integer> list = new ArrayList(Arrays.asList(1,2,3,2,4,5,3,6,7));
        printList("list with duplicates", list);
        ArrayList<Integer> uniqueList = new ArrayList(new HashSet(list));
        printList("list without duplicates", uniqueList);
    }
    
    private void printList(String info, ArrayList<Integer> list) {
        System.out.println("\n"+info);
        list.forEach(e -> {
            System.out.printf("%d ",e);
        });        
    }   
}
