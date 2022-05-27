import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = leitor.nextLine();

        System.out.print("Digite sua idade: ");
        short idade = leitor.nextShort();

        System.out.print("Digite seu salário: ");
        double salario = leitor.nextDouble();

        System.out.println("Nome funcionário: " + nome);
        System.out.println("Idade funcionário: " + idade);
        System.out.println("Salário funcionário:  " + salario);

        leitor.close();
        
    }
    
}
