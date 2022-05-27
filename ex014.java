import java.util.Scanner;

public class ex014 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num_lados;
        double medida;

        System.out.println("Digite o número de lados: ");
        num_lados = input.nextInt();

        System.out.println("Digite a medida dos lados: ");
        medida = input.nextDouble();

        if (num_lados == 3){
            System.out.println("É um TRIÂNGULO");
            double area = medida * medida / medida;
            System.out.println("A área do Triângulo é: " + area + "cm");
        }

        else if(num_lados == 4){
            System.out.println("É um QUADRADO");
            double area = medida * medida;
            System.out.println("A área do quadrado é: " + area + "cm");
        }

        else if(num_lados == 5){
            System.out.println("É um PENTÁGONO");
        }

        else{
            System.out.println("Valores inválidos.");
        }
        input.close();
    }
}
