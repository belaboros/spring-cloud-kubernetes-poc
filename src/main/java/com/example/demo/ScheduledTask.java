package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.concurrent.atomic.AtomicInteger;

@Configuration
@EnableScheduling
public class ScheduledTask {

    private static final AtomicInteger counter = new AtomicInteger();

    /* Content of config is reloaded if you upload/change K8S ConfigMap called spring-cloud-kubernetes-poc */
    @Autowired
    private MyConfig config;

    @Scheduled(fixedRate = 2000)
    public void scheduleFixedDelayTask() {
        OffsetDateTime utcNow = OffsetDateTime.now(ZoneOffset.UTC);
        System.out.println(
                Integer.toString(counter.incrementAndGet()) + ". "
                        + config.getMessage()
                        + " - " + utcNow);
    }
}
