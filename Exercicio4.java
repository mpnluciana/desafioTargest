public class Exercicio4 {
    public static void main(String[] args) {
        System.out.println("Resultado A: "+letraA());
        System.out.println("Resultado B: "+letraB());
        System.out.println("Resultado C: "+letraC());
        System.out.println("Resultado E: "+letraE());
        // não fiz letra "d" e letra "f".
    }

    private static int letraA(){
        int x = 1;
        int count = 0;

        while(count < 4){
            x = x + 2;
            count++;
        }
        return x;
    }

    private static int letraB(){
        int y = 2;
        int count = 0;

        while(count < 6){
            y = y * 2;
            count++;
        }

        return y;
    }

    private static int letraC(){
        int result = 0;
        int impar = 1;
        int count = 0;

        while (count < 7){
            result += impar;
            impar += 2;
            count++;
        }
        return result;
    }

    private static int letraE(){
        int resultado = 1;
        int resultadoAntigo = 1;
        int count = 0 ;
        int aux;
        while (count < 5){
            aux = resultado;
            resultado = resultado + resultadoAntigo;
            resultadoAntigo = aux;
            count++;

        }
        return resultado;
    }
}
