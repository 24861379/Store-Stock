
package Logica;



public class Producto {
    //se crean la varibles, estas se encapsulan con la palabra clave private
    private int ID;
    private String nombre;
    private double precio;
    private int CantidadInventario;
    
    //constructor
    //creamos el contructor en el que inicializamos el objeto y asignamos los valores
    public Producto(int ID, String nombre, double precio, int CantidadInventario) {
        this.ID = ID;
        this.nombre = nombre;
        this.precio = precio;
        this.CantidadInventario = CantidadInventario;
    }
    
    //Métodos getter y setter
    //con get podemos obtener el valor de cada variable
    //y con set acutualizamos el valor antes definido
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
    
    //este metodo lo usamos para mostrar los mensejes
    public void Informacion(){
        System.out.println("----------------------------");
        System.out.println("Id del producto: " + ID + "\n"+
                           "Producto: "+ nombre+"\n"+
                           "Precio: "+ precio+"\n"+
                           "Stock: "+ CantidadInventario);
        System.out.println("-----------------------------");
    }
    
}
