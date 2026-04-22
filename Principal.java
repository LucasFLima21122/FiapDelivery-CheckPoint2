
public class Principal {

    public static void main(String[] args) {

        // --- Entrega 1: usando Caminhão ---
        Caminhao caminhao = new Caminhao("ABC1234", 5000.0, 4);
        Pacote pacote1 = new Pacote("BR999", 10.5, "Pendente");
        Rota rotaCaminhao = new Rota(pacote1, caminhao);
        rotaCaminhao.iniciarEntrega();

        System.out.println();

        // --- Entrega 2: usando Moto ---
        Moto moto = new Moto("XYZ5678", 30.0, true);
        Pacote pacote2 = new Pacote("BR1001", 2.0, "Pendente");
        Rota rotaMoto = new Rota(pacote2, moto);
        rotaMoto.iniciarEntrega();
    }
}