
package Logica;


public class NoPerecedero extends Producto{
    //se crean la varibles, estas se encapsulan con la palabra clave private
    private int GarantiaMes;
    
    //creamos el contructor en el que inicializamos el objeto y asignamos los valores
    public NoPerecedero(int ID, String nombre, double precio, int CantidadInventario, int GarantiaMes) {
        super(ID, nombre, precio, CantidadInventario);
        this.GarantiaMes = GarantiaMes;
    }
    
    //Métodos getter y setter
    //con get podemos obtener el valor de cada variable
    //y con set acutualizamos el valor antes definido
    public int getGarantiaMes() {
        return GarantiaMes;
    }

    public void setGarantiaMes(int GarantiaMes) {
        this.GarantiaMes = GarantiaMes;
    }
    
    //este metodo lo usamos para sobre escribir el mensaje de la clase padre, esot se hace con la palabra 
    //reservada @Override
    @Override
    public void  Informacion(){
        System.out.println("----------------------------");
        super.Informacion();
        System.out.println("Garatia: " + GarantiaMes + " mes");
        System.out.println("-----------------------------------");
    }
}
