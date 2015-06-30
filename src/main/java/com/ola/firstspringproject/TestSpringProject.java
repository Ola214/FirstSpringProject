/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ola.firstspringproject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Olaa
 */
public class TestSpringProject {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
        //9. ((AbstractApplicationContext)context).registerShutdownHook();//jezeli tego uzyje spring usunie wszystkie beany w nim w mainie (?), jak tego nie bedzie to destroy sie nie wyswietli
        Restaurant restaurantObj = (Restaurant)context.getBean("restaurantBean");
        // 1. restaurantObj.greetCustomer();
        // 3.restaurantObj.prepareHotDrink();
        // 4.restaurantObj.displayWaitersNames();
        /*5.restaurantObj.setWelcomeNote("Object1 is setting welcome note property");
        restaurantObj.greetCustomer();
        
        Restaurant restaurantObj2 = (Restaurant)context.getBean("restaurantBean");
        restaurantObj2.greetCustomer(); //scope = prototype zwroci null, kazda instancja dla kazdego nowego obiektu kiedykolwiek jest potrzebny
        //scope = singleton jedna instancja obiektu, zwroci Object1 is setting welcome note property
        */
        restaurantObj.greetCustomer();
    }
}
