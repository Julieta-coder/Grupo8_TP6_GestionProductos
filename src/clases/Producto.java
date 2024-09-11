
package clases;


public class Producto {
    
    private String rubro;
    private String descripcion;
    private int precio;
    private int stock;

    public Producto(String rubro, String descripcion, int precio, int stock) {
        this.rubro = rubro;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
    }

    public String getRubro() {
        return rubro;
    }

    public void setRubro(String rubro) {
        this.rubro = rubro;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String nombre) {
        this.descripcion = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}

    
   
    

