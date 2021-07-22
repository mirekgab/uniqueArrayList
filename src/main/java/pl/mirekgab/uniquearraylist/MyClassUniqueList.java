package pl.mirekgab.uniquearraylist;

import java.util.ArrayList;
import java.util.HashSet;

public class MyClassUniqueList {    
    public void uniqueList() {
        ArrayList<MyClass> list = new ArrayList<>();
        list.add(new MyClass(1, "value1"));
        list.add(new MyClass(2, "value2"));
        list.add(new MyClass(3, "value3"));
        list.add(new MyClass(2, "value2"));
        list.add(new MyClass(1, "value1"));        
        printList("list with duplicates", list);
        ArrayList<MyClass> uniqueList = new ArrayList(new HashSet(list));
        printList("list without duplicates", uniqueList);
    }
    private void printList(String info, ArrayList<MyClass> list) {
        System.out.println(info);
        list.forEach(e -> {
            System.out.println(e);
        });
    }
}
