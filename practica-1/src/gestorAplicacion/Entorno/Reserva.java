import java.time.LocalDateTime;

public class Reserva {
    private Mesa mesa;
    private Cliente cliente;
    private LocalDateTime fechaHora;

    public Reserva(Mesa mesa, Cliente cliente, LocalDateTime fechaHora) {
        this.mesa = mesa;
        this.cliente = cliente;
        this.fechaHora = fechaHora;
        this.mesa.asignarMesa(); 
    }

    public Mesa getMesa() {
        return mesa;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }
}
