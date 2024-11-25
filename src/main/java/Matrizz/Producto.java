
package Matrizz;


public class Producto {
    private String nombre;
    private double precio;
    private Integer carrera;
    private Integer cantidad;

    public Producto(String nombre, double precio, Integer cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
    
    public void mostrarInfo(){
    System.out.printf("%-15s | $%-8.2f | %d unidades\n", nombre, precio, cantidad);
    }
    
}
