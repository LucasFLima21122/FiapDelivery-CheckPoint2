
public class Caminhao extends Veiculo {

    private int numeroDeEixos;

    /**
     * Construtor da classe Caminhao.
     */
    public Caminhao(String placa, double capacidadeKg, int numeroDeEixos) {
        super(placa, capacidadeKg);
        if (numeroDeEixos <= 0) {
            throw new IllegalArgumentException("O número de eixos deve ser positivo.");
        }
        this.numeroDeEixos = numeroDeEixos;
    }

    /**
     * Retorna o número de eixos do caminhão.
     */
    public int getNumeroDeEixos() {
        return numeroDeEixos;
    }

    /**
     * Retorna o tipo do veículo.
     */
    @Override
    public String getTipoVeiculo() {
        return "Caminhão";
    }
}
