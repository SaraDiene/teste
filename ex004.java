import java.util.Scanner;

public class ex004 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double salario;
        double imposto = 0.07;
        int gratificacao = 0;
        

         System.out.print("Informe o salário do funcionário: ");
         salario = input.nextDouble();

         if(salario <=350){
            gratificacao = 100;
            double salarioLiquido = (salario - imposto) + gratificacao;
            System.out.printf("O salário líquido do funcionário com descontos e gratificação é no valor de: R$ %.2f", salarioLiquido);
            
         }

         else if(salario >350 && salario <=600){
            gratificacao = 75;
            double salarioLiquido = (salario - imposto) + gratificacao;
            System.out.printf("O salário líquido do funcionário com descontos e gratificação é no valor de: R$ %.2f", salarioLiquido);
            
         }
         else if(salario >600 && salario <=900){
            gratificacao = 50;
            double salarioLiquido = (salario - imposto) + gratificacao;
            System.out.printf("O salário líquido do funcionário com descontos e gratificação é no valor de: R$ %.2f", salarioLiquido);
            
         }

         else{
            gratificacao = 35;
            double salarioLiquido = (salario - imposto) + gratificacao;
            System.out.printf("O salário líquido do funcionário com descontos e gratificação é no valor de: R$ %.2f", salarioLiquido);
            
         }
        input.close();
    }
    
}
