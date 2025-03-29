public class Familia extends TipoSuscripcion{
    public getCosto(Pelicula pelicula){
        return (pelicula.getCosto() 
        + this.calcularCargoExtraPorEstreno(pelicula)) 
        * 0.90;
    }
}
