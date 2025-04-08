import java.util.Scanner;

public class main {
   import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            //Instanciar os objetos
            ContaCorrente contaCorrente = new ContaCorrente();
            Endereco endereco = new Endereco();
            Cliente cliente = new Cliente();
            Scanner leitor = new Scanner(System.in);

            //Ler dados do usuário
            System.out.println("Insira o nome da sua rua");
            endereco.logradouro = leitor.nextLine();

            System.out.println("Insira o número da sua casa");
            endereco.numero = leitor.nextShort();

            System.out.println("Insira o CEP da sua rua");
            endereco.cep = leitor.next();

            System.out.println("Insira o complemento");
            endereco.complemento = leitor.next();

            cliente.endereco = endereco;

            System.out.println("Agora as suas informações pessoais, insira seu nome");
            cliente.nome = leitor.next();

            System.out.println("Digite seu CPF");
            cliente.cpf = leitor.next();

            System.out.println("Deposite um valor na conta");
            double valorDeposito = leitor.nextDouble();
            contaCorrente.depositar(valorDeposito);
            System.out.println("Seu saldo é R$ " + contaCorrente.retornarSaldo());

            System.out.println("Vai retirar quanto?");
            double valorRetirada = leitor.nextDouble();
            contaCorrente.retirar(valorRetirada);
            System.out.println("Seu saldo é R$ " + contaCorrente.retornarSaldo());

            System.out.println("Seus dados: " + cliente.retornarDados());
            System.out.println("Seu endereço: " + endereco.retornarEndereco());

        }
    }

        }
}
