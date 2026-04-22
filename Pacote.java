
public class Pacote {

    private String codigoRastreio;
    private double pesoKg;
    private String status;

    /**
     * Construtor da classe Pacote.
     *
     */
    public Pacote(String codigoRastreio, double pesoKg, String status) {
        if (codigoRastreio == null || codigoRastreio.isBlank()) {
            throw new IllegalArgumentException("O código de rastreio não pode ser vazio.");
        }
        if (pesoKg <= 0) {
            throw new IllegalArgumentException("O peso do pacote deve ser positivo.");
        }
        if (status == null || status.isBlank()) {
            throw new IllegalArgumentException("O status não pode ser vazio.");
        }
        this.codigoRastreio = codigoRastreio;
        this.pesoKg = pesoKg;
        this.status = status;
    }

    /**
     * Retorna o código de rastreio do pacote.
     *
     */
    public String getCodigoRastreio() {
        return codigoRastreio;
    }

    /**
     * Retorna o peso do pacote em kg.
     *
     */
    public double getPesoKg() {
        return pesoKg;
    }

    /**
     * Retorna o status atual do pacote.
     *
     */
    public String getStatus() {
        return status;
    }

    /**
     * Atualiza o status do pacote.
     */
    public void atualizarStatus(String novoStatus) {
        if (novoStatus == null || novoStatus.isBlank()) {
            throw new IllegalArgumentException("O novo status não pode ser vazio.");
        }
        this.status = novoStatus;
    }
}