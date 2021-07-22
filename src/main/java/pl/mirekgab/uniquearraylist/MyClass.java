/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.mirekgab.uniquearraylist;

import java.util.Objects;

/**
 *
 * @author mirek
 */
public class MyClass {
    private Integer myClassId;
    private String myText;

    public MyClass(Integer myClassId, String myText) {
        this.myClassId = myClassId;
        this.myText = myText;
    }

    public Integer getMyClassId() {
        return myClassId;
    }

    public void setMyClassId(Integer myClassId) {
        this.myClassId = myClassId;
    }

    public String getMyText() {
        return myText;
    }

    public void setMyText(String myText) {
        this.myText = myText;
    }    

    @Override
    public String toString() {
        return "MyClass{hashCode=" +hashCode()+"," + "myClassId=" + myClassId + ", myText=" + myText + '}';
    }

    @Override
    public int hashCode() {
        return myClassId;
    }   

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final MyClass other = (MyClass) obj;
        if (!Objects.equals(this.myClassId, other.myClassId)) {
            return false;
        }
        return true;
    }
    
}
