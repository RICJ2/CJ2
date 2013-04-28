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
   
	public ArrayList fillDragNDrop(String step, String loginN, Connection conn){
		ArrayList<String> folderClasses = new ArrayList();	
		String user_query = "SELECT courses.course_id , courses.course_title, courses.cr_hours, dd.course_series FROM degree_details as dd left join courses on dd.course_degID = courses.id_number left join degree_prog on dd.degree_progID = degree_prog.iddegree_prog where course_series ='171'";
		try{						
			prestmt = conn.prepareStatement(user_query);
			rs = prestmt.executeQuery();
			while (rs.next()) {						
					folderClasses.add(rs.getString("course_id")+"   "+ rs.getString("course_title")+"   "+rs.getString("courses.cr_hours")+"cr");				
			}
		}			
		catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e);
		}
		return folderClasses;	
	}					
	
	public ArrayList fillDragNDrop2(String step, String loginN, Connection conn){
		ArrayList<String> folderClasses2 = new ArrayList();		 	
		String user_query = "SELECT courses.course_id , courses.course_title, courses.cr_hours, dd.course_series FROM degree_details as dd left join courses on dd.course_degID = courses.id_number left join degree_prog on dd.degree_progID = degree_prog.iddegree_prog where course_series ='172'";
		try{				
			prestmt = conn.prepareStatement(user_query);
			rs = prestmt.executeQuery();
			while (rs.next()) {						
				folderClasses2.add(rs.getString("course_id")+"   "+ rs.getString("course_title")+"   "+rs.getString("courses.cr_hours")+"cr");			
			}				
		}
		catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e);
		}
		return folderClasses2;	
	}
	
	public ArrayList fillDragNDrop3(String step, String loginN, Connection conn){
		ArrayList<String> folderClasses2 = new ArrayList();		 	
		String user_query = "SELECT courses.course_id , courses.course_title, courses.cr_hours, dd.course_series FROM degree_details as dd left join courses on dd.course_degID = courses.id_number left join degree_prog on dd.degree_progID = degree_prog.iddegree_prog where course_series ='173'";
		try{				
			prestmt = conn.prepareStatement(user_query);
			rs = prestmt.executeQuery();
			while (rs.next()) {						
				folderClasses2.add(rs.getString("course_id")+"   "+ rs.getString("course_title")+"   "+rs.getString("courses.cr_hours")+"cr");			
			}				
		}
		catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e);
		}
		return folderClasses2;	
	}
	
	public ArrayList fillDragNDrop4(String step, String loginN, Connection conn){
		ArrayList<String> folderClasses2 = new ArrayList();		 	
		String user_query = "SELECT courses.course_id , courses.course_title, courses.cr_hours, dd.course_series FROM degree_details as dd left join courses on dd.course_degID = courses.id_number left join degree_prog on dd.degree_progID = degree_prog.iddegree_prog where course_series ='174'";
		try{				
			prestmt = conn.prepareStatement(user_query);
			rs = prestmt.executeQuery();
			while (rs.next()) {						
				folderClasses2.add(rs.getString("course_id")+"   "+ rs.getString("course_title")+"   "+rs.getString("courses.cr_hours")+"cr");			
			}				
		}
		catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e);
		}
		return folderClasses2;	
	}
        
        public static boolean prereqVerify (String d, ArrayList cl){
           boolean verified = true;
           if (d.equals("MATH_436   Discrete Mathematics   3cr")){
               String prereq = "MATH_212   Calculus I   4cr";
               verified = cl.contains(prereq);
           }
            return verified;
        }
}