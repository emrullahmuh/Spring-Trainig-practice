package com.cydeo.streotype_annotation.Config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.cydeo") //(basePackages= "com.cydeo")//if dont give where to scan ,it just will scan just one package
public class PcConfig {
}
