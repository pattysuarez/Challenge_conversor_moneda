//import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Tasas {

    public static final String API_URL = "https://v6.exchangerate-api.com/v6/48230b9660fc0452e016761a/latest/USD";

    public static JsonObject obtenerTasas() {
      try{
          //CONEXION CON EL URL PARA OBTENER LAS TASAS
          URL url = new URL(API_URL);

          HttpURLConnection conn = (HttpURLConnection) url.openConnection();
          conn.setRequestMethod("GET");

          BufferedReader lectura = new BufferedReader(new InputStreamReader(conn.getInputStream()));
          StringBuilder jsonText = new StringBuilder();
          String fila;

          //LEE TODAS LAS TASAS CON SU  MONEDA
          while ((fila = lectura.readLine()) != null){
              jsonText.append(fila);
          }
          lectura.close();

         // Gson gson = new Gson();
          JsonObject jsonObject = JsonParser.parseString(jsonText.toString()).getAsJsonObject();

          return jsonObject.getAsJsonObject("conversion_rates");

      } catch (Exception e) {
          System.out.println("Error al conectar con la API: " + e.getMessage());
          return null;
      }
    }
}
