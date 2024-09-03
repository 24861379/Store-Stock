
package Logica;


public class Perecedero extends Producto{
    //se crean la varibles, estas se encapsulan con la palabra clave private
    private String fechaCaducidad;
    private int temperaturaDeAlmacenamiento;

    //creamos el contructor en el que inicializamos el objeto y asignamos los valores
    public Perecedero(int ID, String nombre, double precio, int CantidadInventario, String fechaCaducidad, int temperaturaDeAlmacenamiento) {
        super(ID, nombre, precio, CantidadInventario);
        this.fechaCaducidad = fechaCaducidad;
        this.temperaturaDeAlmacenamiento = temperaturaDeAlmacenamiento;
    }
    
    //Métodos getter y setter
    //con get podemos obtener el valor de cada variable
    //y con set acutualizamos el valor antes definido
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
    
    //este metodo lo usamos para sobre escribir el mensaje de la clase padre, esot se hace con la palabra 
    //reservada @Override
    @Override
    public void Informacion(){
        System.out.println("----------------------------");
        super.Informacion();
        System.out.println("Fecha de caducidad: "+ fechaCaducidad+ "\n"+
                           "Temperatura: "+ temperaturaDeAlmacenamiento);
        System.out.println("------------------------------------");
    }
    
    
    
    
    
}
