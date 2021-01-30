
package persistenciadatos;

import gui.MainGUI;


/**
 *
 * @author Ivan Segovia Sanz
 */

public class PersistenciaDatos {
    
    // Invoca al GUI
    private static void lanzarGUI() { java.awt.EventQueue.invokeLater(() -> { new MainGUI().setVisible(true); }); }
    
    public static void main(String[] args) {
        lanzarGUI();
    }
    
}
