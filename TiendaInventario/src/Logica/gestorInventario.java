
package Logica;

import java.util.ArrayList;
import java.util.Scanner;


public class gestorInventario {
    Scanner p1 = new Scanner(System.in);
    private ArrayList<Producto> producto;
    
    //constructor
    public gestorInventario() {
        producto = new ArrayList<>();
    }
    
    public void AgregarProducto(Producto Stock){
        producto.add(Stock);
    }
    
    public void ModificarProducto(String nombre){
        double precio;
        int inventario;
        
        for (Producto update : producto) {
            if (update.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("¿Desea actualizar el precio?");
                String opcion= p1.next();
                if (!opcion.equalsIgnoreCase("si") || !opcion.equalsIgnoreCase("no")) {
                    System.out.println("Ingrese si o no");
                }else{
                    if ("si".equalsIgnoreCase(opcion)) {
                        System.out.println("Actualizar el precio.");
                        precio = p1.nextDouble();
                        update.setPrecio(precio);
                    }else{
                        System.out.println("Actualizar inventario.");
                        inventario = p1.nextInt();
                        update.setCantidadInventario(inventario);
                    } 
                }
                
            }
        }
    }
    
    public void EliminarProducto(String nombre){
        ArrayList<Producto> ProductoAEliminar = new ArrayList<>();
        for (Producto borrar : producto) {
            if (borrar.getNombre().equalsIgnoreCase(nombre)) {
                ProductoAEliminar.add(borrar);
            }
        }
        producto.removeAll(ProductoAEliminar);
        
        if (ProductoAEliminar.isEmpty()) {
            System.out.println("Producto eliminado");
        }else{
            System.out.println("No se elimino el producto");
        }
    }
    
    public void BuscarProducto(String nombre){
        for (Producto buscar : producto) {
            if (buscar.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("Id del producto:" +buscar.getID()+"\n"+
                                    "nombre del producto: "+buscar.getNombre()+"\n"+
                                            "cantidad del producto: "+buscar.getCantidadInventario());
            }else{
                System.out.println("no se encotro el nombre del producto.");
            }
        }
    }
    
    public void GenerarInforme(){
        System.out.println("Informe de los productos");
        for (Producto Informe : producto) {
            Informe.Informacion();
        }
    }
    
}
