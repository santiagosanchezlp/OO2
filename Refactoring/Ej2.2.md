# Ejercicio 2.2

### Código original Juego
```java
public class Juego {
    // ......
    public void incrementar(Jugador j) {
        j.puntuacion = j.puntuacion + 100;
    }
    public void decrementar(Jugador j) {
        j.puntuacion = j.puntuacion - 50;
    }
}
```

### Código original Jugador
```java
public class Jugador {
    public String nombre;
    public String apellido;
    public int puntuacion = 0;
}
```

##### Bad Smell: Violación del encapsulamiento en la clase `Jugador`
##### Refactoring: Encapsulate Fields
 
```java
public class Jugador {
    private String nombre;
    private String apellido;
    private int puntuacion;
	
  public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getPuntuacion() {
		return puntuacion;
	}
	public void setPuntuacion(int puntuacion) {
		this.puntuacion = puntuacion;
	}
}
```
##### Bad Smell: Feature Envy en los métodos `incrementar` y `decrementar`
##### Refactoring: Move Method + Parameterisize Method
```java
    public void incrementarPuntuacionCien(){
        this.setPuntuacion(this.getPuntuacion() + 100);
    }
    public void decrementarPuntuacionCincuenta(){
        this.setPuntuacion(this.getPuntuacion() - 50);
```
```java
    public void incrementarPuntuacion(int unValor){
        this.setPuntuacion(this.getPuntuacion() + unValor);
    }
    public void decrementarPuntuacion(int unValor){
        this.setPuntuacion(this.getPuntuacion() - unValor);
```
```java
public class Juego {
    // ......
    public void incrementar(Jugador j) {
        j.incrementarPuntuacion(100);
    }
    public void decrementar(Jugador j) {
        j.reducirPuntuacion(50);
    }
}
```
