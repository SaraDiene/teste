import java.util.Scanner;
public class ex026 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1,num2,num3;
        int negativos = 0;

        System.out.println("Informe o primeiro número: ");
        num1 = input.nextInt();
        System.out.println("Informe o segundo número: ");
        num2 = input.nextInt();
        System.out.println("Informe o terceiro número: ");
        num3 = input.nextInt();
        
        if (num1 < 0 && num2 < 0 && num3 < 0){
            negativos = negativos + 3;
        }
        else if (num1 < 0 && num2 < 0){
            negativos = negativos + 2;
        }
        else if (num1 < 0 && num3 < 0){
            negativos = negativos + 2;
        }

        else if (num2 < 0 && num3 <0){
            negativos = negativos + 2;
        }
        else if(num1 <0){
            negativos++;
        }
        else if (num2 <0){
            negativos++;
        }
        else if (num3 < 0){
            negativos++;
        }

        System.out.printf("\nVocê informou: %.0f ", negativos);
        System.out.print("números negativos\n");
        input.close();
    }
}
