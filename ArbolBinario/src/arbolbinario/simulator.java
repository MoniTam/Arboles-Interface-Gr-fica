package arbolbinario;
import arbolbinario.Arbol;
import java.util.ArrayList;
import java.util.LinkedList;
import javax.swing.JPanel;
/**@author TAMAY DE LOS SANTOS MONICA ESTEFANIA*/
public class simulator {
    Arbol miArbol = new Arbol();
    public simulator() {
    }
    public boolean insertar(Integer dato) {
        return (this.miArbol.agregar(dato));
    }
    public String preOrden() {
        LinkedList it = this.miArbol.preOrden();
        return (recorrido(it, "Recorrido PreOrden"));
    }
    public String inOrden() {
        LinkedList it = this.miArbol.inOrden();
        return (recorrido(it, "Recorrido InOrden"));
    }
    public String postOrden() {
        LinkedList it = this.miArbol.postOrden();
        return (recorrido(it, "Recorrido PosOrden"));
    }
    private String recorrido(LinkedList it, String msg) {
        int i = 0;
        String r = msg + "\n";
        while (i < it.size()) {
            r += "\t" + it.get(i).toString() + "";
            i++;
        }
        return (r);
    }
    public JPanel getDibujo() {
        return this.miArbol.getdibujo();
    }
}