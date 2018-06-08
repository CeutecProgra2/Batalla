/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package netflix;

import java.util.ArrayList;

/**
 *
 * @author cvare
 */
public class Serie extends Contenido {
    private int cantidadDeTemporadas;
    private ArrayList<Episodio> episodios;
    private int episodioActual;

    public Serie(String nombre, String clasificacion, int cantidadDeTemporadas) {
        super(nombre, clasificacion);
        this.cantidadDeTemporadas = cantidadDeTemporadas;
        this.episodios = new ArrayList<>();
        this.episodioActual = -1;
    }

    public int getCantidadDeTemporadas() {
        return cantidadDeTemporadas;
    }
    
    public void agregarEpisodio(double duracion, String nombre){
        this.episodios.add(new Episodio(duracion, nombre));
    }

    @Override
    public void imprimir() {
        System.out.println("Serie: " + this.getNombre() + " clasificación: "+ this.getClasificacion() + " cantidad de temporadas: " + this.getCantidadDeTemporadas());
    }

    @Override
    public void reproducir() {
        if (this.episodioActual < this.episodios.size()) {
            this.episodioActual++;
        }
        System.out.println("Reproduciendo episodio: " + this.episodios.get(episodioActual).getNombre() + " duración: "+  this.episodios.get(episodioActual).getDuracion());
        
    }

    @Override
    public void pausar() {
         System.out.println("Pausando episodio: " +  this.episodios.get(episodioActual).getNombre() + " duración: "+  this.episodios.get(episodioActual).getDuracion());
    }

    @Override
    public void detener() {
         System.out.println("Deteniendo episodio: " +  this.episodios.get(episodioActual).getNombre() + " duración: "+  this.episodios.get(episodioActual).getDuracion());
    }
    
}
