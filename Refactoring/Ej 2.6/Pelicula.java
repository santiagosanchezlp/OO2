public class Pelicula {
    private LocalDate fechaEstreno;
    // ...

    public double getCosto() {
   	 return this.costo;
    }

// Bad Smell: Message Chain
//Refactoring: Move Method
//    public double calcularCargoExtraPorEstreno(){
// Si la Película se estrenó 30 días antes de la fecha actual, retorna un cargo de 0$, caso contrario, retorna un cargo extra de 300$
//   	return (ChronoUnit.DAYS.between(this.fechaEstreno, LocalDate.now()) ) > 30 ? 0 : 300;
//    }

}
