/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package loginscreen;

//import java.sql.DriverManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author ChrisO
 */
class Student{
    static PreparedStatement prestmt;
    static ResultSet rs;
    static Connection c;

    public Student()
    {}

    public static String getFullName(String loginN, Connection c){
	String fullName = Student.getFirstName(loginN, c) + " " + Student.getLastName(loginN, c);
	return fullName;
    }

    public static String getFirstName(String loginN, Connection c){
        String result;
        String user_query = "select * from users where login_Name = ?";
        try {
            prestmt = c.prepareStatement(user_query);
            prestmt.setString(1, loginN);
            rs = prestmt.executeQuery();
            if (rs.next()) {result = rs.getString("f_Name");}
            else{result = "notFound";}}
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            result = null;}
        return result;
    }

    public static String getPassword(String loginN, Connection c){
        String result;
        String user_query = "select * from users where login_Name = ?";
        try {
            prestmt = c.prepareStatement(user_query);
            prestmt.setString(1, loginN);
            rs = prestmt.executeQuery();
            if (rs.next()) {result = rs.getString("pword");}
            else{result = "notFound";}}
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            result = null;}
        return result;
    }

    public static void setPassword(String loginN, String password, Connection c){
	String user_query = "update users set pword = ? where login_Name = ?";
        try {
            prestmt = c.prepareStatement(user_query);
            prestmt.setString(1, password);
            prestmt.setString(2, loginN);
            prestmt.executeUpdate();
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public static String getLastName(String loginN, Connection c){
        String result;
        String user_query = "select * from users where login_Name = ?";
        try {
            prestmt = c.prepareStatement(user_query);
            prestmt.setString(1, loginN);
            rs = prestmt.executeQuery();
            if (rs.next()) {result = rs.getString("l_name");}
            else{result = "notFound";}}
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            result = null;}
        return result;
    }

    public static String getMajor(String loginN, Connection c){
        String result;
        String user_query = "select * from users where login_Name = ?";
        try {
            prestmt = c.prepareStatement(user_query);
            prestmt.setString(1, loginN);
            rs = prestmt.executeQuery();
            if (rs.next()) {result = rs.getString("major");}
            else{result = "notFound";}}
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            result = null;}
        return result;
    }

	public static void createAccount(String firstN, String lastN, String major, String semester, String year, String email, String username, String password, String passval, Connection c){
//needed to have String passval added due to the expectation that there are nine(9) parameters but was only passing over 8 and with the select query embedded in the insert it made the problem stand out because of the uniqueness of the insert query. So on the CreateAccount java code I added in the confirmTextField.getText() and I am passing that to the passval. So to sum it up, we can't pass 'password' twice as a unique parameter value we needed to have something unique so I passed the actual password validator field.
            String user_query = "INSERT INTO users (f_name, l_name, login_name, pword, pword_val,major, sem_start, gr_date, s_email)Values(?,?,?,?,?,(SELECT iddegree_prog from degree_prog where degree_desc = ?), ?,?,?)";
       // String user_query = "INSERT INTO users (f_Name, l_Name, login_Name, pword, pword_val, major, sem_start, gr_date, s_email)VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            prestmt = c.prepareStatement(user_query);
            prestmt.setString(1, firstN);
            prestmt.setString(2, lastN);
            prestmt.setString(3, username);
            prestmt.setString(4, password);
            prestmt.setString(5, passval);
            prestmt.setString(6, major);
            prestmt.setString(7, "1");
            prestmt.setString(8, "2013");
            prestmt.setString(9, email);
            prestmt.execute();
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }

        }
}
