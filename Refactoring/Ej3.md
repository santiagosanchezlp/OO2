# Ejercicio 3
Dado el siguiente código implementado en la clase Document y que calcula algunas estadísticas del mismo:
### Código original
```java
public class Document {
    List<String> words;
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
// Resto del código que no importa
}
```
Tareas:
1. Enumere los code smell y que refactorings utilizará para solucionarlos.
2. Aplique los refactorings encontrados, mostrando el código refactorizado luego de aplicar cada uno.
3. Analice el código original y detecte si existe un problema al calcular las estadísticas. Explique cuál es el error y en qué casos se da ¿El error identificado sigue presente luego de realizar los refactorings? En caso de que no esté presente, ¿en qué momento se resolvió? De acuerdo a lo visto en la teoría, ¿podemos considerar esto un refactoring?
##### Bad Smell: Temporary Fields
##### Refactoring: Inline Temps 
```java
public class Document {
    List<String> words;
    public long characterCount() {
    	return this.words.stream()
            .mapToLong(w -> w.length())
            .sum();
	}
    public long calculateAvg() {
 	    return this.words.stream()
            .mapToLong(w -> w.length())
            .sum() / this.words.size();
	}
}
```
##### Bad Smell: Duplicated Code
##### Refactoring: Substitute Algorithm
```java
    public long calculateAvg() {
    	return this.words
    			.stream()
    			.mapToLong(w -> w.length())
    			.average().orElse(0);
    }
```
En caso de que no haya palabras en la lista, el método calculateAvg() devolvía error ya que dividía por 0, mientras que ahora devuelve el valor 0. Esto no sería un refactoring al estar reparando un bug.