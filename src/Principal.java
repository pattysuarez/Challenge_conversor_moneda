import com.google.gson.JsonObject;
import java.util.Scanner;

public class Principal {

        public static void main(String[] args) {

    /*Pattysuarezsantos@gmail.com
    curso alura java
    Challenge conversor de monedas especificas
    */
        //LEER TASAS SEGUN MONEDA
        JsonObject tasas = Tasas.obtenerTasas();

        if (tasas == null){
            System.out.println("No se pudieron obtener las tasas de cambio!");
            return;
        }

        int opcion = 0;
        double valor = 0;

        String menu = """
                ************************************************
                Sea bienvenid@ al Conversor de Moneda :)
                
                1. Dólar [USD] --> Peso Argentino [ARS]
                2. Peso Argentino [ARS]--> Dólar [USD]
                3. Dólar [USD] --> Real Brasileño [BRL]
                4. Real Brasileño [BRL] --> Dólar [USD]
                5. Dólar [USD] --> Peso colombiano [COP]
                6. Peso colombiano [COP] --> Dolar [USD]
                7. Salir
                
                Elija una opción válida:
                ********************************************** 
                """;

        Scanner lectura = new Scanner(System.in);

        while (opcion != 7){
            //imprime menu
            System.out.println(menu);
            opcion = lectura.nextInt();

            if (opcion == 7) {
                System.out.println("Saliendo del programa, Gracias por utilizar el conversor de monedas");
                break;
            }

            switch (opcion){
                case 1: //Dólar [USD] --> Peso Argentino [ARS]
                    ConvertirMoneda.nuevaMoneda( tasas, "USD", "ARS", lectura);
                    break;

                case 2: //Peso Argentino [ARS]--> Dólar [USD]
                    ConvertirMoneda.nuevaMoneda( tasas, "ARS", "USD", lectura);
                    break;

                case 3: //Dólar [USD] --> Real Brasileño [BRL]
                    ConvertirMoneda.nuevaMoneda( tasas, "USD", "BRL", lectura);
                    break;

                case 4: //Real Brasileño [BRL] --> Dólar [USD]
                    ConvertirMoneda.nuevaMoneda(tasas,"BRL", "USD", lectura);
                    break;

                case 5: // Dólar [USD] --> Peso colombiano [COP]
                    ConvertirMoneda.nuevaMoneda( tasas, "USD", "COP", lectura);
                    break;

                case 6: //Peso colombiano [COP] --> Dolar [USD]
                    ConvertirMoneda.nuevaMoneda(tasas,"COP", "USD", lectura);
                    break;

                default:
                    System.out.println("Opción no válida!");
            }
        }
    }
}
