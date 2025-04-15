# Ejercicio 2.4
<a href="https://ibb.co/VcdD2qL4"><img src="https://i.ibb.co/1t3K8m0W/UMLCarrito.jpg" alt="UMLCarrito" border="0"></a>
### Código original
```java
public class Producto {
    private String nombre;
    private double precio;
    
    public double getPrecio() {
        return this.precio;
    }
}

public class ItemCarrito {
    private Producto producto;
    private int cantidad;
        
    public Producto getProducto() {
        return this.producto;
    }
    
    public int getCantidad() {
        return this.cantidad;
    }

}

public class Carrito {
    private List<ItemCarrito> items;
    
    public double total() {
      return this.items.stream()
      .mapToDouble(item -> 
      item.getProducto().getPrecio() * item.getCantidad())
      .sum();
    }
}
```
##### Bad Smell: Feature Envy en `Carrito`
##### Refactoring: Extrcat Method
```java
public class ItemCarrito {
    public double total(){
        return this.getCantidad() * this.getProducto().getPrecio();
    }
}

public class Carrito {
    private List<ItemCarrito> items;
    
    public double total() {
        return this.items.stream()
        .mapToDouble(item -> item.total())
        .sum();
```
