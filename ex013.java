import java.util.Scanner;

public class ex013 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double altura;
        int genero;

        
        System.out.print("Digite sua altura: ");
        altura = input.nextDouble();

        System.out.print("Digite seu gênero: [1] Masculino [2] Feminino: ");
        genero = input.nextInt();


        if (genero == 1){
            double peso_ideal = (72.7 * altura) -58;
            System.out.println("Seu peso ideal é: " + peso_ideal);

        }

        else if (genero == 2){
            double peso_ideal = (62.1 * altura) - 44.7;
            System.out.printf("Seu peso ideal é: %.2f\n", peso_ideal);
        }

        else{
            System.out.println("Gênero não cadastrado");
        }
        input.close();
    }

}
