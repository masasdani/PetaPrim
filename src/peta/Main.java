/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package peta;

import com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import peta.gui.FramePeta;

/**
 *
 * @author badak
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            UIManager.setLookAndFeel(new NimbusLookAndFeel());
        }catch(UnsupportedLookAndFeelException e){
            System.out.println(e.getMessage());
        }
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                FramePeta peta=new FramePeta();
                peta.setLocationRelativeTo(null);
                peta.setVisible(true);
            }
        });
    }
}
