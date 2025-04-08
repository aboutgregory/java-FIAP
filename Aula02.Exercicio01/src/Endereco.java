public class Endereco {

    String logradouro;
    short numero;
    String complemento;
    String cep;

    String retornarEndereco (){
        return "\n Rua" + logradouro + ", " + numero + ", " + complemento + " - " + cep;
    }
}
