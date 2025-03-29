public class Carrito {
    private List<ItemCarrito> items;
    
    public double total() {
        return this.items.stream()
        .mapToDouble(item -> 
    //    item.getProducto().getPrecio() * item.getCantidad())
        item.total()
        .sum();
    }
//Bad Smell: Feature Envy
//Refactoring: Extract Method 
}
