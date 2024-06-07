
public class Metodos {

    Cliente cli = new Cliente();

    public void depoisito(double dinheiro, Cliente cli) {
        double carteira = cli.getDinheiro();
        cli.setDinheiro(carteira + dinheiro);
    }

    public void saque(double dinheiro, Cliente cli) {
        double carteira = cli.getDinheiro();
        cli.setDinheiro(carteira - dinheiro);
    }
}
