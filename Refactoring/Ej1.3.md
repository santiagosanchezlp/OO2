# Ejercicio 1.3 Cálculos 
Analice el código que se muestra a continuación. Indique qué code smells encuentra y cómo pueden corregirse.
### Código original
```java
    public void imprimirValores() {
        int totalEdades = 0;
        double promedioEdades = 0;
        double totalSalarios = 0;
        
        for (Empleado empleado : personal) {
            totalEdades = totalEdades + empleado.getEdad();
            totalSalarios = totalSalarios + empleado.getSalario();
        }
        promedioEdades = totalEdades / personal.size();
            
        String message = String.format("El promedio de las edades es %s y el total de salarios es %s", promedioEdades, totalSalarios);
        
        System.out.println(message);
    }
```

##### Bad Smell: Long Method
##### Refactoring: Extract Method
```java
    public void imprimirValores() {
        String message = String.format("El promedio de las edades es %s y el total de salarios es %s", getPromedioEdades(), getTotalSalario());
        System.out.println(message);
    }
    private double getPromedioEdades(){
        int totalEdades = 0;
        double promedioEdades = 0;
        for (Empleado empleado : personal)
            totalEdades = totalEdades + empleado.getEdad();
        promedioEdades = totalEdades / personal.size();
        return promedioEdades;
    }
    private double getTotalSalario(){
        double totalSalarios = 0;
        for (Empleado empleado : personal) 
            totalSalarios = totalSalarios + empleado.getSalario();
        return totalSalarios;
    }
```
##### Bad Smell: Temporary Field
##### Refactoring: Replace Loop with Pipeline
```java
    private double getPromedioEdades(){
        return this.personal.stream().mapToDouble(emp->emp.getEdad()).average().orElse(0);
    }
    private double getTotalSalario(){
        return this.personal.stream().mapToDouble(emp->emp.getSalario()).sum();
    }
```
##### Bad Smell: Temporary Field
##### Refactoring: Inline Temp
```java
    public void imprimirValores() {
        System.out.println("El promedio de las edades es %s y el total de salarios es %s", 
                           this.getPromedioEdades() , 
                           this.getTotalSalario());
    }
```