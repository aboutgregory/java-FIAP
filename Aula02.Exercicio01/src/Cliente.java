public class Cliente {
    String nome;
    String cpf;
    Endereco endereco;

    String retornarDados() {
        return "Nome do cliente: " + nome + "\n CPF do cliente: " + cpf + "\n Endereço do cliente: " + endereco.retornarEndereco();
};
