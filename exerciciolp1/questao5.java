package exerciciolp1;

import java.util.Scanner;

public class questao5 {
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Valor jantar? ");
        float jantar = ler.nextFloat();
        ler.close();
        System.out.println(jantar + " + 10% " + (jantar * 1.1));
    }
}