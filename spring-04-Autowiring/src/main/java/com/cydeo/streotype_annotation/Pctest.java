package com.cydeo.streotype_annotation;

import com.cydeo.streotype_annotation.Config.PcConfig;
import com.cydeo.streotype_annotation.casefactory.Case;
import com.cydeo.streotype_annotation.casefactory.DellCase;
import com.cydeo.streotype_annotation.monitorfactory.Monitor;
import com.cydeo.streotype_annotation.monitorfactory.SonyMonitor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLOutput;
import java.util.concurrent.CancellationException;

public class Pctest {
    public static void main(String[] args) {
        ApplicationContext container=new AnnotationConfigApplicationContext(PcConfig.class);

        PC pc=container.getBean(PC.class);
        pc.powerUp();
        System.out.println(container.getBean(DellCase.class).getDimensions().getDepth());
    }
}
