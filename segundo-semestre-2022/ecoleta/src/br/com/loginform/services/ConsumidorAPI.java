package br.com.loginform.services;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class ConsumidorAPI {

    private static final String URL_BASE = "https://servicodados.ibge.gov.br/api/v1/localidades/";

    private static ConsumidorAPI instance;

    private final CloseableHttpClient clientHttp;

    private ConsumidorAPI() {
        this.clientHttp = HttpClients.createDefault();
    }

    public static ConsumidorAPI getInstance() {
        if (instance == null) {
            instance = new ConsumidorAPI();
        }

        return instance;
    }

    public String doRequest(String path) {
        String responseBody = null;

        try {
            HttpGet httpGet = new HttpGet(ConsumidorAPI.URL_BASE + path);

            ResponseHandler<String> responseHandler = (final HttpResponse response) -> {
                int status = response.getStatusLine().getStatusCode();
                if (status >= 200 && status <= 300) {
                    HttpEntity entity = response.getEntity();
                    return entity != null ? EntityUtils.toString(entity) : null;
                } else {
                    throw new ClientProtocolException("Unexpected response status: " + status);

                }
            };

            responseBody = this.clientHttp.execute(httpGet, responseHandler);
            System.out.println("------------------------------------------------------------------------");
        } catch (IOException ex) {
            Logger.getLogger(ConsumidorAPI.class.getName()).log(Level.SEVERE, null, ex);
        }

        return responseBody;
    }
}
