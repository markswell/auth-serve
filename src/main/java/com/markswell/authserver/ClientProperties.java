package com.markswell.authserver;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("server.security")
public class ClientProperties {

    private String user;

    private String secret;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    @Override
    public String toString() {
        return "ClientProperties{" +
                "user='" + user + '\'' +
                ", secret='" + secret + '\'' +
                '}';
    }
}
