package exerciciolp1;

import java.util.Scanner;

public class questao6 {
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Valor conta? ");
        float valorconta = ler.nextFloat();
        System.out.println("Quantidade de pessoas? ");
        int pessoas = ler.nextInt();
        float valorporpessoa = valorconta/pessoas;
        ler.close();
        System.out.println(String.format("Valor de cada pessoa %.2f", valorporpessoa));
    }
}