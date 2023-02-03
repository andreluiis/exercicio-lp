package exerciciolp2;

import java.util.Scanner;

public class questao6 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite seu peso");
        float peso = ler.nextFloat();
        System.out.println("Digite sua altura");
        float altura = ler.nextFloat();
        float imc = peso / (altura * altura);
        String avaliacao;
        if (imc < 20) {
            avaliacao = "Abaixo do normal";
        } else if (imc < 25) {
            avaliacao = "Normal";
        } else if (imc < 30) {
            avaliacao = "Sobrepeso";
        } else if (imc < 35) {
            avaliacao = "Obesidade Leve";
        } else if (imc < 40) {
            avaliacao = "Obesidade moderada";
        } else {
            avaliacao = "Obesidade mórbida";
        }
        System.out.println(String.format(
            "Resultado do IMC é %.2f Condição corporal é %s", imc, avaliacao));
        ler.close();
    }    
 }  