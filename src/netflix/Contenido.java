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
public abstract class Contenido implements IReproducible {
  private String nombre;
  private String clasificacion;

    public Contenido(String nombre, String clasificacion) {
        this.nombre = nombre;
        this.clasificacion = clasificacion;
    }
  
    public void imprimir(){
        System.out.println("Contenido");
    }

    public String getNombre() {
        return nombre;
    }

    public String getClasificacion() {
        return clasificacion;
    }
    
    
  
}
