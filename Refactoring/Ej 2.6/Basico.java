public class Basico extends TipoSuscripcion{
    public getCosto(Pelicula pelicula){
        return pelicula.getCosto() 
        + this.calcularCargoExtraPorEstreno(pelicula);
    }
}
