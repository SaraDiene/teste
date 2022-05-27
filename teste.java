public class teste {
    public String nomeReal;
    public String sobrenome;
    public String nomeMutante;
    public int idade;
    public int nivel;


    public String toString(){
        return "Mutante: " + nomeMutante + "\nNome: " + nomeReal + sobrenome + "\nIdade: " + idade + "\nNível: " + nivel;
    }

    public String obterNomeNivel(){
        String NomeNivel = " ";
        switch(nivel){
        case 0:
        NomeNivel = "Nível 1";
        break;

        case 1: 
        NomeNivel = "Nível 2";
        break;


        case 2:

        NomeNivel = "Nível 3";
        break;

        case 5:
        NomeNivel = "Nível 4";
        break;
        default:
        break;
    }
    return NomeNivel;

    }
}
