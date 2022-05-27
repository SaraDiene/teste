import java.util.Scanner;

public class ex015 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num_lados;
        double medida = 0;

        System.out.print("Digite o número de lados: ");
        num_lados = input.nextInt();

        

        if (num_lados == 3){
             System.out.println("É um TRIÂNGULO");

            System.out.print("Digite a medida dos lados: ");
            medida = input.nextInt();

            double area = medida * medida / medida;
            System.out.println("A área do Triângulo é: " + area + " cm");
        }

        else if(num_lados == 4){
            System.out.print("É um QUADRADO");

            System.out.print("Digite a medida dos lados: ");
            medida = input.nextInt();
            double area = medida * medida;
            System.out.println("A área do quadrado é: " + area + " cm");
        }

        else if(num_lados == 5){
            System.out.println("É um PENTÁGONO");
        }

        else if (num_lados < 3){
            System.out.println("Não é um polígono");
        }

        else if(num_lados > 5){
            System.out.println("Polígono não identificado");
        }
        input.close();
    }
}