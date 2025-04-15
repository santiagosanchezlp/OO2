# Ejercicio 2.5

### Código original
```java
public class Supermercado {
    public void notificarPedido(long nroPedido, Cliente cliente) {
        String notificacion = MessageFormat.format(“Estimado cliente, se le informa que hemos recibido su pedido con número {0}, el cual será enviado a la dirección {1}”,
                    new  Object[] { nroPedido, cliente.getDireccionFormateada() });
        // lo imprimimos en pantalla, podría ser un mail, SMS, etc..
        System.out.println(notificacion);
    }
}

public class Cliente {
    public String getDireccionFormateada() {
        return 
            this.direccion.getLocalidad() + “, ” +
            this.direccion.getCalle() + “, ” +
            this.direccion.getNumero() + “, ” +
            this.direccion.getDepartamento();
}
```
##### Bad Smell: Feature Envy
El método `getDireccionFormateada` de la clase `Cliente` utiliza un método que debería estar en `Dirección`
##### Refactoring: Move Method
```java
public class Cliente {
    public String getDireccionFormateada() {
        return this.direccion.getDireccionFormateada();
}
public class Direccion {
    public String getDireccionFormateada() {
        return 
            this.direccion.getLocalidad() + “, ” +
            this.direccion.getCalle() + “, ” +
            this.direccion.getNumero() + “, ” +
            this.direccion.getDepartamento();
}
```
##### Bad Smell: Middle Man
##### Refactoring: Remove Middle Man
```java
public class Cliente {
    public void notificarPedido(long nroPedido) {
        String notificacion = MessageFormat.format(“Estimado cliente, se le informa que hemos recibido su pedido con número {0}, el cual será enviado a la dirección {1}”,
                    new  Object[] { nroPedido, this.getDireccionFormateada() });
        // lo imprimimos en pantalla, podría ser un mail, SMS, etc..
        System.out.println(notificacion);
    }
}
```
##### Bad Smell: Temporary Field
##### Refactoring: Inline Temp
```java
public class Cliente {
    public void notificarPedido(long nroPedido) {
        System.out.println(MessageFormat.format("Estimado cliente, se le informa que hemos recibido su pedido con número {0}, el cual será enviado a la dirección {1}",
                    new  Object[] { nroPedido, this.getDireccionFormateada() }));
    }
}
```
