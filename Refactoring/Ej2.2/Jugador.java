public class Jugador {
    // public String nombre;
    // public String apellido;
    // public int puntuacion = 0;
    //Bad Smell: 
    //Refactoring: Encapsulate Fields
    private String nombre;
    private String apellido;
    private int puntuacion;

    public incrementarPuntuacion(int unValor){
        this.puntuacion+=unValor;
    }
    public decrementarPuntuacion(int unValor){
        this.puntuacion-=unValor;
    }
}
