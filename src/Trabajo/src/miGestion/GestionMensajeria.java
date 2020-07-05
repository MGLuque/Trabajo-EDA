/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miGestion;

import ArchivosColas.ArrayCola;
import MisClases.ClienteCorporativo;
import MisClases.Comprobante;

/**
 *
 * @author andhi
 */
public class GestionMensajeria {
    private float Recaudacion;
    private ArrayCola<ClienteCorporativo> ColaClientes;
    private int encom;
    private int giro;

    public GestionMensajeria() {
        Recaudacion=0.0f;
        ColaClientes= new ArrayCola<ClienteCorporativo>();
        encom=0;
        giro=0;
    }

    public float getRecaudacion() {
        return Recaudacion;
    }

    public ArrayCola getCliente() {
        return ColaClientes;
    }

    public int getEncom() {
        return encom;
    }

    public int getGiro() {
        return giro;
    }

    
    public void encolarCliente(ClienteCorporativo C){
        
        ColaClientes.encolar(C);
    }
    /*public String nombreget(){
        String nombre=ColaClientes.desencolar().getNombre();
        
        return nombre;
    }*/
    public void ReporteRecaudacion(){
        ArrayCola<ClienteCorporativo> CAUX=new ArrayCola<ClienteCorporativo>();
        //int giro=0;
        //int encom=0;
        while(ColaClientes.colaVacia()==false){
            ClienteCorporativo C=ColaClientes.desencolar();
            Comprobante x=C.DesapilarComprobante();
            Recaudacion+=x.getMonto();
            if(x.getTipo().equalsIgnoreCase("Giro")){
                giro+=x.getMonto();
            }
            else if(x.getTipo().equalsIgnoreCase("Encomienda")){
                encom+=x.getMonto();
            }
            /*C.ApilarComprobante(x);
            CAUX.encolar(C);
            C.DesapilarComprobante();
        }
        while(CAUX.colaVacia()==false){
            ClienteCorporativo C=CAUX.desencolar();
            ColaClientes.encolar(C);
        }*/
        }
    }
    
    public ArrayCola<ClienteCorporativo> verColaClientes(){
        ArrayCola<ClienteCorporativo> cAux1=new ArrayCola<ClienteCorporativo>();
        ArrayCola<ClienteCorporativo> cAux2=new ArrayCola<ClienteCorporativo>();
        
        while(ColaClientes.colaVacia()==false){
            ClienteCorporativo c=ColaClientes.desencolar();
            cAux1.encolar(c);
            cAux2.encolar(c);
        }
        while(cAux1.colaVacia()==false){
            ColaClientes.encolar(cAux1.desencolar());
        }
        
        return cAux2;
    }
    /*public int MontoTipoG(){
        int giro=0;
        ArrayCola<ClienteCorporativo> CAUX=new ArrayCola<ClienteCorporativo>();
         while(ColaClientes.colaVacia()==false){
            ClienteCorporativo C=ColaClientes.desencolar();
            Comprobante x=C.DesapilarComprobante();
            if(x.getTipo().equalsIgnoreCase("Giro")){
                giro+=x.getMonto();
            }
            C.ApilarComprobante(x);
            CAUX.encolar(C);
            C.DesapilarComprobante();
        }
         while(CAUX.colaVacia()==false){
            ClienteCorporativo C=CAUX.desencolar();
            ColaClientes.encolar(C);
        }
         return giro;
    }
    public int MontoTipoE(){
        int encom=0;
        ArrayCola<ClienteCorporativo> CAUX=new ArrayCola<ClienteCorporativo>();
         while(ColaClientes.colaVacia()==false){
            ClienteCorporativo C=ColaClientes.desencolar();
            Comprobante x=C.DesapilarComprobante();
            if(x.getTipo().equalsIgnoreCase("Encomienda")){
                encom+=x.getMonto();
            }
            C.ApilarComprobante(x);
            CAUX.encolar(C);
            C.DesapilarComprobante();
        }
         while(CAUX.colaVacia()==false){
            ClienteCorporativo C=CAUX.desencolar();
            ColaClientes.encolar(C);
        }
         return encom;
    }*/
    
    public ClienteCorporativo infoCliente(String nombre){
        ArrayCola<ClienteCorporativo> CAUX=new ArrayCola<ClienteCorporativo>();
        ClienteCorporativo D=ColaClientes.desencolar();
        ColaClientes.encolar(D);
        while(ColaClientes.colaVacia()==false){
            ClienteCorporativo c=ColaClientes.desencolar();
            if(c.getNombre().equalsIgnoreCase(nombre)){
                D=c;
                //System.out.println("Info del cliente: "+c.getNombre()+c.getRazonSocial()+c.getRUC());
                CAUX.encolar(c);
                //break;
            }
            else{
                CAUX.encolar(c);
            }
        }
        while(CAUX.colaVacia()==false){
            ClienteCorporativo c=CAUX.desencolar();
            ColaClientes.encolar(c);
        }
        return D;
    }
}
