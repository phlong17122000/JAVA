/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;

import entities.SinhVien;
import entities.Tk;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Long
 */
public class TKDAO {
     public static Tk find(String mssv)
    {
        Tk tk=null;
        Session session=HibernateUtil.getSessionFactory().openSession();
        try{
            tk=(Tk) session.get(Tk.class,mssv);
        } catch (HibernateException ex)
        {
            System.err.println(ex);
        } finally{
            session.close();
        }
        return tk;
    }
     public boolean check(Tk tk)
     {
        Tk search=null;
        Session session=HibernateUtil.getSessionFactory().openSession();
        if (TKDAO.find(tk.getMssv())!=null){
               search=(Tk) session.get(Tk.class,tk.getMssv());
               if (search.getMk().startsWith(tk.getMk())==true)
               {
                   return true;
               }
               else
               {
                   System.out.print(tk.getMssv());
                   System.out.print(" "+tk.getMk());
                   System.out.print(" "+search.getMssv());
                   System.out.print(" "+search.getMk());
                   System.out.print("Hello false");
                   return false;
               }
         }
         else return false;
     }
    public boolean themTK(Tk tk){
        Session session=HibernateUtil.getSessionFactory().openSession();
        if (TKDAO.find(tk.getMssv())!=null){
            return false;
        }
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.save(tk);
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
