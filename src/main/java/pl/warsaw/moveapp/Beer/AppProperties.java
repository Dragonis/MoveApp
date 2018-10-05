package pl.warsaw.moveapp.Beer;

import org.springframework.core.env.Environment;

public class AppProperties {

    private Environment env;

    public AppProperties(Environment env) {
        this.env = env;
    }

    public Long getPeriodTimeInMinutes() {
        Long miliseconds = Long.valueOf(env.getProperty("database.fixtures.update.period"));
        Long seconds = miliseconds * 1000;
        Long minutes  = seconds * 60;
        return minutes;
    }

    public String getExternalWebserviceUrl() {
        return env.getProperty("rest.external.url");
    }

}
