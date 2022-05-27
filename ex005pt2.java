import java.util.Scanner;

public class ex005pt2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nome_func;
        int horas_trabalhadas;
        int horas_falta;
        char turno = ' ';
        char cargo = ' ';

        System.out.print("Informe o nome do fucionário: ");
        nome_func = input.nextLine();

        System.out.print("Informe a quantidade de horas trabalhadas: ");
        horas_trabalhadas = input.nextInt();

        System.out.print("Informe a quantidade de horas falta: ");
        horas_falta = input.nextInt();

        input.nextLine();

        System.out.print("Informe o turno de trabalho [M] Matutino [V] Vespertino [N] Noturno: ");
        
        while(turno != 'M' && turno != 'V' && turno != 'N'){
            turno = input.next().charAt(0);
            if (turno != 'M' && turno != 'V' && turno != 'N'){
                System.out.println("Turno inválido, digite [M] Matutino [V] Vespertino [N] Noturno: ");
            }
        }

        System.out.print("Informe o cargo [O] Operário [G] Gerente:  ");

        while(cargo != 'O' && cargo != 'G'){
            cargo = input.next().charAt(0);

            if(cargo != 'O' && cargo != 'G'){
            System.out.println("Cargo inválido. Digite [O] Operário [G] Gerente: ");
            }
        }

       
        



    }
}
