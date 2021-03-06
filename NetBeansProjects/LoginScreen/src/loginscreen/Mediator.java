/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
//imports of libraries
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
 * @author CJ2
 */
//declarations
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

    //calls loginscreen, and connection to database
    public Mediator(Connection c) {
        conn = c;
        log = new LoginScreenForm(this, conn);
        log.setVisible(true);

    }
    //Calls create account and connects to database

    public void newCreateAccountPage() {
        acc = new CreateAccount(this, conn);
        acc.setVisible(true);
        log.setVisible(false);

    }
    //connection to database is established and uses login name to populate screen

    public void createStartupScreen(String ln) {
        loginName = ln;
        start = new StartupScreen(this, ln, conn);
        start.setVisible(true);
        log.setVisible(false);
    }
    //connection to database is established and startupscreen form is opened
    //edit account visibility is false

    public void createStartupScreen2(String ln) {
        loginName = ln;
        start = new StartupScreen(this, ln, conn);
        start.setVisible(true);
        editAcc.setVisible(false);
    }
    //connection to database is established and startupscreen form is reloaded

    public void reloadStartupScreen(String ln) {
        loginName = ln;
        start1 = start;
        start = new StartupScreen(this, ln, conn);
        start.setVisible(true);
        start1.setVisible(false);
    }
    //connection is established and edit account is visible

    public void createEditScreen() {
        editAcc = new EditAccount(this, loginName, conn);
        editAcc.setVisible(true);
        start.setVisible(false);
    }
    //login screen is visible and create account form is not visible

    public void createLoginScreen() {
        log.setVisible(true);
        acc.setVisible(false);
    }
    //this method assists in validating the initial login of user
    public static String verifyLogin2(String un, String pw, Connection c) {
        String result = Student.getPassword(un, c);
        if (result.equals(pw)) {
            return "valid";
        }
        if (result.equals("notFound")) {
            return "invalidUsername";
        } else {
            return "invalidPassword";
        }
    }
    //allow graceful logout of user
    public void logout(Connection c) {
        DataB.closeConnectDb();
        start.setVisible(false);
    }
    //on startup of program startupscreen is visible
    public void showStartup() {
        start.setVisible(true);
        editAcc.setVisible(false);
    }
    //method calls a query from database to populate the the jtree for the startupscreen form based on the step
    //of the degree program
    public ArrayList fillDragNDrop(String step, String loginN, Connection conn) {
        ArrayList<String> folderClasses = new ArrayList();
        String user_query = "SELECT courses.course_id , courses.course_title, courses.cr_hours, dd.course_series FROM degree_details as dd left join courses on dd.course_degID = courses.id_number left join degree_prog on dd.degree_progID = degree_prog.iddegree_prog where course_series ='171'";
        try {
            prestmt = conn.prepareStatement(user_query);
            rs = prestmt.executeQuery();
            while (rs.next()) {
                folderClasses.add(rs.getString("course_id") + "   " + rs.getString("course_title") + "   " + rs.getString("courses.cr_hours") + "cr");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return folderClasses;
    }
    //method calls a query from database to populate the the jtree for the startupscreen form based on the step
    //of the degree program
    public ArrayList fillDragNDrop2(String step, String loginN, Connection conn) {
        ArrayList<String> folderClasses2 = new ArrayList();
        String user_query = "SELECT courses.course_id , courses.course_title, courses.cr_hours, dd.course_series FROM degree_details as dd left join courses on dd.course_degID = courses.id_number left join degree_prog on dd.degree_progID = degree_prog.iddegree_prog where course_series ='172'";
        try {
            prestmt = conn.prepareStatement(user_query);
            rs = prestmt.executeQuery();
            while (rs.next()) {
                folderClasses2.add(rs.getString("course_id") + "   " + rs.getString("course_title") + "   " + rs.getString("courses.cr_hours") + "cr");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return folderClasses2;
    }
    //method calls a query from database to populate the the jtree for the startupscreen form based on the step
    //of the degree program
    public ArrayList fillDragNDrop3(String step, String loginN, Connection conn) {
        ArrayList<String> folderClasses2 = new ArrayList();
        String user_query = "SELECT courses.course_id , courses.course_title, courses.cr_hours, dd.course_series FROM degree_details as dd left join courses on dd.course_degID = courses.id_number left join degree_prog on dd.degree_progID = degree_prog.iddegree_prog where course_series ='173'";
        try {
            prestmt = conn.prepareStatement(user_query);
            rs = prestmt.executeQuery();
            while (rs.next()) {
                folderClasses2.add(rs.getString("course_id") + "   " + rs.getString("course_title") + "   " + rs.getString("courses.cr_hours") + "cr");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return folderClasses2;
    }
    //method calls a query from database to populate the the jtree for the startupscreen form based on the step
    //of the degree program
    public ArrayList fillDragNDrop4(String step, String loginN, Connection conn) {
        ArrayList<String> folderClasses2 = new ArrayList();
        String user_query = "SELECT courses.course_id , courses.course_title, courses.cr_hours, dd.course_series FROM degree_details as dd left join courses on dd.course_degID = courses.id_number left join degree_prog on dd.degree_progID = degree_prog.iddegree_prog where course_series ='174'";
        try {
            prestmt = conn.prepareStatement(user_query);
            rs = prestmt.executeQuery();
            while (rs.next()) {
                folderClasses2.add(rs.getString("course_id") + "   " + rs.getString("course_title") + "   " + rs.getString("courses.cr_hours") + "cr");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return folderClasses2;
    }
    //prerequisite verification when student selects a class that may or may not
    //be selected for cirriculum
    public static boolean prereqVerify(String d, ArrayList cl) {
        boolean verified = true;
        if (d.equals("MATH_436   Discrete Mathematics   3cr")) {
            String prereq = "MATH_212   Calculus I   4cr";
            verified = cl.contains(prereq);
        }
        return verified;
    }
    //method checks for duplicate course selections
    public static boolean dupCourse(String d, ArrayList cl) {
        boolean dupC;
        dupC = cl.contains(d);
        return dupC;
    }
}