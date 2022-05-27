import java.util.Scanner;

public class ex016 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1, num2,num3;

        System.out.print("Digite o primeiro número: ");
        num1 = input.nextDouble();

        System.out.print("Digite o segundo número: ");
        num2 = input.nextDouble();

        System.out.print("Digite o terceiro número: ");
        num3 = input.nextDouble();

        if (num1 > num2 && num1 > num3){
        System.out.println(num1 + " é o maior número.");
        }

        else if (num2 > num1 && num2 > num3){
            System.out.println(num2 + " é o maior número.");
        }
        else if (num3 > num1 && num3 > num2){
            System.out.println(num3 + " é o maior número.");

        }

        else{
            System.out.println("Os números são iguais");
        }

        input.close();
    }
}
