/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espoch.practicamvc.matriz;

import Matrizz.Producto;

/**
 *
 * @author USUARIO
 */
public class Matriz {

    public static void main(String[] args) {
        
        Producto [][] producto = new Producto[2][3];
        
        producto[0][0]= new Producto("Televisor",300,2);
        producto[0][1]= new Producto("Computadora",1000,1);
        producto[0][2]= new Producto("Moto",4000,4);

        
        producto[1][0]= new Producto("Camion",1500,1);
        producto[1][1]= new Producto("Refrigerador",3800,3);
        producto[1][2]= new Producto("Tablet",300,2);
         
        
        System.out.println("INVENTARIO DE PRODUCTOS: ");
        
        for ( int i = 0; i < producto.length; i++){
            System.out.println("\nCATEGORIA "+ (i + 1)+ ":");
            
            for (int j=0; j < producto[i].length; j++){
            producto[i][j].mostrarInfo();
        }   
        } 
    }
}
