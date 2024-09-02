
package Logica;

import javax.swing.JOptionPane;

public class Noperecedero extends Producto{
    //campos 
    private int GarantiaMes;
    
    //constructor
    public Noperecedero(int ID, String nombre, double precio, int CantidadInventario, int GarantiaMes) {
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
        JOptionPane.showMessageDialog(null, "Garatia " + GarantiaMes + " mes");
    }
}
