package org.cydeo.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;
@Configuration

@ConfigurationProperties(prefix = "db")
@Data
public class DBConfig {

    private String username;
    private String password;
    private List<String> type;
}
