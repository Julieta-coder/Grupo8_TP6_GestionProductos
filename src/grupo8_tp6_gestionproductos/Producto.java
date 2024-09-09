
package grupo8_tp6_gestionproductos;


public class Producto {
    
    private String rubro;
    private String nombre;
    private int precio;

    public Producto( String nombre,String rubro, int precio) {
        this.rubro = rubro;
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getCategoria() {
        return rubro;
    }

    public void setCategoria(String categoria) {
        this.rubro = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}

    
   
    

