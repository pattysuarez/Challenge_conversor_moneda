import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

    /*Pattysuarezsantos@gmail.com
    curso alura java
    Challenge conversor de monedas especificas
    */

        int opcion = 0;
        double valor = 0;


        String menu = """
                ************************************************
                Sea bienvenid@ al Conversor de Moneda :)
                
                1. Dólar (US) --> Peso Argentino
                2. Peso Argentino --> Dólar (US)
                3. Dólar (US) --> Real Brasileño
                4. Real Brasileño --> Dólar (US)
                5. Dólar (US) --> Peso colombiano
                6. Peso colombiano --> Dolar (US)
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

            System.out.println("Ingrese el valor que deseas convertir> ");
            valor = lectura.nextDouble();

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

                case 5:
                    break;

                case 6:
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
