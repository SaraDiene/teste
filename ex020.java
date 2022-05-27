public class ex020 {
    public static void main(String[] args) {
        int a = 1;
        int b = 6;
        int x = 7;

        if (a > b){
            System.out.println("O maior é " + a);
        }

        else{
            System.out.println("O maior é " + b);
        }

        if (x> 10){
            System.out.println("Valor maior que 10");
        }

        else if(x <=10 && x > 5){
            System.out.println("Valor menor que 10 e maior que 5");

        }
        else{
            System.out.println("Valor menor ou igual a 5");
        }
    }
}
