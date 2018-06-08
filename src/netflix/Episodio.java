/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package netflix;

/**
 *
 * @author cvare
 */
public class Episodio {
    private double duracion;
    private String nombre;

    public Episodio(double duracion, String nombre) {
        this.duracion = duracion;
        this.nombre = nombre;
    }
    
    public double getDuracion() {
        return duracion;
    }

    public String getNombre() {
        return nombre;
    }
    
    
}
