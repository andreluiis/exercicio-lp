package exerciciolp3;

import java.util.Scanner;

public class questao3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite uma número");
        int n1 = ler.nextInt();
        System.out.println("Digite outro número");
        int n2 = ler.nextInt();
        for(int i = n1; i <= n2; i ++) {
            System.out.println(i);
        }
        ler.close();
    }
}
