package CLASSE_ESTATICA;

public class Main { //Classe principal "Main" para exibir os resultados no console
    public static void main(String[] args) {
        double celsius = 19.0;
        double fahrenheit = ConversorUnidades.celsiusParaFahrenheit(celsius);
        System.out.printf("%.2f graus Celsius é igual a %.2f graus Fahrenheit%n", celsius, fahrenheit);

        double quilometros = 10.0;
        double milhas = ConversorUnidades.quilometrosParaMilhas(quilometros);
        System.out.printf("%.2f quilômetros é igual a %.2f milhas%n", quilometros, milhas);

        double gramas = 1910.0;
        double libras = ConversorUnidades.gramasParaLibras(gramas);
        System.out.printf("%.2f gramas é igual a %.2f libras%n", gramas, libras);
    }
}
