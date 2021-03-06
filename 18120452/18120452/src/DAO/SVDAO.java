/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;
import entities.SinhVien;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
/**
 *
 * @author Long
 */
public class SVDAO {
    public static List<SinhVien> layDSSV_MaLop(String MaLop)
    {
        List<SinhVien> ds=null;
        Session session=HibernateUtil.getSessionFactory().openSession();
        try
        {
            String hql;
            hql = "select sv from SinhVien sv where sv.malop='"+MaLop+"'";
            Query query=session.createQuery(hql);
            ds=query.list();
        } catch (HibernateException ex)
        {
            System.err.println(ex);
        } finally{
            session.close();
        }
        return ds;
    }
    public static SinhVien find(String MSSV)
    {
        SinhVien sv=null;
        Session session=HibernateUtil.getSessionFactory().openSession();
        try{
            sv=(SinhVien) session.get(SinhVien.class,MSSV);
        } catch (HibernateException ex)
        {
            System.err.println(ex);
        } finally{
            session.close();
        }
        return sv;
    }
    public boolean themSV(SinhVien sv){
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