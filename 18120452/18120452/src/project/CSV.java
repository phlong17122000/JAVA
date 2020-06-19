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
    public Vector<Student> readCsvFile(String address)
    {
        BufferedReader br=null;
        Vector<Student> a = new Vector<Student>();
        try{
            String line;
            br =new BufferedReader(new FileReader(address));
            line = br.readLine();
            while ((line = br.readLine()) != null) {
                Student temp;
                ArrayList<String> chuoi = parseCsvLine(line);
                temp=new Student(Integer.valueOf(chuoi.get(0)),chuoi.get(1),chuoi.get(2),chuoi.get(3),chuoi.get(4));
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
        //System.out.print("DOC CSV THANH CONG");
        //for (int i=0;i<a.size();i++)
         //   System.out.print(a.get(i).getName());
        return a;
    }
}
