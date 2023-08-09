package org.cydeo.Module.Config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("org.cydeo")
//do one by one
@ComponentScan(basePackages = {"org.cydeo.Module","org.cydeo.Proxy","org.cydeo.Repository","org.cydeo.Service"})

public class comConfig {

}
