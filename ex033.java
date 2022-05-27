import java.util.Scanner;

public class ex033 {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         double peso,altura;

         System.out.print("Informe seu peso: ");
         peso = input.nextDouble();
         System.out.print("Informe sua altura: ");
         altura = input.nextDouble();
         double imc = peso / (altura * altura);

         System.out.printf("IMC: %.0f\n",imc);

         if (imc < 20){
             System.out.println("Abaixo do peso");
         }
         else if (imc  >= 20 && imc < 25){
             System.out.println("Peso normal");
         }
         else if (imc  >= 25 && imc < 30){
            System.out.println("Sobrepeso");
        }
        else if (imc  >= 30 && imc < 35){
            System.out.println("Obesidade grau I");
        }

        else{
                System.out.println("Obesidade grau II");
        }
        input.close();
         
     }
}
