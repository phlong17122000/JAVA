/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import project.Student;
/**
 *
 * @author Long
 */
public class SVDAO {
    public static Student find(String MSSV)
    {
        Student sv=null;
        Session session=HibernateUtil.getSessionFactory().openSession();
        try{
            sv=(Student) session.get(Student.class,MSSV);
        } catch (HibernateException ex)
        {
            System.err.println(ex);
        } finally{
            session.close();
        }
        return sv;
    }
    public boolean themSV(Student sv){
        Session session=HibernateUtil.getSessionFactory().openSession();
        if (SVDAO.find(sv.getMssv())!=null){
            return false;
        }
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.save(sv);
            transaction.commit();
        } catch (HibernateException ex){
            transaction.rollback();
            System.err.println(ex);
        } finally {
            session.close();
        }
        return true;
    }
}