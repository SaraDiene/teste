import java.util.Scanner;

public class ex034 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         double peso;
         int idade;
         int mg = 500;
         int gota = 20;
         int dosagem;

         System.out.print("Informe seu peso: ");
         peso = input.nextDouble();
         System.out.print("Informe sua idade: ");
         idade = input.nextInt();

         int gotaPorMg =  mg / gota;

         if (idade >= 12){
             if (peso >=60){
                dosagem = 1000 / gotaPorMg;
                System.out.println(dosagem + " Gotas");
             }
            else{
                dosagem = 875 / gotaPorMg;
                System.out.println(dosagem + " Gotas");
                
            }
        }
        else{
            if(peso > 5 && peso <= 9){
                dosagem = 125 / gotaPorMg;
                System.out.println(dosagem + " Gotas");
            }
            else if(peso >= 9.1 && peso <= 16){
                dosagem = 250 / gotaPorMg;
                System.out.println(dosagem + " Gotas");
                
            }
            else if(peso >= 16.1 && peso <= 24){
                dosagem = 375 / gotaPorMg;
                System.out.println(dosagem + " Gotas");
                
            }
            else if(peso >= 24.1 && peso <= 30){
                dosagem = 500 / gotaPorMg;
                System.out.println(dosagem + " Gotas");
                
            }
            else{
                dosagem = 750 / gotaPorMg;
                System.out.println(dosagem + " Gotas");

            }
            
        }

        input.close();
        
    }
}

