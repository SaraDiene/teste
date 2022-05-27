import java.util.Scanner;
public class ex029 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double nota1,nota2,nota3;
        int dias_aula,faltas;

        System.out.print("Informe a quantidade de dias/aula: ");
        dias_aula = input.nextInt();
        System.out.print("Informe o número de faltas do aluno: ");
        faltas = input.nextInt();

        System.out.print("Informe a primeira nota: ");
        nota1 = input.nextDouble();

        System.out.print("Informe a segunda nota: ");
        nota2 = input.nextDouble();

        System.out.print("Informe a terceira nota: ");
        nota3 = input.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;
        double faltasMax = dias_aula * 0.25;


        if (media > 7 && faltas < faltasMax){
            System.out.printf("Você está Aprovado\nSua média final foi: %.1f\n", media);
        }
        else if (media > 3 && faltas >= faltasMax){
            System.out.println("Você está reprovado. O número de faltas ultrapassa o limite.");
        }

        else if (media > 3 && faltas < faltasMax){
            System.out.printf("Você está de Recuperação\nSua média final foi: %.1f\n", media);
        }

        else if (media < 3){
            System.out.printf("Você está reprovado\nSua média final foi: %.1f\n", media);
        };
input.close();
    }
}
