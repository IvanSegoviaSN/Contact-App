
package persistenciadatos.Stream;

import java.io.IOException;

/**
 *
 * @author Ivan Segovia Sanz
 */

public class GestionDatos {
    private static String r = "contactos.bin";
    
    public static Agenda cargarAgenda() throws ClassNotFoundException, IOException {
        GestionStream gSalida = new GestionStream(r);
        return (Agenda) gSalida.obtenerObj();
    }
    
    public static void guardarAgenda(Object o) throws ClassNotFoundException, IOException {
        GestionStream gEntrada = new GestionStream(r, true);
        gEntrada.insertarTexto(o);
    }
    
    public static void crearAgenda() throws ClassNotFoundException, IOException {
        Agenda a = new Agenda();
        guardarAgenda(a);
    }
    
    public static void crearContacto(String n, String t) throws ClassNotFoundException, IOException {
        Agenda a = cargarAgenda();
        a.lista.add(new Contacto(n, t));
        guardarAgenda(a);
    }
    
    public static void eliminarContacto(String n) throws ClassNotFoundException, IOException {
        Agenda a = cargarAgenda();
        int d = 0;
        
        for (Contacto c : a.lista) {
            if (c.getNombre().equalsIgnoreCase(n)) {
                d = a.lista.indexOf(c);
            }
        }
        
        a.lista.remove(d);
        guardarAgenda(a);
    }
    
    public static void demoData() {
        if (r.startsWith("c", 0)) {
            r = "demo.bin";
        } else {
            r = "contactos.bin";
        }
    }
}
