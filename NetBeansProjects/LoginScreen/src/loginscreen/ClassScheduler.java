/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package loginscreen;

/**
 *
 * @author jroberti
 */
public class ClassScheduler {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mediator mid = new Mediator();
        LoginScreenForm log = new LoginScreenForm(mid);
        log.setVisible(true);
    }
}
