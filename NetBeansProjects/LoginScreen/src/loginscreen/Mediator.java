/*UPDATED BY JOHN DIXON THIS COMMENT LINE ONLY FOR TEST PURPOSES 02/19/2013 11:50PM
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package loginscreen;

import javax.swing.JOptionPane;

/**
 *
 * @author ChrisO
 */
class Mediator {

   public Mediator(){}

    public static Boolean verifyLogin(String un, String pw){
        if(un.equals("") | pw.equals("")){
            //JOptionPane.showMessageDialog(null, "No Username Entered.");
            return false;
        }
        else{
        String passW = Student.getPassword(un);
        return (pw.equals(passW)); }}
}
