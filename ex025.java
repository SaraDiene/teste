import java.util.Scanner;

public class ex025 {
    public static void main(String[] args) {
        double salarioBruto;
        double valorEmprestimo;
        int numParcelas;
        double valorParcelas;

        Scanner input = new Scanner(System.in);

        System.out.print("Informe o salário bruto: ");
        salarioBruto = input.nextDouble();

        System.out.print("Informe o valor do empréstimo: ");
        valorEmprestimo = input.nextDouble();

        System.out.print("Informe o número de parcelas: ");
        numParcelas = input.nextInt();

        double porcSalario = salarioBruto * 0.30;

        valorParcelas = valorEmprestimo / numParcelas;

        if(valorParcelas > porcSalario){
            System.out.printf("\nO valor das parcelas excede 30 por cento do seu salário.\nEmpréstimo negado.\nValor máximo da prestação deve ser: R$ %.2f\n",  porcSalario);
        }
        else{
            System.out.printf("\nEmpréstimo concedido. O valor das parcelas é de: R$ %.2f\n",valorParcelas);
        }

    input.close();
    }
    
}
