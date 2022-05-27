import java.util.Scanner;
public class ex032 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double valor_compra,valor_venda;


        System.out.print("Informe o valor de compra: R$ ");
        valor_compra = input.nextDouble();

        if(valor_compra < 10){
            valor_venda = valor_compra + (valor_compra * 0.70);
            System.out.printf("O valor de venda do produto deve ser: R$ %.2f\n", valor_venda);
        }

        else if(valor_compra >=10 && valor_compra <30){
            valor_venda = valor_compra + (valor_compra * 0.50);
            System.out.printf("O valor de venda do produto deve ser: R$ %.2f\n", valor_venda);
        }

        else if (valor_compra >=30 && valor_compra < 50){
            valor_venda = valor_compra + (valor_compra * 0.40);
            System.out.printf("O valor de venda do produto deve ser: R$ %.2f\n", valor_venda);
        }

        else{
            valor_venda = valor_compra + (valor_compra * 0.30);
            System.out.printf("O valor de venda do produto deve ser: R$ %.2f\n", valor_venda);
        }
        input.close();
    }
}
