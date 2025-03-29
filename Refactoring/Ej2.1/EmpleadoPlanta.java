public class EmpleadoPlanta extends Empleado{
//    public String nombre;
//    public String apellido;
//    public double sueldoBasico = 0;
//    public int cantidadHijos = 0;
    // ......
// Bad Smell: Duplicated Code
//Solución: Extract Class
// Ver Empleado.java
    protected int cantidadHijos;
    protected double adicionalPorHijo;

    public double sueldo() {
        return super.sueldo()
        + this.getPlusHijos(); 
    }

    private double getPlusHijos(){
        return this.cantidadHijos * this.adicionalPorHijo;
    }

}
