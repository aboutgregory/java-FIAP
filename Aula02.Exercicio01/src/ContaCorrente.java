public class ContaCorrente {

    public Cliente titular;
    double saldo;
    void depositar(double valor){
        saldo += valor;
    }
    void retirar(double valor){
        saldo += valor;
    }
    double retornarSaldo(){
        return saldo
    }
}

