import java.util.Scanner;

public class ex018 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int ang1,ang2,ang3;

        System.out.println("Digite o primeiro ângulo: ");
        ang1 = input.nextInt();

        System.out.println("Digite o segundo ângulo: ");
        ang2 = input.nextInt();

        System.out.println("Digite o terceiro ângulo: ");
        ang3 = input.nextInt();

        int soma = ang1 + ang2 + ang3;
        
        if (soma == 180){

            if (ang1 == 90 && ang1 != ang2 && ang1 != ang3){
            System.out.println("É um triângulo retângulo");
        }
            else if(ang2 == 90 && ang2 != ang1 && ang2!= ang3){
            System.out.println("É um triângulo retângulo");
        }
            else if(ang3 == 90 && ang3 != ang1 && ang3!= ang2){
            System.out.println("É um triângulo retângulo");
        }

            else if (ang1 > 90 && ang1 != ang2 && ang1 != ang3){
                System.out.println("É um triângulo Obtusângulo");
        }
            else if(ang2 > 90 && ang2 != ang1 && ang2 != ang3){
                System.out.println("É um triângulo Obtusângulo");
        }
            else if (ang3 > 90 && ang3 != ang1 && ang3 != ang2){
                System.out.println("É um triângulo Obtusângulo");

        }
            else if(ang1 < 90 && ang2 < 90 && ang3 < 90){
                System.out.println("É um triângulo Acutângulo");

            }

    }
    else{
        System.out.println("Não é um triângulo");
    }
    
    input.close();

    }
}
