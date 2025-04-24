public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();

        inventario.agregarProducto(new Producto("P001", "Manzanas", 3.5, 50, CategoriaProducto.ALIMENTOS));
        inventario.agregarProducto(new Producto("P002", "Laptop", 1200, 20, CategoriaProducto.ELECTRONICA));
        inventario.agregarProducto(new Producto("P003", "Remera", 30, 80, CategoriaProducto.ROPA));
        inventario.agregarProducto(new Producto("P004", "Mesa", 450, 15, CategoriaProducto.HOGAR));

        System.out.println("📦 Productos en inventario:");
        inventario.listarProductos();

        System.out.println("\n📊 Total de stock: " + inventario.obtenerTotalStock());

        Producto mayorStock = inventario.obtenerProductoConMayorStock();
        if (mayorStock != null) {
            System.out.println("\n🧱 Producto con más stock:");
            mayorStock.mostrarInfo();
        }
    }
}
