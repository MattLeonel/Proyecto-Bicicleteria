
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
        
            if(bicicletas.get(i).getNroDeSerie().equals(nroDeSerie)){
            
                return bicicletas.get(i);
            
            }
        
        }
        
        return null;
    }
    
    public ArrayList<Bicicleta> buscarBicisPorPrecio(float precio){
        ArrayList<Bicicleta> lista = new ArrayList<>();
        for (int i=0;i<bicicletas.size();i++){
            if(bicicletas.get(i).getPrecio() < precio){
                lista.add(bicicletas.get(i));
            }
        }
        return lista;
    }
    
    public ArrayList<Bicicleta> bicisOrdenadas(){
        Bicicleta aux;
        for (int i=0; i<bicicletas.size()-1; i++){
            for (int j=0; j<bicicletas.size()-1; j++){
                if (bicicletas.get(j).getAño() >= bicicletas.get(j+1).getAño()){
                aux=bicicletas.get(j+1);
                bicicletas.set(j+1, bicicletas.get(j));
                bicicletas.set(j, aux);
                }
            }
        }
        return bicicletas;
    }
}
