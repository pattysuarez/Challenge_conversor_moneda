import java.util.Objects;
import java.util.Scanner;

public class ConvertirMoneda {
    public static void conversor(String moneda_desde, String moneda_hacia, Scanner scanner) {

        System.out.println("Ingrese el valor que deseas convertir de la moneda [" + moneda_desde + "]: ");

        double valor = scanner.nextDouble();
        double tasa_desde = 0;
        double tasa_hacia = 0;

        if (Objects.equals(moneda_desde, "USD")){
             tasa_desde = 1;
             tasa_hacia = 4500;
        }else{
            tasa_desde = 4500;
            tasa_hacia = 1;
        }

        double total = valor * (tasa_hacia/tasa_desde);

        System.out.println("Valor a convertir: " + valor + " [" + moneda_desde + "] --> Valor convertido: " + total + " [" + moneda_hacia + "]");
        System.out.println("\n");
    }


}
