import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        String nome;
        int idade;
        float salario;

        System.out.println("Digite seu nome: ");
        nome = leitor.nextLine();

        System.out.println("Digite sua idade: ");
        idade = leitor.nextInt();

        System.out.println("Digite seu salário: ");
        salario = leitor.nextFloat();

        System.out.println("Nome funcionário: " + nome);
        System.out.println("Idade funcionário: " + idade);
        System.out.printf("Salário funcionário: %.2f ", salario);

        leitor.close();
        
    }
    
}
