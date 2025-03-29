public class EmpleadoTemporario extends EmpleadPlanta{
//    public String nombre;
//    public String apellido;
//    public double sueldoBasico = 0;
//    public double horasTrabajadas = 0;
//    public int cantidadHijos = 0;
    // Bad Smell:
    // Solución: Encapsulate Field
    // Las variables no deberían tener valores declarados sino que deberían inicializarse con el constructor.
    // Crear variables para los valores de sueldo que cambiarán (sueldoHora, adicionalPorHijo) para evitar modificar los métodos en el futuro.
    private double sueldoHora;

//    public double sueldo() {
//        return this.sueldoBasico
//        (this.horasTrabajadas * 500) 
//        (this.cantidadHijos * 1000) 
//        (this.sueldoBasico * 0.13);
//    }

// Bad Smell: Long Method
//Solución: Extract Method

    public double sueldo(int horasTrabajadas) {
        return super.sueldo()
        + this.getRemuneracionVariable(horasTrabajadas);
    }

// Bad Smell: 
// Solución: Add Parameter
    private double getRemuneracionVariable(int horasTrabajadas){
        return horasTrabajadas * this.sueldoHora;
    }
}