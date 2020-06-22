/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entities;

/**
 *
 * @author Long
 */
import entities.SinhVien;
import java.awt.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Vector;

/**
 *
 * @author Long
 */
public class CSV {

    private static final String COMMA_DELIMITER = ",";

    public  static ArrayList<String> parseCsvLine(String csvLine) {
        ArrayList<String> result = new ArrayList<String>();
        if (csvLine != null) {
            String[] splitData = csvLine.split(COMMA_DELIMITER);
            for (int i = 0; i < splitData.length; i++) {
                result.add(splitData[i]);
            }
        }
        return result;
    }
    public Vector<SinhVien> readCsvFileDSSV(String address)
    {
        BufferedReader br=null;
        Vector<SinhVien> a = new Vector<SinhVien>();
        try{
            String line;
            br =new BufferedReader(new FileReader(address));
            line = br.readLine();
            while ((line = br.readLine()) != null) {
                SinhVien temp;
                ArrayList<String> chuoi = parseCsvLine(line);
                temp=new SinhVien(chuoi.get(1),chuoi.get(2),chuoi.get(3),chuoi.get(4));
                a.addElement(temp);
            }
        }catch (IOException e)
        {
            e.printStackTrace();
        } finally {
            try{
                if (br!=null)
                    br.close();
            }
            catch (IOException e)
            {
                e.printStackTrace();;
            }
        }
        return a;
    }
    public Vector<Tkb> readCsvFileTKB(String address)
    {
        BufferedReader br=null;
        Vector<Tkb> a = new Vector<Tkb>();
        try{
            String line;
            br =new BufferedReader(new FileReader(address));
            line = br.readLine();
            while ((line = br.readLine()) != null) {
                Tkb temp;
                ArrayList<String> chuoi = parseCsvLine(line);
                TkbId Id=new TkbId("",chuoi.get(1));
                temp=new Tkb(Id,chuoi.get(2),chuoi.get(3));
                a.addElement(temp);
            }
        }catch (IOException e)
        {
            e.printStackTrace();
        } finally {
            try{
                if (br!=null)
                    br.close();
            }
            catch (IOException e)
            {
                e.printStackTrace();;
            }
        }
        return a;
    }
    public Vector<LopDssv> readCsvFileDiem(String address,String MaLop,String MaMon)
    {
        BufferedReader br=null;
        Vector<LopDssv> a = new Vector<LopDssv>();
        try{
            String line;
            br =new BufferedReader(new FileReader(address));
            line = br.readLine();
            while ((line = br.readLine()) != null) {
                LopDssv temp;
                ArrayList<String> chuoi = parseCsvLine(line);
                LopDssvId Id=new LopDssvId(MaLop,MaMon,chuoi.get(1));
                temp=new LopDssv(Id,Integer.valueOf(chuoi.get(3)),Integer.valueOf(chuoi.get(4)),Integer.valueOf(chuoi.get(5)),Double.valueOf(chuoi.get(6)));
                a.addElement(temp);
            }
        }catch (IOException e)
        {
            e.printStackTrace();
        } finally {
            try{
                if (br!=null)
                    br.close();
            }
            catch (IOException e)
            {
                e.printStackTrace();;
            }
        }
        return a;
    }
}
