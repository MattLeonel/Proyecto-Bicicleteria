
package programabicicleteria;


public class Bicicleta {
    
    private String nroDeSerie;
    private String modelo;
    private int año;
    private float precio;
    
    
    public Bicicleta(String nroDeSerie, String modelo, int año){
    
        this.año = año;
        this.nroDeSerie = nroDeSerie;
        this.modelo = modelo;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getNroDeSerie() {
        return nroDeSerie;
    }
    
    public int getAño() {
        return año;
    }
}
