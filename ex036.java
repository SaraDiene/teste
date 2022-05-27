import java.util.Scanner;

public class ex036 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nomeFunc;
        int horasExtras;
        int horasFalta;
        int converteMinutosExtra;
        int converteMinutosFaltas;
        int horas;

        System.out.print("Digite o nome do funcionário: ");
        nomeFunc = input.nextLine();

        System.out.print("Digite o número de horas extras: ");
        horasExtras = input.nextInt();
        converteMinutosExtra  =  horasExtras * 60;

        System.out.print("Digite o número de horas falta: ");
        horasFalta = input.nextInt();
        converteMinutosFaltas = horasFalta * 60;

        horas = converteMinutosExtra - (2/3*(converteMinutosFaltas));

        if (horas >= 2400){
            System.out.println("O prêmio do funcionário " + nomeFunc + " é no valor de R$ 500,00");
        }
        else if(horas >= 1800 || horas <2400){

            System.out.println("O prêmio do funcionário " + nomeFunc + " é no valor de R$400,00");
        }
        else if (horas >= 1200 || horas < 1800 ){
            System.out.println("O prêmio do funcionário " + nomeFunc + " é no valor de R$ 300,00");
        }
        else if (horas >= 600 || horas < 1200){
            System.out.println("O prêmio do funcionário " + nomeFunc + " é no valor de R$ 200,00");
        }
        else{
            System.out.println("O prêmio do funcionário " + nomeFunc + " é no valor de R$ 100,00");
        }
        input.close();
    } 
}