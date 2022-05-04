import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float real;
        float dolar;

        System.out.print("Digite o valor em real: ");
        real = input.nextFloat();

        System.out.print("Digite a cotação do dólar: ");
        dolar = input.nextFloat();

        float conversao = real / dolar;

        System.out.printf("Você possui: " +  conversao + " dólares");

        input.close();

    }
    
}
