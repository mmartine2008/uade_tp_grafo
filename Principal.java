import java.util.List;
import tda.Grafo;

@SuppressWarnings("unchecked")
public class Principal {
        public static void main (String [ ] args) {
                System.out.println("UADE - 2024");

                Grafo<String> g = new Grafo();
                g.AgregaVertice("A");
                g.AgregaVertice("B");
                g.AgregaArco("A", "B");

                System.out.println("Vertices del grafo");
                List<String> vertices = g.ObtenerVertices();
                for (int i = 0; i < vertices.size(); i++) {
                        System.out.println(vertices.get(i));
                }
        }    
}
