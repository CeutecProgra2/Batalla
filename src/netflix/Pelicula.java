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
public class Pelicula extends Contenido {
    private double duracion;

    public Pelicula(String nombre, String clasificacion, double duracion) {
        super(nombre,clasificacion);
        this.duracion = duracion;
    }
    
    public double getDuracion() {
        return duracion;
    }

    @Override
    public void imprimir() {
        System.out.println("Pelicula: " + this.getNombre() + " duración: " + this.getDuracion() + " clasificación: "+ this.getClasificacion());
    }

    @Override
    public void reproducir() {
        System.out.println("Reproduciendo " + this.getNombre());
    }

    @Override
    public void pausar() {
         System.out.println("Pausando " + this.getNombre());
    }

    @Override
    public void detener() {
         System.out.println("Deteniendo " + this.getNombre());
    }
}
