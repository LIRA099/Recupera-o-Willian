public class CarroEletrico {

    private String modelo;
    private int velocidadeAtual;
    private int cargaBateria;

    public CarroEletrico(String modelo) {
        this.modelo = modelo;
        this.velocidadeAtual = 0;
        this.cargaBateria = 100;
    }

    // Getters
    public String getModelo() {
        return modelo;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public int getCargaBateria() {
        return cargaBateria;
    }

    // Setter apenas para o modelo
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    // Métodos

    public void acelerar() {

        if (cargaBateria == 0) {
            System.out.println("Erro: bateria descarregada!");
            return;
        }

        if (velocidadeAtual >= 120) {
            System.out.println("Erro: velocidade máxima atingida!");
            return;
        }

        velocidadeAtual += 20;

        if (velocidadeAtual > 120) {
            velocidadeAtual = 120;
        }

        cargaBateria -= 5;

        if (cargaBateria < 0) {
            cargaBateria = 0;
        }

        System.out.println("Acelerando...");
    }

    public void frear() {

        velocidadeAtual -= 20;

        if (velocidadeAtual < 0) {
            velocidadeAtual = 0;
        }

        System.out.println("Freando...");
    }

    public void carregarBateria() {

        if (velocidadeAtual != 0) {
            System.out.println("Erro: só é possível carregar a bateria com o carro parado!");
            return;
        }

        cargaBateria = 100;
        System.out.println("Bateria carregada com sucesso!");
    }
}