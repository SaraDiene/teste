import java.util.Scanner;

public class ex035 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double valor_fabrica;
        double distribuidor;
        double imposto;
        double valor_final;
        System.out.println("Informe de fábrica do carro: ");
        valor_fabrica = input.nextDouble();
        
        if (valor_fabrica < 12000){
            distribuidor = 0.05;
            valor_final = valor_fabrica + (valor_fabrica * distribuidor);
            System.out.println(valor_final);
        }

        else if (valor_fabrica >= 12000 && valor_fabrica < 25000){
            distribuidor = 0.1;
            imposto = 0.15;
            valor_final = valor_fabrica + (valor_fabrica * distribuidor) + (valor_fabrica* imposto);
            System.out.println(valor_final);

        }
        else{
            distribuidor = 0.15;
            imposto = 0.20;
            valor_final = valor_fabrica + (valor_fabrica * distribuidor) + (valor_fabrica* imposto);
            System.out.println(valor_final);

        }
        input.close();
    }
}
