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

   public Mediator(){}

//    public static String verifyLogin(String un, String pw){
//        String result = "";
//        String user_query = "select * from users where login_Name = ?";
//        try {
//            PreparedStatement prestmt = DataB.openConnectDb().prepareStatement(user_query);
//            prestmt.setString(1, un);
//            ResultSet rs = prestmt.executeQuery();
//            
//            if (rs.next()) {
//                if (rs.getString("login_Name").matches(un) && (rs.getString("pword").matches(pw))) {
//                    JOptionPane.showMessageDialog(null, "Hello, " + rs.getString("f_Name") + " " + rs.getString("l_Name"));
//                    result = "valid";
//                }
//                else {result = "invalidPassword";}
//                }
//            else{result = "invalidUsername";}
//        }
//        catch (SQLException e) {
//            JOptionPane.showMessageDialog(null, e);
//            result = null;
//        }
//        DataB.closeConnectDb();
//        return result;
//    }
    
    public static String verifyLogin2(String un, String pw){
        String result = Student.getPassword(un);
        if(result.equals(pw)){
            return "valid";}
        if(result.equals("notFound")){
            return "invalidUsername";}
        else {return "invalidPassword";}
    }
}