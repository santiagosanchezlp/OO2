public class Usuario {
    private List<Pelicula> peliculasCompradas;
    private String nombre;
    private int telefono;
//    private String tipoSubscripcion;
    private TipoSuscripcion tipoSubscripcion;
    private String email;
    public void setTipoSubscripcion(String unTipo) {
        this.tipoSubscripcion = unTipo;
        }

// Bad Smell: Switch Statement
// Refactoring: Extract Class + Extract Method. Creo interface TipoSuscripcion y clases Basico, Familia, Plus y Premium     
    public double calcularCostoPelicula(Pelicula pelicula) {
        return this.tipoSubscripcion.getCosto(pelicula);
//        double costo = 0;
//        if (tipoSubscripcion=="Basico") {
//            costo = pelicula.getCosto() + pelicula.calcularCargoExtraPorEstreno();
//        }
//        else if (tipoSubscripcion== "Familia") {
//            costo = (pelicula.getCosto() + pelicula.calcularCargoExtraPorEstreno()) * 0.90;
//        }
//        else if (tipoSubscripcion=="Plus") {
//            costo = pelicula.getCosto();
//        }
//        else if (tipoSubscripcion=="Premium") {
//            costo = pelicula.getCosto() * 0.75;
//        }
//        return costo;
//    }

}
