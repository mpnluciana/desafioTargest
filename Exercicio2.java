 import java.util.Scanner;
    // exercicio 2 sobre quantidade de vezes que aparece a letra "a"
    public class Exercicio2 {
        public static void main(String[] args) {
            Scanner leitura = new Scanner(System.in);
            System.out.println("Digite uma string: ");
            String texto = leitura.nextLine();

            int qtdadeLetraA = 0;
            for (int x=0; x< texto.length(); x++) {
                if (texto.charAt(x) == 'a' || texto.charAt(x) =='A') {
                    qtdadeLetraA++;
                }
            }
            System.out.println("Quantidade de vezes que aparece a letra 'a'/'A': " + qtdadeLetraA);
        }

    }
