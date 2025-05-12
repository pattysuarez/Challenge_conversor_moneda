import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

    /*Pattysuarezsantos@gmail.com
    curso alura java
    Challenge conversor de monedas especificas
    */

        int opcion = 0;
        double valor = 0;
        final String moneda_us = "[USD]";

        String menu = """
                ************************************************
                Sea bienvenid@ al Conversor de Moneda :)
                
                1. Dólar [USD] --> Peso Argentino
                2. Peso Argentino --> Dólar [USD]
                3. Dólar [USD] --> Real Brasileño
                4. Real Brasileño --> Dólar [USD]
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
                case 1: //Dólar (US) --> Peso Argentino
                    System.out.println("El valor: " + valor + "[USD]");
                    break;

                case 2: //Peso Argentino --> Dólar (US)
                    break;

                case 3:
                    break;

                case 4:
                    break;

                case 5: // Dólar (US) --> Peso colombiano
                    ConvertirMoneda.conversor("USD", "COP", lectura);
                    break;

                case 6:
                    ConvertirMoneda.conversor("COP", "USD", lectura);
                    break;

               // case 7:
                 //   System.out.println("Saliendo del programa, Gracias por utilizar el conversor de monedas");
                  //  break;

                default:
                    System.out.println("Opción no válida!");
            }
        }
    }



}
