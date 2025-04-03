package io.github.unlp_oo.archetype;

public class Document {
    List<String> words;
  
    public long characterCount() {
    	return this.words
 			   .stream()
 			   .mapToLong(w -> w.length())
 			   .sum();
	}
    public long calculateAvg() {
    	return this.words
    			.stream()
    			.mapToLong(w -> w.length())
    			.average().orElse(0);
	}
// Resto del código que no importa
