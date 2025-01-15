public class Mesa {
    private int id;
    private boolean disponible;

    public boolean verificarDisponibilidad() {
        return disponible;
    }

    public void asignarMesa() {
        this.disponible = false;
    }

    public void liberarMesa() {
        this.disponible = true;
    }

    public int getId() {
        return id;
    }
}
