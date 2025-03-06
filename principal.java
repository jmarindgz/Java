import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("\n--- Sistema de Gestión de Inventario ---");
            System.out.println("1. Agregar Producto");
            System.out.println("2. Buscar Producto");
            System.out.println("3. Actualizar Stock");
            System.out.println("4. Eliminar Producto");
            System.out.println("5. Mostrar Productos");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            
            int opcion = scanner.nextInt();
            scanner.nextLine();  // Limpiar el buffer
            
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese código del producto: ");
                    String codigoAgregar = scanner.nextLine();
                    System.out.print("Ingrese nombre del producto: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese precio del producto: ");
                    double precio = scanner.nextDouble();
                    System.out.print("Ingrese stock del producto: ");
                    int stock = scanner.nextInt();
                    inventario.agregarProducto(codigoAgregar, new Producto(nombre, precio, stock));
                    break;
                    
                case 2:
                    System.out.print("Ingrese código del producto a buscar: ");
                    String codigoBuscar = scanner.nextLine();
                    inventario.buscarProducto(codigoBuscar);
                    break;

                case 3:
                    System.out.print("Ingrese código del producto a actualizar: ");
                    String codigoActualizar = scanner.nextLine();
                    System.out.print("Ingrese nuevo stock: ");
                    int nuevoStock = scanner.nextInt();
                    inventario.actualizarStock(codigoActualizar, nuevoStock);
                    break;

                case 4:
                    System.out.print("Ingrese código del producto a eliminar: ");
                    String codigoEliminar = scanner.nextLine();
                    inventario.eliminarProducto(codigoEliminar);
                    break;

                case 5:
                    inventario.mostrarProductos();
                    break;

                case 6:
                    System.out.println("Saliendo...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }
}
