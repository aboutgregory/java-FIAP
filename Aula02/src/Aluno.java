public class Aluno {

    //Atributos
    String nome;
    String sobrenome;
    int idade;
    int presenca;
    double CP1;
    double CP2;
    double CP3;
    double challenge;
    double gs;

    //Calcular média da cp
    double mediaCP = (CP1 + CP2 + CP3) / 3;

    //Calcular a média final
    double notaFinal = mediaCP * 0.2 + challenge * 0.2 * gs * 0.6;

    //Métodos
    //Método para aumentar a média final do aluno
    void aumentarNota(float porcentagem){
        CP1 * porcentagem/10 + challenge + CP2



    }
}
