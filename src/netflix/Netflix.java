/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package netflix;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author cvare
 */
public class Netflix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Contenido> listaDeContenido = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        Pelicula pelicula = new Pelicula("Deadpool", "18+", 100);
        Serie serie = new Serie("Friends", "todo publico", 1);
        serie.agregarEpisodio(30, "Piloto");
        
        listaDeContenido.add(pelicula);
        listaDeContenido.add(serie);
        
        int opcion = 0;
        do{
             System.out.println("1). Reproducir");
             System.out.println("2). Pausar");
             System.out.println("3). Detener");
             System.out.println("4). Imprimir");
             System.out.println("5). Salir");
             System.out.print("Elija una opcion:");
             opcion = sc.nextInt();
             
             switch(opcion){
                 case 1:
                     System.out.println("Elija el contenido a reproducir");
                     imprimirContenido(listaDeContenido);
                     System.out.print("Opcion: ");
                     int cont = sc.nextInt();
                     ReproducirElemento(cont, listaDeContenido);
                     break;
                 case 2:
                      System.out.println("Elija el contenido a pausar");
                      imprimirContenido(listaDeContenido);
                      System.out.print("Opcion: ");
                      cont = sc.nextInt();
                      PausarElemento(cont, listaDeContenido);
                     break;
                 case 3:
                      System.out.println("Elija el contenido a detener");
                      imprimirContenido(listaDeContenido);
                      System.out.print("Opcion: ");
                      cont = sc.nextInt();
                      DetenerElemento(cont, listaDeContenido);
                     break;
                 case 4:
                      System.out.println("Elija el contenido a imprimir");
                      imprimirContenido(listaDeContenido);
                      System.out.print("Opcion: ");
                      cont = sc.nextInt();
                      ImprimirElemento(cont, listaDeContenido);
                     break;
             }
        }while(opcion != 5);
       
        
    }
    
    public static void imprimirContenido(ArrayList<Contenido> elementos){
        for (int i = 0; i < elementos.size(); i++) {
            System.out.println(i+") " + elementos.get(i).getNombre());
        }
    }
    
    public static void ReproducirElemento(int posicion, ArrayList<Contenido> elementos){
         elementos.get(posicion).reproducir();
    }
    
    public static void PausarElemento(int posicion, ArrayList<Contenido> elementos){
         elementos.get(posicion).pausar();
    }
     
    public static void DetenerElemento(int posicion, ArrayList<Contenido> elementos){
         elementos.get(posicion).detener();
    }
     
    public static void ImprimirElemento(int posicion, ArrayList<Contenido> elementos){
         elementos.get(posicion).imprimir();
    }
    
}
