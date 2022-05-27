import java.util.Scanner;

public class ex017 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double lado1,lado2,lado3;

        System.out.print("Digite o primeiro lado do triângulo: ");
        lado1 = input.nextDouble();
        System.out.print("Digite o segundo lado do triângulo: ");
        lado2 = input.nextDouble();
        System.out.print("Digite o terceiro lado do triângulo: ");
        lado3 = input.nextDouble();

        if (lado1 == lado2 && lado2 == lado3){
            System.out.println("É um triângulo EQUILÁTERO");

        }

        else if(lado1 == lado2 || lado1 == lado3 || lado2 == lado3){
            System.out.println("É um triângulo ISÓSCELES");
        }

        else{
            System.out.println("É um triângulo ESCALENO");
        }

        input.close();

        

    }

   
}
