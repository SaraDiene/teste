import java.util.Scanner;

public class App {
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String idadeString;

        System.out.println("Digite sua idade: ");
        idadeString = input.nextLine();

        int idadeNum = Integer.parseInt(idadeString);

        System.out.println(idadeNum);

        input.close();


   }
}


