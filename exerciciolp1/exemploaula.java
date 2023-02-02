package exerciciolp1;

import java.util.Scanner;

public class exemploaula{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        // nome, idade, altura, sexo
        System.out.println("Digite seu nome:");
        String nome = ler.nextLine();

        System.out.println("Digite sua idade:");
        int idade = ler.nextInt();

        System.out.println("Digite sua altura:");
        float altura = ler.nextFloat();

        System.out.println("Digite seu sexo:");
        char sexo = (char)ler.next().toCharArray()[0];

        ler.close();

        System.out.println("Infromações Registradas");
        System.out.println("Nome: " +nome);
        System.out.println("Idade: " +idade);
        System.out.println("Altura: " +altura);
        System.out.println("Sexo: " +sexo);
    }
}
    
