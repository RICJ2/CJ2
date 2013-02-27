/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package loginscreen;

//import java.sql.DriverManager;

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

    public Student()
    {}

    public static String getFirstName(String loginN){
        String result = "";
        String user_query = "select * from users where login_Name = ?";
        try {
            prestmt = DataB.openConnectDb().prepareStatement(user_query);
            prestmt.setString(1, loginN);
            rs = prestmt.executeQuery();
            if (rs.next()) {result = rs.getString("f_Name");}
            else{result = "notFound";}}
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            result = null;}
        DataB.closeConnectDb();
        return result;
    }

    public static String setFirstName(String loginN, String get){
    return DataB.query(loginN, "firstName", "users");}

    public static String getPassword(String loginN){
        String result = "";
        String user_query = "select * from users where login_Name = ?";
        try {
            prestmt = DataB.openConnectDb().prepareStatement(user_query);
            prestmt.setString(1, loginN);
            rs = prestmt.executeQuery();
            if (rs.next()) {result = rs.getString("pword");}
            else{result = "notFound";}}
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            result = null;}
        DataB.closeConnectDb();
        return result;
    }

    public static String setPassword(String loginN){
      return DataB.query(loginN, "pword", "users");}

    public static String getLastName(String loginN){
        String result = "";
        String user_query = "select * from users where login_Name = ?";
        try {
            prestmt = DataB.openConnectDb().prepareStatement(user_query);
            prestmt.setString(1, loginN);
            rs = prestmt.executeQuery();
            if (rs.next()) {result = rs.getString("l_name");}
            else{result = "notFound";}}
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            result = null;}
        DataB.closeConnectDb();
        return result;
    }

    public static String setLastName(String loginN){
        return DataB.query(loginN, "LastName", "users");}

}
