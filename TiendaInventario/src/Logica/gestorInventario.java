
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
    
    public void ModificarProducto(int id){
        for (Producto update : producto) {
            System.out.println("¿que desa actualizar? ¿precio o inventario?");
            String op=p1.next();
            
            if ("precio".equalsIgnoreCase(op)) {
                System.out.println("Ingrese el precio");
                double precio = p1.nextDouble();
                update.setPrecio(precio);
            }else if("inventario".equalsIgnoreCase(op)){
                System.out.println("Actualizar el inventario");
                int inventario = p1.nextInt();
                update.setCantidadInventario(inventario);
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
            System.out.println("no hay producto para eliminar");
        }else{
            System.out.println("producto eliminado");
        }
    }
    
    public void BuscarProducto(String nombre){
        boolean encontrado = false;
        for (Producto buscar : producto) {
            if (buscar.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("Id del producto:" +buscar.getID()+"\n"+
                                   "nombre del producto: "+buscar.getNombre()+"\n"+
                                   "precio del producto: " + buscar.getPrecio()+"\n"+
                                   "cantidad del producto: "+buscar.getCantidadInventario());
                encontrado= true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontro el producto.");
        }
    }
    
    public void Informacion(){
        System.out.println("Informe de los productos");
        for (Producto Info : producto) {
            Info.Informacion();
        }
    }
    
}
