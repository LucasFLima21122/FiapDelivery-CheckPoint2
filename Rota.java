
public class Rota {

    private Pacote pacote;
    private Veiculo veiculo;

    /**
     * Construtor da classe Rota.
     */
    public Rota(Pacote pacote, Veiculo veiculo) {
        if (pacote == null) {
            throw new IllegalArgumentException("O pacote não pode ser nulo.");
        }
        if (veiculo == null) {
            throw new IllegalArgumentException("O veículo não pode ser nulo.");
        }
        this.pacote = pacote;
        this.veiculo = veiculo;
    }

    /**
     * Retorna o pacote associado a esta rota.

     */
    public Pacote getPacote() {
        return pacote;
    }

    /**
     * Retorna o veículo associado a esta rota.
     */
    public Veiculo getVeiculo() {
        return veiculo;
    }

    /**
     * Inicia a entrega, exibindo as informações do pacote e do veículo responsável.
     * Funciona com qualquer tipo de veículo graças ao polimorfismo.
     */
    public void iniciarEntrega() {
        System.out.println("=== Iniciando Entrega ===");
        System.out.println("Pacote:  " + pacote.getCodigoRastreio());
        System.out.println("Peso:    " + pacote.getPesoKg() + " kg");
        System.out.println("Status:  " + pacote.getStatus());
        System.out.println("Veículo: " + veiculo.getTipoVeiculo() + " | Placa: " + veiculo.getPlaca());
        System.out.println("========================");
        pacote.atualizarStatus("Em trânsito");
        System.out.println("Status atualizado para: " + pacote.getStatus());
    }
}