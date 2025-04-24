import java.util.ArrayList;
import java.util.List;
 public class Inventario2 {
     private ArrayList<Producto2> productos2;

     public Inventario2() {
         this.productos2 = new ArrayList<>();
     }
     public ArrayList<Producto2> añadirProducto2(Producto2 p2) {
        this.productos2.add(p2);
         return productos2;

     }

     public ArrayList<Producto2> getProductos2() {
         return productos2;
     }

     public void setProductos2(ArrayList<Producto2> productos2) {
         this.productos2 = productos2;
     }

     public void listarProductos() {
         for (Producto2 producto : productos2) {}
     }
     public Producto2 buscarProducto2(String id) {
         for (Producto2 producto : productos2) {
             if (producto.getId().equals(id)) {}

         return productos2.get(0);
     }


        return null;
 }
     public List<Producto2> filtrarPorCategoria(Categoriaproducto2 categoria) {
         List<Producto2> productosFiltrados = new ArrayList<>();
         for (Producto2 p : productos2) {
             if (p.getCategoria().equals(categoria)) {
             productosFiltrados.add(p);}
         }
     return productosFiltrados;
     }
     public void eliminarProducto(String id) {
         productos2.removeIf(p -> p.getId().equals(id));
 }
     public void actualizarStock(String id, int nuevaCantidad) {
        Producto2 producto = buscarProducto2(id);
        if (producto != null) {
        producto.setCantidad(nuevaCantidad);}
     }
 }