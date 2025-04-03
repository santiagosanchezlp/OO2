# Ejercicio 2.3

### Código original
```java
public class EmpleadoTemporario {
    public String nombre;
    public String apellido;
    public double sueldoBasico = 0;
    public double horasTrabajadas = 0;
    public int cantidadHijos = 0;
    // ......
    
    public double sueldo() {
    return this.sueldoBasico
    (this.horasTrabajadas * 500) 
    (this.cantidadHijos * 1000) 
    (this.sueldoBasico * 0.13);
    }
}
public class EmpleadoPlanta {
    public String nombre;
    public String apellido;
    public double sueldoBasico = 0;
    public int cantidadHijos = 0;
    // ......
    
    public double sueldo() {
        return this.sueldoBasico 
        + (this.cantidadHijos * 2000)
        - (this.sueldoBasico * 0.13);
    }
}

public class EmpleadoPasante {
    public String nombre;
    public String apellido;
    public double sueldoBasico = 0;
    // ......
    
    public double sueldo() {
        return this.sueldoBasico - (this.sueldoBasico * 0.13);
    }
}
```
##### Bad Smell: Repeated Code
##### Refactoring: Extract Superclass
```java
public abstract class Empleado{
    public String nombre;
    public String apellido;
    public double sueldoBasico = 0;

    public double sueldo() {
        return this.sueldoBasico - (this.sueldoBasico * 0.13);
    }
}
public class EmpleadoTemporario extends Empleado{
    public double horasTrabajadas = 0;
    public int cantidadHijos = 0;
    // ......
    
    public double sueldo() {
        return super.sueldo()
        + (this.horasTrabajadas * 500) 
        + (this.cantidadHijos * 1000);
    }
}
public class EmpleadoPlanta extends Empleado{
    public int cantidadHijos = 0;
    // ......
    
    public double sueldo() {
        return super.sueldo() 
        + (this.cantidadHijos * 2000);
    }
}
public class EmpleadoPasante extends Empleado{
}
```
##### Bad Smell: Duplicated code
##### Refactoring: Extract Superclass

##### Bad Smell: Lazy Class `Empleado Pasante`
#### Refactoring: Inline Class
```java
public abstract class Empleado{
    public String nombre;
    public String apellido;
    public double sueldoBasico = 0;

    public double sueldo() {
        return this.sueldoBasico - (this.sueldoBasico * 0.13);
    }
}
public class EmpleadoPlanta extends Empleado{
    public int cantidadHijos = 0;
    private double COMPENSACION_POR_HIJO;
    
    public EmpleadoPlanta(String unNombre, String unApellido){
        super(unNombre, unApellido);
        this.COMPENSACION_POR_HIJO = 2000;
    }
    // ......
    
    public double sueldo() {
        return super.sueldo() 
        + (this.cantidadHijos * this.COMPENSACION_POR_HIJO);
    }
}
public class EmpleadoTemporario extends EmpleadoPlanta{
    public double horasTrabajadas = 0;
    private double SUELDO_POR_HORA;
    // ......
    public EmpleadoTemporario(String unNombre, String unApellido){
        super(unNombre, unApellido);
        this.COMPENSACION_POR_HIJO = 1000;
        this.SUELDO_POR_HORA = 500

    public double sueldo() {
        return super.sueldo()
        + (this.horasTrabajadas * SUELDO_POR_HORA);
    }
}
```
##### Bad Smell: Violación de encapsulamiento
##### Refactoring: Encapsulate fields
```java
public abstract class Empleado{
    private String nombre;
    private String apellido;
    private double sueldoBasico = 0;

    public void setNombre(String unNombre){
        this.nombre = unNombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    //... otros getters y setters
}

public class EmpleadoPlanta extends Empleado{
    private int cantidadHijos = 0;
    private double COMPENSACION_POR_HIJO;
    //... otros getters y setters
}

public class EmpleadoTemporario extends EmpleadoPlanta{
    private double horasTrabajadas = 0;
    private double SUELDO_POR_HORA;
    // ... otros getters y setters
}
```
##### Bad Smell: Violación de encapsulamiento
##### Refactoring: Encapsulate fields
```java
public abstract class Empleado{
    private String nombre;
    private String apellido;
    private double sueldoBasico = 0;

    public void setNombre(String unNombre){
        this.nombre = unNombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    //... otros getters y setters
}

public class EmpleadoPlanta extends Empleado{
    private int cantidadHijos = 0;
    private double COMPENSACION_POR_HIJO;
    //... otros getters y setters
}

public class EmpleadoTemporario extends EmpleadoPlanta{
    private double horasTrabajadas = 0;
    private double SUELDO_POR_HORA;
    // ... otros getters y setters
}
```
