import java.util.Scanner;

public class ex005 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome = "";
        int funcionario = 1;
        double salario_min = 450.0;
        char turno;
        char cargo;
        int horas_trabalhadas = 0;
        double valor_hora = 0;
        double salario_inicial = 0;
        double alimentacao;
        double salario_final;

        while(funcionario <= 10){


        System.out.print("\n Informe o nome do funcionário: ");
        nome = input.nextLine();
        input.nextLine();

        System.out.print("\nInforme o número de horas trabalhadas: ");
        horas_trabalhadas = input.nextInt();
        input.nextLine();

        System.out.print("\nInforme a categoria [O] Operário [G] Gerente: ");
        cargo = input.next().charAt(0);
        input.nextLine();

        if (cargo == 'G'){
                System.out.print("\nInforme o turno de trabalho [M] Matutino [V] Vespertino [N]Noturno: ");
                turno = input.next().charAt(0);
                
                if (turno == 'N'){
                    valor_hora = salario_min * 0.18;
                    salario_inicial = valor_hora * horas_trabalhadas;
                }

                else if (turno == 'M' || turno =='V'){
                    valor_hora = salario_min * 0.15;
                    salario_inicial = valor_hora * horas_trabalhadas;
                }
            }

        
        else if (cargo == 'O'){
                System.out.print("\nInforme o turno de trabalho [M] Matutino [V] Vespertino [N]Noturno: ");
                turno = input.next().charAt(0);
                if (turno == 'N'){
                    valor_hora = salario_min * 0.13;
                    salario_inicial = valor_hora * horas_trabalhadas;
                }
                else if (turno == 'M' || turno == 'V'){
                    valor_hora = salario_min * 0.10;
                    salario_inicial = valor_hora * horas_trabalhadas;
                } 

        else{
                System.out.println("Opção inválida");
                }

            }  
              
    
        if (salario_inicial <=300){
            alimentacao = salario_inicial * 0.20;
            salario_final = salario_inicial + alimentacao;
        }

        else if(salario_inicial >300 && salario_inicial <=600){
            alimentacao = salario_inicial * 0.15;
            salario_final = salario_inicial + alimentacao;

        }

        else{
            alimentacao = salario_inicial * 0.05;
            salario_final = salario_inicial + alimentacao;
        }

        System.out.println("Matrícula: " + funcionario);
        System.out.println("Nome funcionário: " + nome);
        System.out.println("Cargo funcionário: " + cargo);
        System.out.println("Número horas trabalhadas: " + horas_trabalhadas);
        System.out.printf("Valor hora: %.2f \n", valor_hora);
        System.out.printf("Salário Inicial: %.2f \n", salario_inicial);
        System.out.printf("Auxilio Alimentação: %.2f \n", alimentacao);
        System.out.printf("Salário final funcionário: %.2f \n", salario_final);

        System.out.println("*************************************************");

        funcionario++;

        input.nextLine();
    }

    input.close();
    }

        
    }