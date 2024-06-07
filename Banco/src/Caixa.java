
import javax.swing.JOptionPane;

public class Caixa {

    public static void main(String[] args) {

        int num;
        String nome;
        String cpf;
        double valor;
        boolean verifica = false;

        Cliente cli = new Cliente();
        Metodos met = new Metodos();

        nome = JOptionPane.showInputDialog(null, "Digite seu nome: ");
        cpf = JOptionPane.showInputDialog(null, "Digite seu CPF: ");
        valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite um valor para déposito: "));
        cli.setNome(nome);
        cli.setCpf(cpf);
        cli.setDinheiro(valor);

        do {
            num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite uma opção: \n" + "1.Depósito\n" + "2.Saque\n" + "3.Extrato"));

            switch (num) {
                case 1:
                    valor = Integer.parseInt(JOptionPane.showInputDialog("Quanto deseja depositar?"));
                    met.depoisito(valor, cli);
                    break;

                case 2:
                    valor = Integer.parseInt(JOptionPane.showInputDialog("Quanto deseja sacar?"));
                    met.saque(valor, cli);
                  // double carteira = cli.getDinheiro(carteira - dinheiro);
                    break;

                    
                case 3:
                    JOptionPane.showMessageDialog(null, "Saldo:" + cli.getDinheiro() + "Nome:" + cli.getNome());
                    break;

                default:
                    if (num > 0 && num < 4) {
                        verifica = true;
                    }else{
                        JOptionPane.showMessageDialog(null, "Favor selecionar números apenas de 1 a 3.");
                    }

            }
        } while (verifica = false);
    }
    
}
