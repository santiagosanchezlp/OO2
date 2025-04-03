# Ejercicio 2.6

### Código original
```java
public class Usuario {
    String tipoSubscripcion;
    // ...

    public void setTipoSubscripcion(String unTipo) {
   	    this.tipoSubscripcion = unTipo;
    }
    
    public double calcularCostoPelicula(Pelicula pelicula) {
        double costo = 0;
        if (tipoSubscripcion=="Basico") {
            costo = pelicula.getCosto() + pelicula.calcularCargoExtraPorEstreno();
        }
        else if (tipoSubscripcion== "Familia") {
            costo = (pelicula.getCosto() + pelicula.calcularCargoExtraPorEstreno()) * 0.90;
        }
        else if (tipoSubscripcion=="Plus") {
            costo = pelicula.getCosto();
        }
        else if (tipoSubscripcion=="Premium") {
            costo = pelicula.getCosto() * 0.75;
        }
        return costo;
    }
}

public class Pelicula {
    LocalDate fechaEstreno;
    // ...

    public double getCosto() {
   	    return this.costo;
    }
    
    public double calcularCargoExtraPorEstreno(){
        // Si la Película se estrenó 30 días antes de la fecha actual, retorna un cargo de 0$, caso contrario, retorna un cargo extra de 300$
   	    return (ChronoUnit.DAYS.between(this.fechaEstreno, LocalDate.now()) ) > 30 ? 0 : 300;
    }
}
```
##### Bad Smell: Switch Statements
##### Refactoring: Replace Switch Statements with Polimorphysm
Creo clase abstracta TipoSuscripcion y clases Basico, Familia, Plus y Premium 
```java
public abstract class TipoSuscripcion {
    public abstract double getCosto(Pelicula pelicula);

    protected double calcularCargoExtraPorEstreno(Pelicula pelicula){
   	    return (ChronoUnit.DAYS.between(pelicula.getfechaEstreno(), LocalDate.now()) ) > 30 ? 0 : 300;
    }
}
public class Basico extends TipoSuscripcion{
    public getCosto(Pelicula pelicula){
        return pelicula.getCosto() 
        + this.calcularCargoExtraPorEstreno(pelicula);
    }
}
public class Familia extends TipoSuscripcion{
    public getCosto(Pelicula pelicula){
        return (pelicula.getCosto() 
        + this.calcularCargoExtraPorEstreno(pelicula)) 
        * 0.90;
    }
}
public class Plus extends TipoSuscripcion{
    public getCosto(Pelicula pelicula){
        return (pelicula.getCosto());
    }
}
public class Premium extends TipoSuscripcion{
    public getCosto(Pelicula pelicula){
        return (pelicula.getCosto())
        *0.75;
    }
}

public class Usuario {
    private TipoSuscripcion tipoSubscripcion; 
    
    public double calcularCostoPelicula(Pelicula pelicula) {
        return this.tipoSubscripcion.getCosto(pelicula);
    }
}
```
##### Bad Smell: Feature Envy
El método `calcularCargoExtraPorEstreno` hace más de una cosa (calcular días desde el estreno, que lo podría hacer la clase `Pelicula`, y calcular el extra) y no es claro
##### Refactoring: Extract Method + Move Method

```java
public abstract class TipoSuscripcion {
    protected double calcularCargoExtraPorEstreno(Pelicula pelicula){
   	    return (pelicula.estrenoUltimosDias(30)) ? 0 : 300;
    }
}
public class Pelicula {
    public boolean estrenoUltimosDias(int cantDias){
   	    return (ChronoUnit.DAYS.between(this.fechaEstreno, LocalDate.now())  > cantDias);
    }
}
```