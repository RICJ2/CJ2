/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package loginscreen;

/**
 *
 * @author ChrisO
 */
//class Mediator {
//    Diction dict;
//
//   public Mediator(){}
//
//
//    public String getPassword(String value){
//            Student s = dict.get(value);
//            return s.getPassword();
//        }
//
//    public Boolean verifyLogin(String un, String pw){
//        return (pw.equals(getPassword(un)));
//    }

import java.sql.*;
import javax.swing.*;

class Mediator_backup{

Connection conn = null;
    public static Connection ConnectDb(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
             Connection conn = DriverManager.getConnection("jdbc:mysql://www.savianconsultants.com:3306/savianconsultants_com_2","a0000a6f_1","century4last" );
            JOptionPane.showMessageDialog(null, "Connection Established");
            return conn;
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
