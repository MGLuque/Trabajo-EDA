/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MisClases;


/**
 *
 * @author andhi
 */
public class Comprobante {
    private String tipo;
    private String ciudadO;
    private String ciudadD;
    private String fecha;
    private int monto;

    public Comprobante(String tipo, String ciudadO, String ciudadD, int monto,String fecha) {
        this.tipo = tipo;
        this.ciudadO = ciudadO;
        this.ciudadD = ciudadD;
        this.monto = monto;
        this.fecha = fecha;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCiudadO() {
        return ciudadO;
    }

    public void setCiudadO(String ciudadO) {
        this.ciudadO = ciudadO;
    }

    public String getCiudadD() {
        return ciudadD;
    }

    public void setCiudadD(String ciudadD) {
        this.ciudadD = ciudadD;
    }

    public String getFecha() {
        return fecha;
    }

 
    public float getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }
    
    
}
