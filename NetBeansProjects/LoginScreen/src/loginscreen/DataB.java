/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package loginscreen;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author ChrisO
 */
public class DataB {
    
    static Connection conn = null;
    
    public DataB()
    {}  
   
    public static Connection openConnectDb(){       
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://www.savianconsultants.com:3306/savianconsultants_com_2","a0000a6f_1","century4last" );
            JOptionPane.showMessageDialog(null, "Connection Established");
            return conn;
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;}}
    
    
    public static void closeConnectDb(){
        try{
            conn.close();}
        catch (Exception e){
            JOptionPane.showMessageDialog(null, e);}}
    
    public static String query(String loginN, String get, String from){
        Connection conn = DataB.openConnectDb();
        String sql = "SELECT " + get + " FROM " + from + " WHERE id=" + loginN;
        System.out.println(sql);
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                String results = rs.getString(get);
                return results;
            }
            else {
                JOptionPane.showMessageDialog(null, "" + get + " does not exist in " + from + ".");
                return null;
                }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }}
}
