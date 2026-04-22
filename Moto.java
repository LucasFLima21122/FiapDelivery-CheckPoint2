
public class Moto extends Veiculo {

    private boolean possuiBau;

    /**
     * Construtor da classe Moto.
     */
    public Moto(String placa, double capacidadeKg, boolean possuiBau) {
        super(placa, capacidadeKg);
        this.possuiBau = possuiBau;
    }

    /**
     * Retorna se a moto possui baú.
     */
    public boolean isPossuiBau() {
        return possuiBau;
    }

    /**
     * Retorna o tipo do veículo.
     */
    @Override
    public String getTipoVeiculo() {
        return "Moto";
    }
}