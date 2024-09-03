
package Logica;


public class Perecedero extends Producto{
    //campos adicionales
    private String fechaCaducidad;
    private int temperaturaDeAlmacenamiento;

    public Perecedero(int ID, String nombre, double precio, int CantidadInventario, String fechaCaducidad, int temperaturaDeAlmacenamiento) {
        super(ID, nombre, precio, CantidadInventario);
        this.fechaCaducidad = fechaCaducidad;
        this.temperaturaDeAlmacenamiento = temperaturaDeAlmacenamiento;
    }
    
    //Métodos getter y setter

    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public int getTemperaturaDeAlmacenamiento() {
        return temperaturaDeAlmacenamiento;
    }

    public void setTemperaturaDeAlmacenamiento(int temperaturaDeAlmacenamiento) {
        this.temperaturaDeAlmacenamiento = temperaturaDeAlmacenamiento;
    }
    
    @Override
    public void Informacion(){
        System.out.println("----------------------------");
        super.Informacion();
        System.out.println("Fecha de caducidad: "+ fechaCaducidad+ "\n"+
                           "Temperatura: "+ temperaturaDeAlmacenamiento);
        System.out.println("------------------------------------");
    }
    
    
    
    
    
}
