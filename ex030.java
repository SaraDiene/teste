import java.util.Scanner;
public class ex030 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double valor_produto;

        System.out.print("Informe o valor do produto: R$ ");
        valor_produto = input.nextDouble();

        if (valor_produto < 20){
            valor_produto = valor_produto + (valor_produto*0.45);
            System.out.printf("Você poderá vender esse produto a: R$ %.2f\n", valor_produto);
        }

        else{
            valor_produto = valor_produto + (valor_produto * 0.30);
            System.out.printf("Você poderá vender esse produto a: R$ %.2f\n", valor_produto);
        }

        input.close();
        
    }
}
