# Ejercicio 1.1
La clase Cliente tiene el siguiente protocolo. ¿Cómo puede mejorarlo? 
### Código original
```java
/** 
* Retorna el límite de crédito del cliente
*/
public double lmtCrdt() {...

/** 
* Retorna el monto facturado al cliente desde la fecha f1 a la fecha f2
*/
protected double mtFcE(LocalDate f1, LocalDate f2) {...

/** 
* Retorna el monto cobrado al cliente desde la fecha f1 a la fecha f2
*/
private double mtCbE(LocalDate f1, LocalDate f2) {...
```
##### Bad Smell: Nombres de métodos confusos
##### Refactoring: Rename Method
```java
public double limiteCredito() {...
protected double montoFacturado(LocalDate f1, LocalDate f2) {...
private double montoCobrado(LocalDate f1, LocalDate f2) {...
```
##### Bad Smell: Data Clumps
Las variables `f1` y `f2` son enviadas como parámetro juntas 
##### Refactoring: Introduce Parameter Object

```java
protected double montoFacturado(DateLapse periodo) {...
private double montoCobrado(DateLapse periodo) {...
```