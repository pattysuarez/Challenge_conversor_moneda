import com.google.gson.JsonObject;
import java.util.Scanner;

public class ConvertirMoneda {
    public static void nuevaMoneda(JsonObject tasas, String moneda_desde, String moneda_hacia, Scanner scanner) {

        System.out.println("Ingrese el valor que deseas convertir de la moneda [" + moneda_desde + "]: ");

        //OBTIENE EL VALOR A CONVERTIR
        double valor = scanner.nextDouble();

        //OBTIENE LAS TASAS DE LAS MONEDAS ORIGEN Y DESTINO
        double tasa_desde = tasas.get(moneda_desde).getAsDouble();
        double tasa_hacia = tasas.get(moneda_hacia).getAsDouble();

        // REALIZA EL CALCULO DEL VALOR CONVERTIDO
        double total = valor * (tasa_hacia/tasa_desde);

        //IMPRIME EL DATO
        System.out.printf("Valor a convertir: %.2f [%s] --> Valor convertido: %.2f [%s]", valor, moneda_desde, total, moneda_hacia);
        System.out.println("\n");
    }
}
