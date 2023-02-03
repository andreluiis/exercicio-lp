package exerciciolp2;

import java.util.Scanner;

public class questao3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite sua idade");
        int idade = ler.nextInt();
        if (idade < 16) {
            System.out.println("Você não pode votar. ");
        }else {
            System.out.println("Você pode votar. ");
        }
        ler.close();
    }
}