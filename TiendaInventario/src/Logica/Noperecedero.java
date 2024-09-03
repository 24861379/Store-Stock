
package Logica;


public class NoPerecedero extends Producto{
    //campos 
    private int GarantiaMes;
    
    //constructor
    public NoPerecedero(int ID, String nombre, double precio, int CantidadInventario, int GarantiaMes) {
        super(ID, nombre, precio, CantidadInventario);
        this.GarantiaMes = GarantiaMes;
    }
    
    //Métodos getter y setter

    public int getGarantiaMes() {
        return GarantiaMes;
    }

    public void setGarantiaMes(int GarantiaMes) {
        this.GarantiaMes = GarantiaMes;
    }
    
    @Override
    public void  Informacion(){
        System.out.println("----------------------------");
        super.Informacion();
        System.out.println("Garatia: " + GarantiaMes + " mes");
        System.out.println("-----------------------------------");
    }
}
