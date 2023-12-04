public class Reserva {
    private String cliente;
    private String destino;
    private String dataViagem;

    public Reserva(String cliente, String destino, String dataViagem) {
        this.cliente = cliente;
        this.destino = destino;
        this.dataViagem = dataViagem;
    }

    public String getCliente() {
        return cliente;
    }

    public String getDestino() {
        return destino;
    }

    public String getDataViagem() {
        return dataViagem;
    }

    public double calcularCustoTotal() {
        // Implementação polimórfica para calcular o custo total da reserva
        return 0.0;
    }
}
