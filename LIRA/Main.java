public class Main {

    public static void main(String[] args) {

        CarroEletrico carro = new CarroEletrico("Tesla Model 3");

        System.out.println("Modelo: " + carro.getModelo());

        // Acelerar várias vezes
        for (int i = 0; i < 7; i++) {

            carro.acelerar();

            System.out.println("Velocidade: " + carro.getVelocidadeAtual() + " km/h");
            System.out.println("Bateria: " + carro.getCargaBateria() + "%");
            System.out.println("-------------------------");
        }

        // Tentar carregar em movimento
        carro.carregarBateria();

        // Frear até parar
        while (carro.getVelocidadeAtual() > 0) {
            carro.frear();
        }

        // Carregar parado
        carro.carregarBateria();

        System.out.println("-------------------------");
        System.out.println("Estado final:");
        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("Velocidade: " + carro.getVelocidadeAtual() + " km/h");
        System.out.println("Bateria: " + carro.getCargaBateria() + "%");
    }
}