/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package loginscreen;
import java.sql.*;
/**
 *
 * @author jroberti
 */

public class ClassScheduler {
	Connection conn = null;
    Connection Conn = null;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ConnectDb();
        //Mediator mid = new Mediator(Conn);
        LoginScreenForm log = new LoginScreenForm();
        log.setVisible(true);
    }
	
	public static void ConnectDb(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            DriverManager.getConnection("jdbc:mysql://www.savianconsultants.com:3306/savianconsultants_com_2","a0000a6f_1","century4last" );
            //JOptionPane.showMessageDialog(null, "Connection Established");
            //return conn;
        }catch (Exception e){
            //JOptionPane.showMessageDialog(null, e);
            //return null;
        }
}
}

