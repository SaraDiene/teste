
public class ex019 {

//    se (idade >= 65); 
//    mostre ("melhor idade");

// Em java, faltou a abertura e fechamento das chaves

    public static void main(String[] args) {
        int idade = 70;

        if (idade >= 65){ 
        System.out.println("Melhor Idade");
    }

    //se (genero = 1) 
  //mostre ("Masculino")
//senão (genero == 2)
//  mostre ("Feminino"); 

//Faltou a abertura das chaves e no else (senão) não é necessário informar a condição

    int genero = 2;

    if(genero == 1){
        System.out.println("Masculino");
    }
    else{
        System.out.println("Feminino");
    }

    //se preco > 10.50
   // preco = preco * 1,2;
    //senão
   // preco = preco * 1.35;

   /*Faltou a abertura dos parenteses após o if (se) e abertura das chaves. No resultado, não se utiliza virgula para informar um número flutuante.
   No else (senão) faltou a abertura e fechamento das chaves.*/

   double preco = 10.50;

   if (preco > 10.50){
       preco = preco * 1.2;
   }
   else{
       preco = preco *1.35;
   }


}

}

