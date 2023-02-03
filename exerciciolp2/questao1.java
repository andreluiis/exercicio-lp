package exerciciolp2;

import java.util.Scanner;

public class questao1 {

        public static void main(String[] args){
            Scanner ler = new Scanner(System.in);
            System.out.println("Digite um número");
            int numero = ler.nextInt();
            if(numero < 0) {
                System.out.println("Menor que 0");
            } else if (numero > 0) {
                System.out.println("Maior que 0");
            }else{
                System.out.println("Igual a 0");

            }
            ler.close();
        }
    
}
