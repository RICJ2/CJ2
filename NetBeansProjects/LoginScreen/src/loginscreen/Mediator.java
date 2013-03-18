/*UPDATED BY JOHN DIXON THIS COMMENT LINE ONLY FOR TEST PURPOSES 02/19/2013 11:50PM
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package loginscreen;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author ChrisO
 */
class Mediator {
    static Connection conn;
    String loginName;
    LoginScreenForm log = new LoginScreenForm(this);
    CreateAccount acc;
    StartupScreen start;
    
    
   public Mediator(){
       log.setVisible(true);
       conn = DataB.openConnectDb();
   }

   public void newCreateAccountPage(){
       acc = new CreateAccount(this, conn);
       acc.setVisible(true);
       log.setVisible(false);
       
   }
   
   public void createStartupScreen(String ln){
       loginName = ln;
       start = new StartupScreen(this, ln, conn);
       start.setVisible(true);
       log.setVisible(false);
   }
   
    public void createLoginScreen(){
       log.setVisible(true);
       acc.setVisible(false);
   }
   
   public static String verifyLogin2(String un, String pw){
        String result = Student.getPassword(un, conn);
        if(result.equals(pw)){
            return "valid";}
        if(result.equals("notFound")){
            return "invalidUsername";}
        else {return "invalidPassword";}
    }
}