
package persistenciadatos.Stream;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Ivan Segovia Sanz
 */

public class Agenda implements Serializable {
    ArrayList<Contacto> lista = new ArrayList();

    public Agenda() {
    }
    
    public ArrayList<Contacto> getAgenda() {
        return lista;
    }

    public void setAgenda(ArrayList<Contacto> lista) {
        this.lista = lista;
    }
    
}
