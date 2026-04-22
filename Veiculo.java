public abstract class Veiculo {
 
    private String placa;
    private double capacidadeKg;
 
    /**
     * Construtor da classe Veiculo.
     */
    public Veiculo(String placa, double capacidadeKg) {
        if (placa == null || placa.isBlank()) {
            throw new IllegalArgumentException("A placa do veículo não pode ser vazia.");
        }
        if (capacidadeKg <= 0) {
            throw new IllegalArgumentException("A capacidade deve ser um valor positivo.");
        }
        this.placa = placa;
        this.capacidadeKg = capacidadeKg;
    }
 
    /**
     * Retorna a placa do veículo.
     */
    public String getPlaca() {
        return placa;
    }
 
    /**
     * Retorna a capacidade de carga em kg.
     */
    public double getCapacidadeKg() {
        return capacidadeKg;
    }

    public abstract String getTipoVeiculo();
}
 