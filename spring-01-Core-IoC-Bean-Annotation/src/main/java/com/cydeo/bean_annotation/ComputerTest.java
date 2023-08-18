package com.cydeo.bean_annotation;

import com.cydeo.bean_annotation.casefactory.Case;
import com.cydeo.bean_annotation.casefactory.DellCase;
import com.cydeo.bean_annotation.config.ComputerConfigration;
import com.cydeo.bean_annotation.monitorfactory.Monitor;
import com.cydeo.bean_annotation.monitorfactory.SonyMonitor;
import com.cydeo.bean_annotation.motherboardfactory.AsusMotherboard;
import com.cydeo.bean_annotation.motherboardfactory.Motherboard;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.module.Configuration;

public class  ComputerTest {
    public static void main(String[] args) {

        //creating container by using application context
        ApplicationContext container=new AnnotationConfigApplicationContext(ComputerConfigration.class);

        //creating container by using BeanFactory
        BeanFactory container2=new AnnotationConfigApplicationContext();


        SonyMonitor sony=container.getBean(SonyMonitor.class);
        AsusMotherboard asus=container.getBean(AsusMotherboard.class);
        DellCase dell =container.getBean(DellCase.class);

        PC newpc =new PC(dell,sony,asus);
        newpc.powerUp();

        System.out.println("----------------------------------------");
        Monitor theMonitor=container.getBean(Monitor.class);
        Motherboard theMotherboard=container.getBean(Motherboard.class);
        Case theCase =container.getBean(Case.class);

        PC  Secondpc =new PC(theCase,theMonitor,theMotherboard);
        newpc.powerUp();

        System.out.println("----------Multiple Objects-------------");

 //   Monitor theMonitor2=container.getBean("AcerMonitor",Monitor.class);//Default bean name
Monitor theasusmonitor=container.getBean("asus",Monitor.class);//CUSTOM BEAN NAME
        Monitor theasusmonitor3=container.getBean(Monitor.class);//@Primary


    }
}
