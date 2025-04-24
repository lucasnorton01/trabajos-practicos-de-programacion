
/*public class Main {

    public static void main(String[] args) {
        Inventario inventario = new Inventario();

        Producto p1 = new Producto("Libro","LotR",12314.112,12);
        Producto p2 = new Producto("Libro","HP",969569,16);
        Producto p3 = new Producto("Libro","LotR",123132132,20);

        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);

        System.out.println("INVENTARIO COMPLETO");
        inventario.listarProductos();
    }

}*/

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Inventario2 i2 = new Inventario2();
        Producto2 productito1 = new Producto2("P001", "Manzanas", 3.5, 50,  Categoriaproducto2.ALIMENTOS);
        Producto2 productito2 = new Producto2("P002", "Laptop", 700, 30, Categoriaproducto2.ELECTRONICA);
        Producto2 productito3 = new Producto2("P003", "Camisa", 25, 100,  Categoriaproducto2.ROPA);
        Producto2 productito4 = new Producto2("P004", "Sofá", 400, 10,  Categoriaproducto2.HOGAR);

        i2.añadirProducto2(productito1);
        i2.añadirProducto2(productito2);
        i2.añadirProducto2(productito3);
        i2.añadirProducto2(productito4);

        System.out.println("Listado de todos los productos:");
        i2.listarProductos();
        System.out.println();
        System.out.println("Buscar producto con ID P002:");
        Producto2 productoBuscado = i2.buscarProducto2("P002");
        if (productoBuscado != null) {
            productoBuscado.mostrar();
        } else {
            System.out.println("Producto no encontrado.");
        }
        System.out.println();
        System.out.println("Filtrar productos de la categoría ELECTRONICA:");
        ArrayList<Producto2> productosElectronica = (ArrayList<Producto2>) i2.filtrarPorCategoria(Categoriaproducto2.ELECTRONICA);
        for (Producto2 p : productosElectronica) {
            p.mostrar();
        }
        System.out.println();
        System.out.println("Eliminar producto con ID P003:");
        i2.eliminarProducto("P003");
        i2.listarProductos();
    }
}

