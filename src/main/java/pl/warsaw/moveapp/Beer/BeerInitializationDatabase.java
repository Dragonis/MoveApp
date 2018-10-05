package pl.warsaw.moveapp.Beer;

import com.google.gson.Gson;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import pl.warsaw.moveapp.Beer.Dto.BeerDto;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

@Component
public class BeerInitializationDatabase {

    private Gson gson;
    private AppProperties properties;

    public BeerInitializationDatabase(Environment env) {
        this.gson = new Gson();
        this.properties = new AppProperties(env);
    }

    public BeerDto[] getAllBeersFromExternalAPI() {

        URL url = null;
        try {
            url = new URL(properties.getExternalWebserviceUrl());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        InputStreamReader reader = null;
        try {
            reader = new InputStreamReader(url.openStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
        BeerDto[] dtos = new Gson().fromJson(reader, BeerDto[].class);

        return dtos;
    }

}
