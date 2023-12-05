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

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getDataViagem() {
        return dataViagem;
    }

    public void setDataViagem(String dataViagem) {
        this.dataViagem = dataViagem;
    }

    public double calcularCustoTotal() {
        // Implementação polimórfica para calcular o custo total da reserva
        return 0.0;
    }
}
