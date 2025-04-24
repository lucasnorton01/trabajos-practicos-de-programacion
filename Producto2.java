public class Producto2 {
    private String id;
    private String nombre;
    private double precio;
    private int cantidad;
    private Categoriaproducto2 categoria;

    public Producto2() {
    }

    public Producto2(String id, String nombre, double precio, int cantidad) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public Producto2(String id, String nombre, double precio, int cantidad, Categoriaproducto2 categoria) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.categoria = categoria;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Categoriaproducto2 getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoriaproducto2 categoria) {
        this.categoria = categoria;
    }
    public void mostrar() {
        System.out.println(" ID: " + id+ " Nombre: " + nombre + " Precio: " + precio + " Cantidad: " + cantidad);

    }

    @Override
    public String toString() {
        return "Producto2{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", cantidad=" + cantidad +
                ", categoria=" + categoria +
                '}';
    }
}

