
package persistenciadatos.Stream;

import java.io.Serializable;

/**
 *
 * @author Ivan Segovia Sanz
 */

public class Contacto implements Serializable {
    String nombre;
    String telf;

    public Contacto(String nombre, String telf) {
        this.nombre = nombre;
        this.telf = telf;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelf() {
        return telf;
    }

    public void setTelf(String telf) {
        this.telf = telf;
    }

    @Override
    public String toString() {
        return "Contacto{" + "nombre=" + nombre + ", telf=" + telf + '}';
    }
    
}
