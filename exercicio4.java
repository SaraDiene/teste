import java.util.Scanner;


public class exercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2;

        System.out.print("Digite o primeiro número: ");
        num1 = input.nextInt();

        System.out.print("Digite o segundo número: ");
        num2 = input.nextInt();

        int adicao = num1 + num2;
        int subtracao = num1 - num2;
        int multiplicacao = num1 * num2;
        int divisao = num1/num2;

        System.out.println(num1 + " + " + num2 +  " = " +  adicao);
        System.out.println(num1 + " - " + num2 +  " = " +  subtracao);
        System.out.println(num1 + " x " + num2 +  " = " +  multiplicacao);
        System.out.println(num1 + " / " + num2 +  " = " +  divisao);





        input.close();
    }
    
}
