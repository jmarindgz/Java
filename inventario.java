import java.util.HashMap;
import java.util.Map;

class Inventario {
    private HashMap<String, Producto> productos;

    public Inventario() {
        productos = new HashMap<>();
    }

    // Agregar un producto al inventario
    public void agregarProducto(String codigo, Producto producto) {
        productos.put(codigo, producto);
        System.out.println("Producto agregado: " + producto);
    }

    // Buscar un producto por su código
    public void buscarProducto(String codigo) {
        Producto producto = productos.get(codigo);
        if (producto != null) {
            System.out.println("Detalles del producto: " + producto);
        } else {
            System.out.println("Producto no encontrado.");
        }
    }

    // Actualizar el stock de un producto
    public void actualizarStock(String codigo, int nuevoStock) {
        Producto producto = productos.get(codigo);
        if (producto != null) {
            producto.setStock(nuevoStock);
            System.out.println("Stock actualizado: " + producto);
        } else {
            System.out.println("Producto no encontrado.");
        }
    }

    // Eliminar un producto del inventario
    public void eliminarProducto(String codigo) {
        if (productos.remove(codigo) != null) {
            System.out.println("Producto eliminado.");
        } else {
            System.out.println("Producto no encontrado.");
        }
    }

    // Mostrar todos los productos almacenados
    public void mostrarProductos() {
        if (productos.isEmpty()) {
            System.out.println("No hay productos en el inventario.");
            return;
        }
        
        System.out.println("Productos en el inventario:");
        for (Map.Entry<String, Producto> entry : productos.entrySet()) {
            System.out.println("Código: " + entry.getKey() + ", " + entry.getValue());
        }
    }
}
