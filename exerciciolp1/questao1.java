package exerciciolp1;

import java.util.Scanner;

public class questao1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out. println("Digite 1 numero");
        double nota1 = ler.nextDouble();
        System.out. println("Digite 1 numero");
        double nota2 = ler.nextDouble();
        ler.close();
        double media = (nota1+nota2)/2;
        System.out. println("Média Final");
        if (media >=7) {
            System.out.println("Aprovado");    
        } else {
            System.out.println("Reprovado");
        }
    }
    
}
