/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hcmus.edu.hibernate;

/**
 *
 * @author Long
 */
import java.util.Vector;

/**
 *
 * @author Long
 */
public class arrayStudent {
    private Vector<Student> a;
    private CSV csv;

    public arrayStudent() {
        csv=new CSV();
        a=new Vector<Student>();
    }

    public void setA(Vector<Student> a) {
        this.a = a;
    }
    public CSV getCsv() {
        return csv;
    }
}
