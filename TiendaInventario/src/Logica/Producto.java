
package Logica;

import javax.swing.JOptionPane;

public class Producto {
    //campos
    private int ID;
    private String nombre;
    private double precio;
    private int CantidadInventario;
    
    //constructor
    public Producto(int ID, String nombre, double precio, int CantidadInventario) {
        this.ID = ID;
        this.nombre = nombre;
        this.precio = precio;
        this.CantidadInventario = CantidadInventario;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
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

    public int getCantidadInventario() {
        return CantidadInventario;
    }

    public void setCantidadInventario(int CantidadInventario) {
        this.CantidadInventario = CantidadInventario;
    }
    
    public void Informacion(){
        JOptionPane.showMessageDialog(null, 
                "Id del producto" + ID+"\n"+
                "Producto "+ nombre+"\n"+ 
                "Precio "+ precio+"\n"+
                "Stock "+ CantidadInventario);
    }
    
}
