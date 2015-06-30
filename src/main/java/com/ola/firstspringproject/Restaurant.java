/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ola.firstspringproject;

import java.util.List;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 *
 * @author Olaa
 */
public class Restaurant /*implements InitializingBean, DisposableBean*/{
    
/*1.    String welcomeNote;

    public String getWelcomeNote() {
        return welcomeNote;
    }

    public void setWelcomeNote(String welcomeNote) {
        this.welcomeNote = welcomeNote;
    }
    
    public void greetCustomer(){
        System.out.println(welcomeNote);
    }
*/
//3.    private HotDrinkInterface hotDrink;
    
/*2.public Restaurant(HotDrinkInterface hotDrink){
        this.hotDrink = hotDrink;
    }
*/
/*3    public void setHotDrink(HotDrinkInterface hotDrink){
        this.hotDrink = hotDrink;
    }
    public void prepareHotDrink(){
        hotDrink.prepareHotDrink();
    }
*/
    
/*4    private List restaurantWaitersList;

    public void setRestaurantWaitersList(List restaurantWaitersList) {
        this.restaurantWaitersList = restaurantWaitersList;
    }
    
    public void displayWaitersNames(){
        System.out.println("All waiters working in Restaurant: " + restaurantWaitersList);
    }
*/
/*5    private String welcomeNote;

    public void setWelcomeNote(String welcomeNote) {
        this.welcomeNote = welcomeNote;
    }
    
    public void greetCustomer(){
        System.out.println(welcomeNote);
    }
*/

/*7 
    @PostConstruct //jak nie masz w SpringConfig init-method="init
    public void init(){
        System.out.println("Restaurant bean is going through init");
    }
    
    @PreDestroy
    public void destroy(){
        System.out.println("Bean will be destroyed now");
    }
*/

 /*8   @Override
    public void afterPropertiesSet() throws Exception { //spring jezeli znajdzie ta metode to od razu ja wywoluje po inicjacji
        System.out.println("Restaurant Bean is going through afterPropertiesSet");
    }

    @Override
    public void destroy() throws Exception { //wywoluje sie zaraz przed usunieciem beana
        System.out.println("Restaurant Bean is being destroyed now");
    }
*/
    
/*9    public void greetCustomer(){
        System.out.println("Welcome dear customer!! This is the Life Cycle demo");
    }
        
    public void init(){
        System.out.println("Restaurant Bean is going through init");
    }
    
    public void destroy(){
        System.out.println("Restaurant Bean is being destroyed now");
    }
*/
    private String welcomeNote;

    public void setWelcomeNote(String welcomeNote) {
        this.welcomeNote = welcomeNote;
    }
    
    public void greetCustomer(){
        System.out.println(welcomeNote);
    }
}
