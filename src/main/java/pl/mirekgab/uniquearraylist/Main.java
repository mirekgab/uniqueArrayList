/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.mirekgab.uniquearraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/**
 *
 * @author mirek
 */
public class Main {
    
    public static void main(String[] args) {
        System.out.println("unique array list example");
        
        IntegerUniqueList integerUniqueList = new IntegerUniqueList();
        integerUniqueList.uniqueList();
        
        MyClassUniqueList myClassUniqueList = new MyClassUniqueList();
        myClassUniqueList.uniqueList();
    }


}
