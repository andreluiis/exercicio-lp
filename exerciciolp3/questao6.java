package exerciciolp3;

import java.util.Scanner;

public class questao6 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int maior = -2147483648;
        int menor = 2147483647;
        ;
        int soma = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.println("Digite um número");
            int n = ler.nextInt();
            if (n > maior ){
                maior = n;
            }
            if(n < menor){
                menor = n;
            }
            soma = soma + n;    
        }
        System.out.println("Maior = " +maior);
        System.out.println("Menor = " +menor);
        System.out.println("Soma = " +soma);
        System.out.println("Média = " +soma / 5);
        ler.close();
    }
}
