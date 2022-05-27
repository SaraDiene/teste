import java.util.Scanner;

public class ex010{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int senha;

        System.out.println("Digite a senha correta: ");
        
        senha = input.nextInt();

        if (senha == 1234){
            System.out.println("Acesso permitido!");
        }

        else{
            System.out.println("Acesso negado!");
        }
        input.close();

    }
}
