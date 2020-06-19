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
public class Student {
    private int stt;
    private String mssv;
    private String name;
    private String sex;
    private String cmnd;

    public Student(int stt, String mssv, String name, String sex, String cmnd) {
        this.stt = stt;
        this.mssv = mssv;
        this.name = name;
        this.sex = sex;
        this.cmnd = cmnd;
    }

    public int getStt() {
        return stt;
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

    public void setStt(int stt) {
        this.stt = stt;
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
     
}
