import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
public class ex028 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int dia,mes,ano;

        System.out.print("Informe o dia do seu nascimento: ");
        dia = input.nextInt();
        
        System.out.print("Informe o mês do seu nascimento: ");
        mes = input.nextInt();

        System.out.print("Informe o ano do seu nascimento: ");
        ano = input.nextInt();

    
        LocalDate localDateUsuario = LocalDate.of(ano, mes, dia);
        LocalDate data_atual = LocalDate.now();

        Period periodo = Period.between(localDateUsuario, data_atual);
        System.out.println("Você tem " + periodo.getYears() + " anos " + periodo.getMonths()+ " Meses " + periodo.getDays() + " dias");
        

        input.close();
    }
}
