package org.feidao.starter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by feidao on 2019-09-19.
 */
@Configuration
@ConfigurationProperties //web应用才生效
@EnableConfigurationProperties(StartProperties.class)
public class StartAutoConfiguration {

    @Autowired
    private StartProperties startProperties;

    @Bean
    public StartService helloService() {
        StartService startService = new StartService();
        startService.setStartProperties(startProperties);
        return startService;
    }

}
