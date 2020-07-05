package ArchivosColas;

import javax.swing.JOptionPane;

public class ArrayCola<E> implements Cola<E>{
    private static final int TAM=50;
    private E []arC;
    private int frentec,finalc;

    public ArrayCola() {
        arC=(E[])new Object[TAM];
        frentec=-1;
        finalc=-1;
    }
    //reglas de negocio
    public boolean colaVacia(){
        return (frentec==-1 && finalc==-1);
    }
    public boolean colaLlena(){
        return ((frentec==0 && finalc==TAM-1) || frentec==finalc+1);
    }
    public void encolar(E x){        
        if(colaLlena()==false){
            if(colaVacia()==true){
                frentec=0;
            }
            if(finalc==TAM-1){
                    finalc=0;
             }else{
                    finalc++;
             }
            arC[finalc]=x;
          }else{
            JOptionPane.showMessageDialog(null, "Cola llena ...");        
        }    
    }
    
    public E desencolar(){
        E elemSacado=arC[frentec];
        
        if(frentec==finalc){
            frentec=-1;
            finalc=-1;
        }else{
            if(frentec==TAM-1){
                frentec=0;
            }else{
                frentec++;
            }
        }       
        return elemSacado;
    }
    
    public E frenteC(){
        return arC[frentec];
    }
    
    
    
}
