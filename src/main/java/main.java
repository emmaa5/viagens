public class main {
    public static void main(String[] args) {
        // Crie instâncias de passagens aéreas e reservas de hotel
        PassagemAerea passagem = new PassagemAerea("João", "Paris", "2023-01-15", "AirlineX");
        ReservaHotel reservaHotel = new ReservaHotel("Maria", "New York", "2023-02-20", "Luxo");

        // Teste de polimorfismo chamando calcularCustoTotal() para diferentes reservas
        double custoPassagem = passagem.calcularCustoTotal();
        double custoHotel = reservaHotel.calcularCustoTotal();
        System.out.println(passagem.getDataViagem() + " " + reservaHotel.getCliente());
        System.out.println(custoPassagem + " " + custoHotel);
    }
}
