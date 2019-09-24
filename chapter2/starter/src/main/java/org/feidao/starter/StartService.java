package org.feidao.starter;
/**
 * Created by feidao on 2019-09-19.
 */
public class StartService {
    private StartProperties startProperties;

    public StartProperties getStartProperties() {
        return startProperties;
    }

    public void setStartProperties(StartProperties startProperties) {
        this.startProperties = startProperties;
    }

    public String print(){
        return  startProperties.getConfig();
    }
}
