package exerciciolp2;

import java.util.Scanner;

public class questao5 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite sua idade");
        int idade = ler.nextInt();
        if (idade < 16) {
            System.out.println("Não pode votar e nem dirigir. ");
        }else if(idade < 18) {
            System.out.println("Pode votar, mas não pode dirigir. ");
        } else{
            System.out.println("Pode votar e dirigir");
        }
        ler.close();
    }
}
