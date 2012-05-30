/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bashviajava;

import com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author NUSNAFIF
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            //UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            UIManager.setLookAndFeel(new NimbusLookAndFeel());
            java.awt.EventQueue.invokeLater(new Runnable() {
                @Override
                public void run() {
                    new BashViaJava().setVisible(true);
                }
            });
        } catch (UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        }        
        
    }
}
