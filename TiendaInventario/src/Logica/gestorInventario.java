
package Logica;

import java.util.ArrayList;
import java.util.Scanner;


public class gestorInventario {
    Scanner p1 = new Scanner(System.in);
    private ArrayList<Producto> producto;
    
    //en el constructor inicializo el objeto y dentro de este inicializo el ArryList
    public gestorInventario() {
        producto = new ArrayList<>();
    }
    
    //en este método agregamos toda los datos de la clase pabre(Producto) y de Perecedero y NoPerecedero
    public void AgregarProducto(Producto Stock){
        producto.add(Stock);
    }
    
    //En este método usamos un parametro llamado id para preguntarle al usuario que dato desa cambiar
    //si el precio o el inventario
    public void ModificarProducto(int id){
        System.out.println("¿que desa actualizar? ¿precio o inventario?");
            String op=p1.next();
        for (Producto update : producto) {
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
    
    //en este método le pedimos el nombre del producto que quiere eliminar, para eso uso un ArrayList secundario
    //para que guarde todos los productos para uue los elimine esto se logra con .removeAll()
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
    
    //en este método pedimos un parametro nombre con este podemos encontrar el producto y ver todo sus datos
    //con el dato booleano lo que hacer es marcar si si se encotro el producto o no si no se encontro
    //muestra que no se encotro el producto
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
    
    //este método tiene un for each que itera con la variable de la lista producto y con la variable info podemos 
    //traer el método Informacion de la clase padre
    public void Informacion(){
        System.out.println("Informe de los productos");
        for (Producto Info : producto) {
            Info.Informacion();
        }
    }
    
}
