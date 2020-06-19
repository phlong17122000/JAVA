/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package project;

/**
 *
 * @author Long
 */
public class Student {
    private String mssv;
    private String name;
    private String sex;
    private String cmnd;
    private String malop;

    public Student(String mssv, String name, String sex, String cmnd) {
        this.mssv = mssv;
        this.name = name;
        this.sex = sex;
        this.cmnd = cmnd;
        this.malop="";
    }
    public Student()
    {
        
    }
    public Student(String mssv, String name, String sex, String cmnd, String malop) {
        this.mssv = mssv;
        this.name = name;
        this.sex = sex;
        this.cmnd = cmnd;
        this.malop = malop;
    }
    public String getMssv() {
        return mssv;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setMssv(String mssv) {
        this.mssv = mssv;
    }
    

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public String getMalop() {
        return malop;
    }

    public void setMalop(String malop) {
        this.malop = malop;
    }
    
    
}
