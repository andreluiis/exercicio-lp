package exerciciolp3;

import java.util.Scanner;

public class questao4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String palavra = "";
        int i = 0;
        do {
            i++;
            System.out.println("Digite a palavra(Tentativa " + i + ")");
            palavra = ler.nextLine();
            if(palavra.equals("Java-2022")){
                System.out.println("Palavra Certa");
            }else{
                System.out.println("Palavra Errada");
            }
        } while (!palavra.equals("Java-2022") && i < 5);
        ler.close();
    }
}
