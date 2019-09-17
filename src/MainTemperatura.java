
public class MainTemperatura {
      public static void main (String[] args){
        Temperatura celsius = new Temperatura();
        Temperatura fahrenheit = new Temperatura();
        
        double valor = 143.3;
        double resultado;
        resultado = celsius.converterParaCelsius(valor);
        System.out.println("Temperatura em graus Celsius:  " + resultado);
    
        
        double valor1 = 13.3;
        double resultado1;
        resultado1 = fahrenheit.converterParaFahrenheit(valor1);
        System.out.println("Temperatura em graus Fahrenheit:  " + resultado1);
    }
}
