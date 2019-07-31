
package programabicicleteria;

import java.util.ArrayList;
import java.util.Scanner;


public class ProgramaBicicleteria {

   
    public static void main(String[] args) {
        Bicicleteria bici= new Bicicleteria();
        ArrayList <Bicicleta> lista;
        
        bici.addBicileta(new Bicicleta("","",5));
        bici.addBicileta(new Bicicleta("","",7));
        bici.addBicileta(new Bicicleta("","",9));
        bici.addBicileta(new Bicicleta("","",4));
        bici.addBicileta(new Bicicleta("","",2));
        bici.addBicileta(new Bicicleta("","",8));
    
        lista = bici.bicisOrdenadas();
        for(int i=0; i<lista.size(); i++){
        System.out.println(lista.get(i).getAño());
        }
    }
    
}
