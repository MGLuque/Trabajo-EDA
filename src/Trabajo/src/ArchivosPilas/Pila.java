package ArchivosPilas;

import MisClases.Comprobante;

public interface Pila<E> {
    boolean pilaVacia();
    boolean pilaLlena();
    //void apilar(E item);
    E desapilar();
    
}
