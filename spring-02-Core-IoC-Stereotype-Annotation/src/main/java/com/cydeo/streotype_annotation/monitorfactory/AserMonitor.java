package com.cydeo.streotype_annotation.monitorfactory;

import org.springframework.stereotype.Component;

@Component

public class AserMonitor extends Monitor {

    public AserMonitor(String model, String manufacturer, int size) {
        super("sws2","ed32",34);
    }

    @Override
    public void drawPixelAt() {

    }
}
