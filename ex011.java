import java.util.Scanner;

public class ex011 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int qtdMacas;

        System.out.print("Informe a quantidade de maçãs que gostaria de comprar: ");
        qtdMacas = input.nextInt();

        if (qtdMacas < 12){
            System.out.printf("O valor total da sua compra é R$ %.2f \n", qtdMacas * 0.30);
        }
        else{
            System.out.println("O valor todal da sua compra é R$ " + qtdMacas * 0.25);

        }
        input.close();

    }
}
