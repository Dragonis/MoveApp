package pl.warsaw.moveapp;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;
import pl.warsaw.moveapp.Beer.AppProperties;
import pl.warsaw.moveapp.Beer.BeerInitializationDatabase;

@Configuration
@EnableScheduling
public class SchedulerConfig implements SchedulingConfigurer {

    private AppProperties properties;

    private BeerInitializationDatabase initialize;

    public SchedulerConfig(BeerInitializationDatabase initialize, Environment env) {
        this.initialize = initialize;
        this.properties = new AppProperties(env);
    }

    @Override
    public void configureTasks(ScheduledTaskRegistrar taskRegistrar) {
        taskRegistrar.addFixedRateTask(new Runnable() {
            @Override
            public void run() {
                    // methods runs every period time
                    initialize.getAllBeersFromExternalAPI();
            }
        }, properties.getPeriodTimeInMinutes());
    }
}