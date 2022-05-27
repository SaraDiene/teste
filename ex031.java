import java.util.Scanner;

public class ex031 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int idade;

        System.out.println("Informe sua idade: ");
        idade = input.nextInt();

        if (idade <10){
            System.out.println("O valor do seu plano de saúde é R$ 30,00");
        }

        else if (idade >= 10 && idade < 29){
            System.out.println("O valor do seu plano de saúde é R$ 60,00");
        }
        else if (idade >= 29 && idade < 45){
            System.out.println("O valor do seu plano de saúde é R$ 120,00");
        }
        else if (idade >= 45 && idade < 59){
            System.out.println("O valor do seu plano de saúde é R$ 150,00");
        }

        else if (idade >= 59 && idade <65){
            System.out.println("O valor do seu plano de saúde é R$ 250,00");
        }

        else{
                System.out.println("O valor do seu plano de saúde é R$ 400,00");
            }

            input.close();
        }

    
    }

