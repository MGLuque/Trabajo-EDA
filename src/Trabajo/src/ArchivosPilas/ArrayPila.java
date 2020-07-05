package ArchivosPilas;

import MisClases.Comprobante;

public class ArrayPila<E> implements Pila{
    private static final int TAMPILA=50;
    private E []p;
    private int cima;

    public ArrayPila() {
        p=(E[])new Object[TAMPILA];
        cima=-1;
    }
    
    
    //operación pila vacía
    public boolean pilaVacia(){
        boolean estado=false;
        
        if(cima==-1){
            estado=true;
        }
        return estado;        
    }
    //operación pila Llena
    public boolean pilaLlena(){
        boolean estado=false;
        
        if(cima==TAMPILA-1){
            estado=true;
        }
        return estado;
    }
    
    //operación apilar
    
    //operación desapilar
    public E desapilar(){
        
        E elemSacado=p[cima];
        cima=cima-1;    //cima--;
        return elemSacado;
    }
    
    //operación de apoyo, para mostrar el contenido de la pila
    
    public void verPila(){
        // no se puede modificar los elementos de pila
        
        ArrayPila pAux=new ArrayPila();
        
        while(pilaVacia()==false){
            E x=desapilar();
            System.out.println(x);
            pAux.apilar(x);
        }
        
        while(pAux.pilaVacia()==false){
            E y=(E) pAux.desapilar();
            apilar(y);
        }      
    }

  
    public void apilar(E item){
        
        if(pilaLlena()==false){
            cima=cima+1;
            p[cima]=item;
            
        }
    }
    
}
