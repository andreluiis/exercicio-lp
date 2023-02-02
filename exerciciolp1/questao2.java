package exerciciolp1;

import java.util.Scanner;

public class questao2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um número:");
        int n = ler. nextInt();
        ler.close();
        System.out.println("Anterior:"+(n-1));
        System.out.println("Posterior:"+(n+1));
    
    }
}
