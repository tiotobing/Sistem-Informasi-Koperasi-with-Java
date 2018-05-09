/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplikasi;

/**
 *
 * @author ITD_Stu
 */
import com.mysql.jdbc.Connection;
import java.sql.*;
import javax.swing.JOptionPane;

public class koneksi {
Connection conn;
Statement st;
ResultSet rs; 
public void setkoneksi()
{
    try
    {
        Class.forName("com.mysql.jdbc.Driver");
        conn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/dbkoperasi","root","");       
        st=conn.createStatement();
    }
    catch(Exception e)
    {
        JOptionPane.showMessageDialog(null,"<Error> Koneksikan Xampp Terlebih Dahulu : "+e,"Koneksi Gagal",JOptionPane.WARNING_MESSAGE);
    }

}

    void setdbkoper() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
