/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package casopractico2;

/**
 *
 * @author David
 */
public class CasoPractico2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Cancion cancion = new Cancion(1, "Dont Cry", "Guns and Roses", 5.14, 1991);

        //Se llaman a los getters   
        System.out.println("ID de la Cancion: " + cancion.getIdCancion());
        System.out.println("Titulo: " + cancion.getTitulo());
        System.out.println("Autor: " + cancion.getAutor());
        System.out.println("Duracion: " + cancion.getDuracion());
        System.out.println("Anio de Creacion: " + cancion.getAnoCreacion());

        // Se llaman a los setters
        cancion.setIdCancion(2);
        cancion.setTitulo("Dont Cry");
        cancion.setAutor("Guns and Roses");
        cancion.setDuracion(4.23);
        cancion.setAnoCreacion(2017);

        // Se muestran los valores
        System.out.println("ID de la Cancion: " + cancion.getIdCancion());
        System.out.println("Titulo: " + cancion.getTitulo());
        System.out.println("Autor: " + cancion.getAutor());
        System.out.println("Duracion: " + cancion.getDuracion());
        System.out.println("Anio de Creacion: " + cancion.getAnoCreacion());

    }
    
}
