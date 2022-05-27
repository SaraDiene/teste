import java.util.Scanner;
import java.lang.Math;

public class ex007 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;

        System.out.print("Informe um número qualquer: ");
        num = input.nextInt();


        while(num > 0){
            
           System.out.println("A raiz quadrada de " + num + " é: " +  Math.sqrt(num));
           System.out.println(num + " elevado ao cubo é:  "+ Math.pow(num,3));
           System.out.println(num + " ao quadrado é:  "+  num*num);

           System.out.print("Informe outro número ou digite ZERO para sair: ");
           num = input.nextInt();

        }

        System.out.println("FIM DO PROGRAMA!");


        input.close();
    }
    
}
