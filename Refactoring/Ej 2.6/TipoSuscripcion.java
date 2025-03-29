public abstract Class TipoSuscripcion {
    
    protected double calcularCargoExtraPorEstreno(Pelicula pelicula){
   	    return (ChronoUnit.DAYS.between(pelicula.getfechaEstreno(), LocalDate.now()) ) > 30 ? 0 : 300;
    }
    public abstract double getCosto();
}
