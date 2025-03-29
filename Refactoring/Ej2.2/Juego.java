public class Juego {
    // ......

    //Bad Smell: Feature Envy
    //Solución: Extract Method + Move Method
    public void incrementar(Jugador j) {
    //    j.puntuacion = j.puntuacion + 100;
        j.incrementarPuntuacion(100);
    }

    public void decrementar(Jugador j) {
    //    j.puntuacion = j.puntuacion - 50;
        j.reducirPuntuacion(50);
    }
    //Bad Smell: Middle Man??
    //Solucion: Remove Middle Man
}
