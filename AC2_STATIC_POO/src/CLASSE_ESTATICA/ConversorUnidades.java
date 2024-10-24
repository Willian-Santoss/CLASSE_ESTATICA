package CLASSE_ESTATICA;

public class ConversorUnidades { // Classe base com métodos staticos
    //método estatico para calcular a conversão de celsius para fahrenheit
    public static double celsiusParaFahrenheit(double celsius) {
        return (celsius * 1.8) + 32;
    }
    //método estatico para calcular a conversão de km para milhas
    public static double quilometrosParaMilhas(double quilometros) {
        return quilometros * 0.6214;
    }
    //método estatico para calcular a conversão de gramas para libras
    public static double gramasParaLibras(double gramas) {
        return gramas * 0.0022046;
    }
}