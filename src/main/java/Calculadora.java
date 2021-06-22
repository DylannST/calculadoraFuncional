import java.util.function.BiFunction;

public class Calculadora {

    public static void main(String[] args) {


        System.out.println(suma(100, 2));
        System.out.println(restar(100, 2));
        System.out.println(multiplicar(100, 2));
        System.out.println(dividir(100, 2, 0));

    }

    public static int suma(int a, int b) {
        return a + b;
    }

    public static int restar(int a, int b) {
        return a - b;
    }

    public static int multiplicar(int a, int b) {
        if (b == 0)
            return 0;
        else
            return (a + multiplicar(a, restar(b, 1)));
    }


    public static int dividir(int a, int b, int cont) {
        if (a >= b) {
            return dividir(a - b, b, suma(cont, 1));
        }
        return cont;
    }
}





