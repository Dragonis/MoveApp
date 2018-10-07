package pl.warsaw.moveapp;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;
import pl.warsaw.moveapp.Beer.BeerInitializeDatabase;

@Configuration
@EnableScheduling
@AllArgsConstructor
@Slf4j
public class SchedulerConfig implements SchedulingConfigurer {

    private BeerInitializeDatabase initialize;

    @Override
    public void configureTasks(ScheduledTaskRegistrar taskRegistrar) {
        taskRegistrar.addFixedRateTask(new Runnable() {
            @Override
            public void run() {
                    log.info("Triggered getAllBeersFromExternalAPI method");
                    initialize.getAllBeersFromExternalAPI();
            }
        }, initialize.getDatabaseUpdateFixturesInMinutes());
    }
}