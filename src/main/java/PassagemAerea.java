// Classe PassagemAerea (herda de Reserva)
public class PassagemAerea extends Reserva {
    private String companhiaAerea;

    public PassagemAerea(String cliente, String destino, String dataViagem, String companhiaAerea) {
        super(cliente, destino, dataViagem);
        this.companhiaAerea = companhiaAerea;
    }
}