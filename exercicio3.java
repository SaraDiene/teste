import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num;

        System.out.print("Digite um número: ");
        num = input.nextInt();

        int dobro = num * 2;

        System.out.println("O dobro de " + num + " é: " + dobro);

        input.close();


    }
    
}
