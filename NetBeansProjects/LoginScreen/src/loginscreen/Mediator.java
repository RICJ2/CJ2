/*UPDATED BY JOHN DIXON THIS COMMENT LINE ONLY FOR TEST PURPOSES 02/19/2013 11:50PM
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package loginscreen;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author ChrisO
 */
class Mediator {
    static Connection conn;
    String loginName;
    LoginScreenForm log;
    CreateAccount acc;
    StartupScreen start, start1;
    EditAccount editAcc;
    DragNdrop drag;
    PreparedStatement prestmt;
    ResultSet rs;
    
    
   public Mediator(Connection c){
       conn = c;
       log = new LoginScreenForm(this, conn);
       log.setVisible(true);
       
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
      public void createStartupScreen2(String ln){
       loginName = ln;
       start = new StartupScreen(this, ln, conn);
       start.setVisible(true);
       editAcc.setVisible(false);
   }
   public void reloadStartupScreen(String ln){
       loginName = ln;
	   start1 = start;
	   start = new StartupScreen(this, ln, conn);
       start.setVisible(true);
	   start1.setVisible(false);
   }
   
      public void createEditScreen(){
       editAcc = new EditAccount(this, loginName, conn);
       editAcc.setVisible(true);
       start.setVisible(false);
   }
      // public void createDragNdrop(){
          // drag = new DragNdrop(this, conn);
          // drag.setVisible(true);
          // log.setVisible(false);
      // }
    public void createLoginScreen(){
       log.setVisible(true);
       acc.setVisible(false);
   }
   
   public static String verifyLogin2(String un, String pw, Connection c){
        String result = Student.getPassword(un, c);
        if(result.equals(pw)){
            return "valid";}
        if(result.equals("notFound")){
            return "invalidUsername";}
        else {return "invalidPassword";}
    }
   
	public void logout(Connection c){
       DataB.closeConnectDb();
	   start.setVisible(false);
   }
   
    public void showStartup(){
		start.setVisible(true);
		editAcc.setVisible(false);
	}	
   
    public ArrayList fillCombo(String course1, String course2){
		ArrayList <String> l = new ArrayList ();
        
            String sql = "select * from courses WHERE course_type = 'CSCI' AND course_num >= ? AND course_num <= ?";
        try{ 
            prestmt = conn.prepareStatement(sql);
            prestmt.setString(1, course1);
            prestmt.setString(1, course2);
            rs = prestmt.executeQuery();
            while (rs.next()){
                l.add("CSCI" + rs.getString("course_id") + rs.getString("course_title"));
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return l;
    }
   
	public ArrayList fillDragNDrop(String step, String loginN, Connection conn){
		ArrayList<String> folderClasses = new ArrayList(Arrays.asList("MATH_212", "CSCI_157", "CSCI_201"));
		
	String user_query = "";
		
	//try {
//	prestmt = conn.prepareStatement(user_query);
//        prestmt.setString(1, loginN);
//        rs = prestmt.executeQuery();
//	int i = 0;
//        if (rs.next()) {
//            folderClasses.add(rs.getString("course" + i));
//            i++;
//	}}
//	//else{courseList = "notFound";}}
//        catch (SQLException e) {
//                JOptionPane.showMessageDialog(null, e);
	//}
	return folderClasses;
        }
   
}