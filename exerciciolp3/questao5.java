package exerciciolp3;

import java.util.Scanner;

public class questao5 {
    public static void main(String[] args) {
        
    Scanner ler = new Scanner(System.in);
    int quantidemaior = 0;
    int quantidademenor = 0;
        for(int i = 1; i <= 5; i++) {
            System.out.println("Digite a idade");
            int idade = ler.nextInt();
            if(idade >= 18) {
                
                quantidemaior++;
            }else{
                quantidademenor++;
            }
        }
        System.out.println(quantidemaior+ " Maior de idade");
        System.out.println(quantidademenor+ " Menor de idade");
        ler.close();
    }
    
}
