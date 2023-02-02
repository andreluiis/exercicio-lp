package exerciciolp1;

import java.util.Scanner;

public class questao4 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        String nome = ler.nextLine();
        System.out.println("Valor horário? ");
        float valorhorario = ler.nextFloat(); 
        System.out.println("Horas trabalhadas? ");
        float horastrabalho = ler.nextFloat(); 
        ler.close();
        float salario = valorhorario * horastrabalho;
        System.out.println(nome+" vai receber "+salario);

    }
}
    
