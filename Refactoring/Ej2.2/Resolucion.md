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

### Bad Smell: Violación del encapsulamiento \n Refactoring: Encapsulate Fields
Clase `Jugador` 

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

### Solución: Aplicar *Encapsulate Field*
```java
public class Document {
    private List<String> words;
  
    public long characterCount() {
 	long count = this.words
            .stream()
            .mapToLong(w -> w.length())
            .sum();
    	return count;
	}
    public long calculateAvg() {
    	long avgLength = this.words
            .stream()
            .mapToLong(w -> w.length())
            .sum() / this.words.size();
 	    return avgLength;
	}

    public List<String> getWords() {
        return new ArrayList<>(this.words); 
    }

    public void setWords(List<String> words) {
        this.words = new ArrayList<>(words);
    }

// Resto del código que no importa
}
```

### Bad Smell: Duplicated Code
Los métodos `characterCount` y `calculateAvg` repiten la lógica de calcular la suma de las longitudes de las palabras usando streams.

### Solución: Aplicar *Extract Method*
```java
public class Document {
    private List<String> words;
  
    public long characterCount() {
 	long count = this.words
            .stream()
            .mapToLong(w -> w.length())
            .sum();
    	return count;
	}
    public long calculateAvg() {
    	long avgLength = this.characterCount() / this.words.size();
 	    return avgLength;
	}

    public List<String> getWords() {
        return new ArrayList<>(this.words); 
    }

    public void setWords(List<String> words) {
        this.words = new ArrayList<>(words);
    }

// Resto del código que no importa
}
```

### Bad Smell: Duplicated Code
Los métodos `characterCount` y `calculateAvg` repiten la lógica de calcular la suma de las longitudes de las palabras usando streams.

### Solución: Aplicar *Extract Method*
```java
public class Document {
    private List<String> words;
  
    public long characterCount() {
 	long count = this.words
            .stream()
            .mapToLong(w -> w.length())
            .sum();
    	return count;
	}
    public long calculateAvg() {
    	long avgLength = this.characterCount() / this.words.size();
 	    return avgLength;
	}

    public List<String> getWords() {
        return new ArrayList<>(this.words); 
    }

    public void setWords(List<String> words) {
        this.words = new ArrayList<>(words);
    }

// Resto del código que no importa
}
```

### Bad Smell: Uso de variables temporales innecesarias
Los métodos `characterCount` y `calculateAvg` aún puede simplificarse eliminando las variables temporales.

### Solución: Aplicar *Replace Temp with Query*
```java
public class Document {
    private List<String> words;
  
    public long characterCount() {
    	return this.words
            .stream()
            .mapToLong(w -> w.length())
            .sum();
	}
    public long calculateAvg() {
 	    return this.characterCount() / this.words.size()
	}

    public List<String> getWords() {
        return new ArrayList<>(this.words); 
    }

    public void setWords(List<String> words) {
        this.words = new ArrayList<>(words);
    }

// Resto del código que no importa
}
```

### Error 1: Tipo del método calculateAvg
El método `calculateAvg` devuelve un tipo de dato long, y debería en realidad, retornar un double, por ser un promedio con decimales. No se puede solucionar, ya que estamos refactorizando, y no podemos cambiar comportamiento del código.

### Error 2: Posible división por cero
El método `calculateAvg` podría realizar una división por cero si la lista de palabras está vacía. No se puede solocionar, ya que estamos refactorizando, y no podemos cambiar comportamiento del código.
