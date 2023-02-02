package exerciciolp1;

import java.util.Scanner;

public class questao3 {
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        String nome = ler.nextLine();
        ler.close();
        System.out.println("Olá "+nome);
    }
}
