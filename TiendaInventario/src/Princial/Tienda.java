
package Princial;

import Logica.NoPerecedero;
import Logica.Perecedero;
import Logica.gestorInventario;
import java.util.Scanner;


public class Tienda {
    public static void main(String[] args) {
        gestorInventario GI = new gestorInventario();
        Scanner p2 = new Scanner(System.in);
        
        while(true){
            System.out.println("***Menu de producto***\n");
            System.out.println("1. Agregar producto.");
            System.out.println("2. Modificar producto.");
            System.out.println("3. Eliminar producto.");
            System.out.println("4. Buscar producto."); 
            System.out.println("5. Generar informe.");
            System.out.println("6. Salir.");
            System.out.print("Seleccione una opción: ");
            
            int opcion= p2.nextInt();
                switch(opcion){
                case 1:
                    System.out.println("Ingrese el id del producto");
                    int IdProducto = p2.nextInt();
                    System.out.println("Ingrese el nombre del producto");
                    String nombreProducto = p2.next();
                    System.out.println("Ingrese el precio del producto");
                    double precioProducto = p2.nextDouble();
                    System.out.println("Ingrese el stock");
                    int CantidadInventarioProducto = p2.nextInt();
                    System.out.println("Ingrese la fecha de caducidad");
                    String fechaCaducidadProducto = p2.next();
                    System.out.println("Ingrese la temperadura de almacenamiento");
                    int temperaturaDeAlmacenamientoProducto = p2.nextInt();
                    GI.AgregarProducto(new Perecedero(IdProducto, nombreProducto,  precioProducto,  CantidadInventarioProducto,fechaCaducidadProducto,  temperaturaDeAlmacenamientoProducto));
                    System.out.println("producto afregado");
                    
                    break;
                case 2:
                    System.out.println("Ingrese el id del no producto");
                    int IdNoProducto = p2.nextInt();
                    System.out.println("Ingrese el nombre del no producto");
                    String nombreNoProducto = p2.next();
                    System.out.println("Ingrese el precio del no producto");
                    double precioNoProducto = p2.nextDouble();
                    System.out.println("Ingrese el stock");
                    int CantidadInventarioNoProducto = p2.nextInt();
                    System.out.println("Ingrese la cantidad de meses de la garantia");
                    int garantiaNoProducto = p2.nextInt();
                    GI.AgregarProducto(new NoPerecedero(IdNoProducto, nombreNoProducto,  precioNoProducto,  CantidadInventarioNoProducto,garantiaNoProducto));
                    System.out.println("producto afregado");
                    break;
                    
                case 3:
                    System.out.println("Ingrese el id del producto");
                    int id= p2.nextInt();
                    GI.ModificarProducto(id);
                    break;
                case 4:
                    System.out.println("Ingrese el nombre del producto");
                    String nombreP= p2.next();
                    GI.EliminarProducto(nombreP);
                    break;
                case 5:
                    System.out.println("Ingrese el nombre del producto");
                    String nombreB= p2.next();
                    GI.BuscarProducto(nombreB);;
                    break;
                case 6:
                    System.out.println("Ver informe");
                    GI.GenerarInforme();
                    break;
                case 7:
                    System.out.println("Saliendo...");
                    p2.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion no valida. intente de nuevo.");
                    break;
            }
        }
    }
}
