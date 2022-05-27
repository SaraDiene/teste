import java.util.Scanner;
public class ex006 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double salarioCarlos, salarioJoao;

        int meses = 1;

        System.out.print("Digite o salário de Carlos: R$ ");
        salarioCarlos = input.nextDouble();

        salarioJoao = salarioCarlos/3;

        while(salarioJoao < salarioCarlos){
            salarioCarlos = salarioCarlos + (salarioCarlos * 0.02);
            salarioJoao = salarioJoao + (salarioJoao * 0.05);

            meses++;
        }

        System.out.println("Serão necessários " + meses + " meses, para que a economia de João se iguale a economia de Carlos.");

        input.close();

    }
}
