import java.util.Scanner;

public class ex023 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;

        System.out.print("Informe um número: ");
        num = input.nextInt();

        if(num % 3 == 0){
            System.out.println("É multiplo de 3");
        }
        else{
            System.out.println("Não é múltiplo de 3");
        }
        input.close();

    }
}
