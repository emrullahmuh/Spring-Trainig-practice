package com.cydeo;

import com.cydeo.Config.PcConfig;
import com.cydeo.casefactory.Case;
import com.cydeo.monitorfactory.Monitor;
import com.cydeo.motherboardfactory.AsusMotherboard;
import com.cydeo.motherboardfactory.Motherboard;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComputerTest {
    public static void main(String[] args) {
       ApplicationContext container=new AnnotationConfigApplicationContext(PcConfig.class);
     //   Monitor themon=container.getBean(Monitor.class);
   //     Motherboard themoth=container.getBean(Motherboard.class);
        Case thecase=container.getBean(Case.class);

        System.out.println(thecase.getDimensions().getDepth());
    }
}
