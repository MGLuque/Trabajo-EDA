/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MisClases;

import ArchivosPilas.ArrayPila;

/**
 *
 * @author andhi
 */
public class ClienteCorporativo {
    private String nombre;
    private int RUC;
    private String razonSocial;
    private ArrayPila<Comprobante> lista;

    public ClienteCorporativo(String nombre,int RUC, String razonSocial) {
        this.nombre=nombre;
        this.RUC = RUC;
        this.razonSocial = razonSocial;
        lista=new ArrayPila<Comprobante>();
    }

    public String getNombre() {
        return nombre;
    }  
    public int getRUC() {
        return RUC;
    }
    public String getRazonSocial() {
        return razonSocial;
    }

    public ArrayPila getLista() {
        return lista;
    }

   
    public void ApilarComprobante(Comprobante C){
        lista.apilar(C);
    }
    public Comprobante DesapilarComprobante(){
        return lista.desapilar();
    }
}
