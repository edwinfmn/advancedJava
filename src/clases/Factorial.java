package clases;

public class Factorial {

    // Metodo Recursivo
    public long factorialRecursivo(int n) {
        long resultado = 0;

        if (n == 1) {
            return 1;
        }

        resultado = factorialRecursivo(n - 1) * n;

        return resultado;
    }

    // Metodo iterativo
    public long factorialIterativo(int n) {
        long resultado = 1;

        for (long i = 1; i <= n; i++) {
            resultado *= i;
        }

        return resultado;
    }

}
