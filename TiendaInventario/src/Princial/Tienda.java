
package Princial;
//importamos el paquete Logica para poder traer la clase Padre y las hijas
import Logica.NoPerecedero;
import Logica.Perecedero;
import Logica.gestorInventario;
import java.util.Scanner;

public class Tienda {
    public static void main(String[] args) {
        //instanciamos la clase gestroInventario ya que esta tiene la logica
        gestorInventario GI = new gestorInventario();
        Scanner p2 = new Scanner(System.in);
        
        //usa en bucle while para poder hacer el menú
        while(true){
            System.out.println("***Menu de producto***\n");
            System.out.println("1. Agregar producto perecedero.");
            System.out.println("2. Agregar producto no perecedero.");
            System.out.println("3. Modificar producto.");
            System.out.println("4. Eliminar producto.");
            System.out.println("5. Buscar producto."); 
            System.out.println("6. Generar informe.");
            System.out.println("7. Salir.");
            System.out.print("Seleccione una opción: "); 
            
            int opcion= p2.nextInt();
                switch(opcion){
                case 1:
                    //pedimos los valores para la clase Perecedero que hereda todas las variables de Producto
                    //y le asignamos sus valores, tambien se le asigna las variables del la clase Perecedero
                    System.out.println("****Agregar productos perecederos****");
                    System.out.println("Ingrese el id del producto");
                    int IdProducto = p2.nextInt();
                    System.out.print("Ingrese el nombre del producto");
                    String nombreProducto = p2.next();
                    System.out.println("Ingrese el precio del producto");
                    double precioProducto = p2.nextDouble();
                    System.out.println("Ingrese el stock");
                    int CantidadInventarioProducto = p2.nextInt();
                    System.out.println("Ingrese la fecha de caducidad");
                    String fechaCaducidadProducto = p2.nextLine();
                    p2.nextLine();
                    System.out.println("Ingrese la temperadura de almacenamiento");
                    int temperaturaDeAlmacenamientoProducto = p2.nextInt();
                    GI.AgregarProducto(new Perecedero(IdProducto, nombreProducto,  precioProducto,  CantidadInventarioProducto,fechaCaducidadProducto,  temperaturaDeAlmacenamientoProducto));
                    System.out.println("producto agregado");
                    
                    break;
                case 2:
                    //pedimos los valores para la clase NoPerecedero que hereda todas las variables de Producto
                    //y le asignamos sus valores, tambien se le asigna la variable del la clase NoPerecedero
                    System.out.println("****Agregar productos no perecederos****");
                    System.out.println("Ingrese el id del producto no perecedero");
                    int IdNoProducto = p2.nextInt();
                    System.out.println("Ingrese el nombre del producto no perecedero");
                    String nombreNoProducto = p2.next();
                    System.out.println("Ingrese el precio del producto no perecedero");
                    double precioNoProducto = p2.nextDouble();
                    System.out.println("Ingrese el stock");
                    int CantidadInventarioNoProducto = p2.nextInt();
                    System.out.println("Ingrese la cantidad de meses de la garantia");
                    int garantiaNoProducto = p2.nextInt();
                    GI.AgregarProducto(new NoPerecedero(IdNoProducto, nombreNoProducto,  precioNoProducto,  CantidadInventarioNoProducto,garantiaNoProducto));
                    System.out.println("producto agregado");
                    break;
                    
                case 3:
                    //pedimos  el id del producto y se con la variable de clase  GI traemos al método ModificarProducto
                    //y le pasamos el valor agregado esto 
                    System.out.println("Ingrese el id del producto");
                    int id= p2.nextInt();
                    GI.ModificarProducto(id);
                    break;
                case 4:
                    //pedimos el nombre del producto y se con la variable de clase GI traemos al método EliminarProducto
                    //y le pasamos el valor agregado esto lo hacemos para eliminar el producto
                    System.out.println("Ingrese el nombre del producto");
                    String nombreP= p2.next();
                    GI.EliminarProducto(nombreP);
                    break;
                case 5:
                    //pedimos el nombre del producto y se con la variable de clase GI traemos al método BuscarProducto
                    //y le pasamos el valor agregado para buscar todo los datos de los productos
                    System.out.println("Ingrese el nombre del producto");
                    String nombre= p2.next();
                    GI.BuscarProducto(nombre);
                    break;
                case 6:
                    //en este caso podemos ver el informe general de todos los productos
                    System.out.println("Ver informe");
                    GI.Informacion();
                    break;
                case 7:
                    //en este case salimo
                    System.out.println("Saliendo...");
                    p2.close();
                    System.exit(0);
                    break;
                default:
                    //si el usuario ingresa una opcion  que no sea de 1  a 7 le sale un mensaje diciendo que 
                    //ingrelos números correspondiendtes
                    System.out.println("Opcion no valida. intente de nuevo.");
                    break;
            }
        }
    }
}