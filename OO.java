public class OO {
    public static void main(String[] args) {
        teste mutante1 = new teste();

        mutante1.nomeReal = "Charles";
        mutante1.sobrenome = "Xavier";
        mutante1.idade = 62;
        mutante1.nivel = 5;
        mutante1.nomeMutante = "Professor";
        String NomeNivel = mutante1.obterNomeNivel();

        
        System.out.println(NomeNivel);
    }
    
}
