package Cola;

import java.util.Objects;
import java.util.logging.Logger;
import static java.util.logging.Logger.getLogger;

class Nodo<T> {

    private static final Logger LOG = getLogger(Nodo.class.getName());

    private T dato;
    private Nodo<T> sig;

    Nodo(T dato) {
        this.dato = dato;
        this.sig = null;
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public Nodo<T> getSig() {
        return sig;
    }

    public void setSig(Nodo<T> sig) {
        this.sig = sig;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 43 * hash + Objects.hashCode(this.dato);
        hash = 43 * hash + Objects.hashCode(this.sig);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Nodo<?> other = (Nodo<?>) obj;
        if (!Objects.equals(this.dato, other.dato)) {
            return false;
        }
        return Objects.equals(this.sig, other.sig);
    }

    @Override
    public String toString() {
        return "" + dato;
    }

}
