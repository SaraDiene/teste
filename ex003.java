import java.util.Scanner;
public class ex003 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int idade;

        System.out.print("Digite a idade do atleta: ");
        idade = input.nextInt();

        if (idade >=5 && idade <= 7){
            System.out.println("Categoria Infantil");
        }

        else if (idade >=8 && idade <= 10){
            System.out.println("Categoria Juvenil");
        }

        else if (idade >=11 && idade <= 15){
            System.out.println("Categoria Adolescente");
        }
        
        else if (idade >=16 && idade <= 30){
            System.out.println("Categoria Adulto");
        }

        else if (idade > 30){
            System.out.println("Categoria Sênior");
        }

        else{
            System.out.println("Idade mínima: 05 anos");
        }

        input.close();

    }
    
}
