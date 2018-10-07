package pl.warsaw.moveapp.Beer;

import com.google.gson.Gson;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import pl.warsaw.moveapp.Beer.Dto.BeerDto;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

@Component
@Slf4j
@AllArgsConstructor
public class BeerInitializeDatabase {

    private Environment env;

    public BeerDto[] getAllBeersFromExternalAPI() {

        URL url = null;
        try {
            url = new URL(getExternalWebserviceUrl());
        } catch (MalformedURLException e) {
            log.debug("Error for bad URI address: {}", e.getMessage());
        }

        InputStreamReader reader = null;
        try {
            reader = new InputStreamReader(url.openStream());
        } catch (IOException e) {
            log.debug("Error for bad JSON data: {}", e.getMessage());
        }

        BeerDto[] dtos = null;
        try {
            dtos = new Gson().fromJson(reader, BeerDto[].class);
        } catch (Exception e) {
            log.debug("Error for Dto mappring: {}", e.getMessage());
        }

        return dtos;
    }

    public Long getDatabaseUpdateFixturesInMinutes() { return Long.valueOf(env.getProperty("database.fixtures.update.period")) * 1000 * 60; }

    public String getExternalWebserviceUrl() { return env.getProperty("rest.external.url"); }

}
