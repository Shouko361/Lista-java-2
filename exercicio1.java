import java.util.Scanner;

public class exercicio1 {
    public static void main(String args []){
        Scanner numero = new Scanner(System.in);
        int num, fat = 1;
        int cont = 1;

        do{
            System.out.println("Digite um nº");
            num = numero.nextInt();
            for(int i = 1;i <= num; i++){
                fat = fat * i;
            }
            System.out.println("o fatorial de " + num + " é " + fat);
            cont++;
       }
       while(cont < 2);
    }
}

