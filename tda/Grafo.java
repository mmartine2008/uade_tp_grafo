package tda;

import java.util.ArrayList;
import java.util.List;

public class Grafo<T> {
    private List<T> vertices;
    private List<Arco<T>> arcos;

    public Grafo() {
        this.vertices = new ArrayList<>();
        this.arcos = new ArrayList<>();
    }

    public Grafo<T> GrafoVacio() {
        Grafo<T> nuevo = new Grafo<>();
        return nuevo;
    }

    public void AgregaVertice(T vertice) {
        this.vertices.add(vertice);
    }
    
    @SuppressWarnings("unchecked")
    public void AgregaArco(T origen, T destino) {
        Arco<T> nuevo = new Arco(origen, destino);
        this.arcos.add(nuevo);
    }

    public List<T> ObtenerVertices() {
        return this.vertices;
    }
}

