import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int quant;

        System.out.print("Digite a quantidade de maças desejadas: ");
        quant = input.nextInt();

        double total;

        if (quant <12){
             total = quant * 1.30;
             System.out.print("O valor total da sua compra é: R$" + total);
        }
        else{
            total = quant * 1.0;
            System.out.print("O valor total da sua compra é: R$ " +  total);

        }

        input.close();


    }
    
}
