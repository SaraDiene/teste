import java.util.Scanner;;

public class ex008 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double num1,num2;

        System.out.print("Digite o primeiro número: ");
        num1 = input.nextDouble();

        System.out.print("Digite o segundo número: ");
        num2 = input.nextDouble();

        if (num1 > num2){
            System.out.println(num1 + " é maior que " + num2);
        }

        else if(num1 < num2){
            System.out.println(num2 + " é maior que " + num1);

        }

        else{
            System.out.println("Os números são iguais!");

        }
        input.close();
    }
    
}
