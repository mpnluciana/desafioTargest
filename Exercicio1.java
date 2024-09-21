import java.util.Scanner;
    // exercicio 1 sobre sequ�ncia Fibonacci
    public class Exercicio1 {

        public static void main(String[] args) {
            Scanner leitura = new Scanner(System.in);

            System.out.println("Digite um n�mero: ");
            int numero = leitura.nextInt();

            System.out.println("N�mero digitado: "+numero);

            if (sequenciaFibonacci(numero)) {
                System.out.println("O "+numero + " pertence a sequ�ncia de Fibonacci.");
            } else {
                System.out.println("O "+numero + " n�o percente a sequ�ncia de Fibonacci.");
            }

            //scanner.close();

        }

        public static boolean sequenciaFibonacci(int n) {
            if(n<0) return false;

            int a = 0;
            int b = 1;

            while (a<n) {
                int temp = a;
                a = b;
                b = temp + b;
            }
            return a == n;
        }
    }

