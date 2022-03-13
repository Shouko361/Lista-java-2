import java.util.Scanner;

public class exercicio2 {
    static long fibo(int n) {
        if (n < 2) {
            return n;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }
    public static void main(String args []) {
        Scanner obj = new Scanner(System.in);
        
        System.out.println("Digite um nº");
        int num = obj.nextInt();
	    for (int i = 0; i < num; i++) {
                System.out.print("(" + i + "):" + exercicio2.fibo(i) + "\t");
            }

    }
}
