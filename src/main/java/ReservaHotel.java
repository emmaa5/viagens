// Classe ReservaHotel (herda de Reserva)
public class ReservaHotel extends Reserva {
    private String tipoQuarto;

    public ReservaHotel(String cliente, String destino, String dataViagem, String tipoQuarto) {
        super(cliente, destino, dataViagem);
        this.tipoQuarto = tipoQuarto;
    }
    public String getTipoQuarto(){
        return tipoQuarto;
    }
    public void setTipoQuarto(String tipoQuarto){
        this.tipoQuarto = tipoQuarto;
    }
}