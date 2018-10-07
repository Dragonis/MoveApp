package pl.warsaw.moveapp.Beer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
class BeerConfiguration {

    @Bean
    BeerFacade BeerConfiguration(BeerRepository repository, Environment env) {
        return new BeerFacade(repository, new BeerFactory(), env);
    }
}


