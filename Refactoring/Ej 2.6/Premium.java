public class Premium extends TipoSuscripcion{
    public getCosto(Pelicula pelicula){
        return (pelicula.getCosto()
        *0.75;
    }
}
