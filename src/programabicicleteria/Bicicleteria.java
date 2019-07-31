
package programabicicleteria;

import java.util.ArrayList;


public class Bicicleteria {
    
    private ArrayList<Bicicleta> bicicletas;
    private int ganancias;
    private int cantidadDeVentas;
    
    public Bicicleteria(){
        bicicletas = new ArrayList<>();
        cantidadDeVentas = 0;
        ganancias = 0;
    
    }
    
    public void venderBicicleta( Bicicleta bicicleta){
    
        bicicletas.remove(bicicleta);
        cantidadDeVentas++;
        ganancias += bicicleta.getPrecio();
    }
    
    public void addBicileta(Bicicleta nuevaBici){
        
        bicicletas.add(nuevaBici);
    
    }
    
    public Bicicleta buscarBicicleta(String nroDeSerie){
    
        for(int i = 0; i < bicicletas.size(); i++){
        
            if(bicicletas.get(i).getNroDeSerie() == nroDeSerie){
            
                return bicicletas.get(i);
            
            }
        
        }
        
        return null;
    }
}
