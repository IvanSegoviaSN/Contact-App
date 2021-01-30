
package persistenciadatos.Stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Ivan Segovia Sanz
 */

public class GestionStream {
    private ObjectInputStream in;
    private ObjectOutputStream out;

    // Aprovecho un doble constructor, en funcion de lo que se requiera entra
    // o sale el contenido
    
    
    protected GestionStream(String f) throws FileNotFoundException, IOException {
        in = new ObjectInputStream(new FileInputStream(f));
    }
    
    protected GestionStream(String d, boolean b) throws FileNotFoundException, IOException {
        out = new ObjectOutputStream(new FileOutputStream(d));
    }
    
    protected Object obtenerObj() throws IOException, ClassNotFoundException {
        return (Agenda) this.in.readObject();
    }
    
    protected void insertarTexto(Object o) throws IOException {
        out.writeObject(o);
    }
    
}
