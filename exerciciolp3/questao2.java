package exerciciolp3;

import java.util.Scanner;

public class questao2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite uma mensagem");
        String mensagem = ler.nextLine();
        System.out.println("Digite a quantidade");
        int quantidade = ler.nextInt();
        int i = 1;
        while (i <= quantidade) {
            i++;
            System.out.println(mensagem);      
        }
        ler.close();
    }
}
