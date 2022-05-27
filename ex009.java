import java.util.Scanner;
import java.time.LocalDate;

public class ex009 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LocalDate data_atual = LocalDate.now();
        int ano_nascimento, ano_atual, idade;
        char cont = 'S';

        while(cont == 'S'){

        System.out.print("Digite seu ano de nascimento: ");
        ano_nascimento = input.nextInt();

        ano_atual = data_atual.getYear();

        idade = ano_atual - ano_nascimento;
        
        if (idade < 16){
            System.out.println("Você tem " + idade + " anos");
            System.out.println("Você não tem idade para votar =(");
        }

        else if (idade >= 16 && idade <18){
            System.out.println("Você tem " + idade + " anos");

            System.out.println("Se você quiser, já pode votar =)");
        }

        else{
            System.out.println("Você tem " + idade + " anos");
            System.out.println("Seu voto é obrigatório!!");
        }

        System.out.println("Deseja consultar novamente? [S] Sim [N] Não");
        cont = input.next().charAt(0);
    }

    System.out.println("Até mais!!");

    input.close();
        
    }
}
