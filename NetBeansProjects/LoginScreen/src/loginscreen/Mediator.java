/*UPDATED BY JOHN DIXON THIS COMMENT LINE ONLY FOR TEST PURPOSES 02/19/2013 11:50PM
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package loginscreen;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author ChrisO
 */
class Mediator {
    String loginName;
    LoginScreenForm log = new LoginScreenForm(this);
    CreateAccount acc = new CreateAccount(this);
    StartupScreen start;
    
   public Mediator(){
       log.setVisible(true);
   }

   public void newCreateAccountPage(){
       acc.setVisible(true);
       log.setVisible(false);
       
   }
   
   public void createStartupScreen(String ln){
       loginName = ln;
       start = new StartupScreen(this, ln);
       start.setVisible(true);
       log.setVisible(false);
   }
   
    public void createLoginScreen(){
       log.setVisible(true);
       acc.setVisible(false);
   }
   
   public static String verifyLogin2(String un, String pw){
        String result = Student.getPassword(un);
        if(result.equals(pw)){
            return "valid";}
        if(result.equals("notFound")){
            return "invalidUsername";}
        else {return "invalidPassword";}
    }
}