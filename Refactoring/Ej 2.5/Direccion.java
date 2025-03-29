public class Direccion {
    private String localidad;
    private String calle;
    private int numero;
    private String departamento;
    @Override
    public String toString(){
            return this.getLocalidad() + “, ” +
            this.getCalle() + “, ” +
            this.getNumero() + “, ” +
            this.getDepartamento();
    }
}
