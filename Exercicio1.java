import java.util.Scanner;
    // exercicio 1 sobre sequência Fibonacci
    public class Exercicio1 {

        public static void main(String[] args) {
            Scanner leitura = new Scanner(System.in);

            System.out.println("Digite um número: ");
            int numero = leitura.nextInt();

            System.out.println("Número digitado: "+numero);

            if (sequenciaFibonacci(numero)) {
                System.out.println("O "+numero + " pertence a sequência de Fibonacci.");
            } else {
                System.out.println("O "+numero + " não percente a sequência de Fibonacci.");
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

