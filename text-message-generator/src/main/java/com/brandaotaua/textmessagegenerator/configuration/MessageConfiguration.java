package com.brandaotaua.textmessagegenerator.configuration;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("message-generator")
@NoArgsConstructor
@Getter
@Setter
public class MessageConfiguration {

    private String welcome;
    private String welcomeMessage;
    private String bye;
    private String byeMessage;

}
