package br.com.loginform.utils;

import br.com.loginform.model.Municipios;
import br.com.loginform.model.Ufs;
import br.com.loginform.services.ConsumidorAPI;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;

public class Utils {

    public static void deserializeUf(JComboBox combo) {

        ConsumidorAPI consumidor = ConsumidorAPI.getInstance();
        String jsonEstados = consumidor.doRequest("estados");

        Type ufsTypes = new TypeToken<ArrayList<Ufs>>() {
        }.getType();

        List<Ufs> ufs = new Gson().fromJson(jsonEstados, ufsTypes);
        List<String> siglasUfs = new ArrayList<>();

        for (Ufs item : ufs) {
            siglasUfs.add(item.getSigla());
        }

        for (String item : siglasUfs) {
            combo.addItem(item);
        }
    }

    public static void deserializeMunicipios(JComboBox combo, String sigla) {

        ConsumidorAPI consumidor = ConsumidorAPI.getInstance();
        String jsonMunicipios = consumidor.doRequest("estados/" + sigla + "/municipios");

        Type municipiosTypes = new TypeToken<ArrayList<Municipios>>() {
        }.getType();

        List<Municipios> namesMunicipios = new Gson().fromJson(jsonMunicipios, municipiosTypes);
        List<String> names = new ArrayList<>();

        for (Municipios item : namesMunicipios) {
            names.add(item.getNome());
        }

        for (String item : names) {
            combo.addItem(item);
        }
    }
}
