public class Cliente {
    private Direccion direccion;
//Bad Smell: Feature Envy
// Refactoring: Move Method
    public String getDireccionFormateada() {
        return 
            this.direccion.toString();
    }
}
