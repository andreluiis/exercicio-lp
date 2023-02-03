package exerciciolp2;

public class exemploaula {
    
    public static void main(String[] args) {
        int contar = 1;    
        while(contar <= 10){
            System.out.print(contar);
            System.out.println(" < Dentro do loop while");
            contar++;
        }

        do{
            contar--;
            System.out.print(contar);
            System.out.println(" < Dentro do loop do-while");
        }while(contar > 1);

        for(int i = 1; i <=10; i++){
            System.out.print(i);
            System.out.println(" < Dentro do loop for");
        }
    }
}