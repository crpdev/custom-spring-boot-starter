package com.crpdev.greeter.autoconfigure.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by rajapandian
 * Date: 21/06/20
 * Project: custom-spring-boot-starter
 * Package: com.crpdev.boot.starter.properties
 **/

@ConfigurationProperties(prefix = "crpdev.greeter")
public class GreeterProperties {

    private String userName;
    private String morningMessage;
    private String afternoonMessage;
    private String eveningMessage;
    private String nightMessage;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMorningMessage() {
        return morningMessage;
    }

    public void setMorningMessage(String morningMessage) {
        this.morningMessage = morningMessage;
    }

    public String getAfternoonMessage() {
        return afternoonMessage;
    }

    public void setAfternoonMessage(String afternoonMessage) {
        this.afternoonMessage = afternoonMessage;
    }

    public String getEveningMessage() {
        return eveningMessage;
    }

    public void setEveningMessage(String eveningMessage) {
        this.eveningMessage = eveningMessage;
    }

    public String getNightMessage() {
        return nightMessage;
    }

    public void setNightMessage(String nightMessage) {
        this.nightMessage = nightMessage;
    }
}
