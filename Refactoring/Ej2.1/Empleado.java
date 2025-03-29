public class Empleado {
    protected String nombre;
    protected String apellido;
    protected double sueldoBasico;
    protected int cantidadHijos;

//Bad Smell:
// Solución: Rename Method
    public double getSueldo() {
        return this.sueldoBasico
        - this.getAportePrevisional();
    }
    private double getAportePrevisional(){
        return this.sueldoBasico*0.13;
    }
}
