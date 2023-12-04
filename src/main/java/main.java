import java.lang.runtime.SwitchBootstraps;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        // Crie instâncias de passagens aéreas e reservas de hotel
        PassagemAerea passagem = new PassagemAerea("João", "Paris", "2023-01-15", "AirlineX");
        ReservaHotel reservaHotel = new ReservaHotel("Maria", "New York", "2023-02-20", "Luxo");
        Scanner leia = new Scanner(System.in)
        // Teste de polimorfismo chamando calcularCustoTotal() para diferentes reservas
        double custoPassagem = passagem.calcularCustoTotal();
        double custoHotel = reservaHotel.calcularCustoTotal();
        System.out.println("Digite 1 para visualizar os dados de passagem aérea, 2 para a reserva de hotel e 3 para alterar os dados");
        switch (leia.nextInt()) {
            case 1:
                System.out.println("Cliente:" + passagem.getCliente());
                System.out.println("Data da viagem" + passagem.getDataViagem());
                System.out.println("Destino:" + passagem.getDestino());
                System.out.println("Companhia aérea:");
                break;
            case 2:
                System.out.println("Cliente:" + reservaHotel.getCliente());
                System.out.println("Tipo de quarto:");
                System.out.println("Destino:" + passagem.getDestino());
                System.out.println("Companhia aérea:");
                break;
            case 3:
                System.out.println("mudando os dados do cliente");
                break;
            default:
                break;
        }
        
    }
}
