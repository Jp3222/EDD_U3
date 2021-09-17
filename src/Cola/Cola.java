package Cola;

public class Cola<T> {

    private Nodo<T> inicio, fin;
    private int size;

    public Cola() {
        this.inicio = null;
        this.fin = null;
        this.size = 0;
    }

    private boolean isEmpty() {
        return inicio == null;
    }

    public void add(T dato) {
        Nodo<T> nuevo = new Nodo<>(dato);
        if (isEmpty()) {
            inicio = nuevo;
            fin = nuevo;
        }
        fin.setSig(nuevo);
        fin = fin.getSig();
        size++;
    }

    public T remove() {
        T aux = inicio.getDato();
        inicio = inicio.getSig();
        size--;
        return aux;
    }

    public T getInicio() {
        return inicio.getDato();
    }

    public T getFin() {
        return fin.getDato();
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        Nodo<T> aux = inicio;
        String r = "[";
        while (aux != null) {
            r += aux.toString() + ",";
            aux = aux.getSig();
        }
        return r.substring(0, r.length() - 1) + "]";
    }

}
