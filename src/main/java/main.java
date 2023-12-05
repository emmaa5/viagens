import java.lang.runtime.SwitchBootstraps;
import java.util.Scanner;

import javax.swing.event.SwingPropertyChangeSupport;

public class main {
    public static void main(String[] args) {
        // Crie instâncias de passagens aéreas e reservas de hotel
        Reserva reserva = new Reserva("João", "Paris", "2023-01-15");
        PassagemAerea passagem = new PassagemAerea("João", "Paris", "2023-01-15", "AirlineX");
        ReservaHotel reservaHotel = new ReservaHotel("Maria", "New York", "2023-02-20", "Luxo");
        Scanner leia = new Scanner(System.in);
        // Teste de polimorfismo chamando calcularCustoTotal() para diferentes reservas
        double custoPassagem = passagem.calcularCustoTotal();
        double custoHotel = reservaHotel.calcularCustoTotal();
        System.out.println(
                "Digite 1 para visualizar os dados de passagem aérea, 2 para a reserva de hotel e 3 para alterar os dados");
        switch (leia.nextInt()) {
            case 1:
                System.out.println("Cliente:" + passagem.getCliente());
                System.out.println("Data da viagem" + passagem.getDataViagem());
                System.out.println("Destino:" + passagem.getDestino());
                System.out.println("Companhia aérea:" + passagem.getCompanhiaAerea());
                break;
            case 2:
                System.out.println("Cliente:" + reservaHotel.getCliente());
                // System.out.println("Tipo de quarto:" + reservaHotel.getTipoQuarto());
                System.out.println("Destino:" + passagem.getDestino());
                break;
            case 3:
                System.out.println("mudando os dados do cliente");
                System.out.println("Insira o nome do cliente");
                leia.nextLine();// Para prevenir que o terminal pule o cliente
                String cliente = leia.nextLine();
                reserva.setCliente(cliente);
                System.out.println("Insira o destino");
                String destino = leia.nextLine();
                reserva.setDestino(destino);
                System.out.println("Insira a data da viagem");
                String dataViagem = leia.nextLine();
                reserva.setDataViagem(dataViagem);

                System.out.println("Deseja alterar a passagem e hotel?Digite 1 para sim e 0 para não");
                int opcao = leia.nextInt();
                if (opcao == 0) {
                    System.out.println("Cliente:" + reserva.getCliente());
                    System.out.println("Data da viagem" + reserva.getDataViagem());
                    System.out.println("Destino:" + reserva.getDestino());

                } else {

                    System.out.println("Insira a companhia aerea");
                    leia.nextLine();
                    String companhiaAerea = leia.nextLine();
                    passagem.setCompanhiaAerea(companhiaAerea);
                    System.out.println("Insira o tipo de quarto");
                    String tipoQuarto = leia.nextLine();
                    System.out.println("Cliente:" + reserva.getCliente());
                    System.out.println("Data da viagem: " + reserva.getDataViagem());
                    System.out.println("Destino:" + reserva.getDestino());
                    System.out.println("Companhia aerea:" + passagem.getCompanhiaAerea());
                    // System.out.println("Tipo de quarto" + reservaHotel.getTipoQuarto());

                }

                break;
            default:
                break;
        }

    }
}
