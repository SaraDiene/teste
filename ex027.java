import java.util.Scanner;

public class ex027 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int idade;

        System.out.print("Informe sua idade: ");
        idade = input.nextInt();

        if (idade < 16){
            System.out.println("Você não pode votar =/");
        }
        else if (idade < 18 || idade >= 65){
            System.out.println("Seu voto é facultativo");
        }
        else{
            System.out.println("Voto obrigatório");
        }

        input.close();
    }
    
}


