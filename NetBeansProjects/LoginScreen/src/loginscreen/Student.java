/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package loginscreen;

//import java.sql.DriverManager;
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import javax.swing.JOptionPane;
/**
 *
 * @author ChrisO
 */
class Student{
    //Connection conn= null;
    private String fName, lName, pWord, query, results;
    private String email, uName, major, semester;

    public Student()
    {}    
        
    public static String getFirstName(String loginN, String get){
    return DataB.query(loginN, "firstName", "user");}
    
    public static String setFirstName(String loginN, String get){
    return DataB.query(loginN, "firstName", "user");}
    
    public static String getPassword(String loginN){
      return DataB.query(loginN, "pword", "users");}
    
    public static String setPassword(String loginN){
      return DataB.query(loginN, "pword", "users");}
    
    public static String getLastName(String loginN){
        return DataB.query(loginN, "LastName", "users");}
    
    public static String setLastName(String loginN){
        return DataB.query(loginN, "LastName", "users");}
    
    
    
    
//    public static String getPassword(String loginN){
//	DataB.openConnectDb();
//        String query = "SELECT passwword FROM users WHERE Id=loginN";
//        //String results = mysql_query(query);
//        DataB.closeConnectDb();
//        return results;
//    }
}
