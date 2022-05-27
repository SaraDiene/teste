import java.util.Scanner;

public class ex024 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;

        System.out.print("Informe um número: ");
        num = input.nextInt();

        if (num % 3 == 0 && num % 7 == 0){
            System.out.println("É divisível por 3 e 7");
        }
        else{
            System.out.println("Não é divisível por 3 e 7");
        }

        input.close();
    }
}
