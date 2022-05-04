import java.util.Scanner;


public class exercicio01 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        String nome1, nome2,nome3; 
        System.out.println("Digite o primeiro nome: ");
        nome1 = leitor.nextLine();

        System.out.println("Digite o segundo nome: ");
        nome2 = leitor.nextLine();

        System.out.println("Digite o terceiro nome: ");
        nome3 = leitor.nextLine();

        System.out.println("Nome 1: " + nome1);
        System.out.println("Nome 2: " + nome2);
        System.out.println("Nome 3: " + nome3);

        leitor.close();

    }
    
}
