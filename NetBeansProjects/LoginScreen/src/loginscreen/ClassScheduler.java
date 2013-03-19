/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package loginscreen;

import java.sql.Connection;

/**
 *
 * @author jroberti
 */

public class ClassScheduler {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Connection conn = DataB.openConnectDb();
        Mediator m = new Mediator(conn);
        //LoginScreenForm log = new LoginScreenForm();
        //log.setVisible(true);
    }

}

