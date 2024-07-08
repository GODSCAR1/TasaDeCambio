import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Consultar {
    public Cambio ConsultaCambio(String sigla1, String sigla2, double valor){
        String YOUR_API_KEY = "";
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/" + YOUR_API_KEY +"/pair/" + sigla1 +
                "/" + sigla2+ "/" + valor);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        HttpResponse<String> response = null;
        try {
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());


            return new Gson().fromJson(response.body(), Cambio.class);
        }
        catch (Exception e) {
            throw new RuntimeException("Error al encontrar la tasa de cambio");
        }
    }
}
