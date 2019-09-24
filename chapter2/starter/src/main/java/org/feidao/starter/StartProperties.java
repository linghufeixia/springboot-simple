package org.feidao.starter;

import org.springframework.boot.context.properties.ConfigurationProperties;
/**
 * Created by feidao on 2019-09-19.
 */
@ConfigurationProperties(prefix = "starter")
public class StartProperties {
    private String config;

    public String getConfig() {
        return config;
    }

    public void setConfig(String config) {
        this.config = config;
    }
}
