/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ola.firstspringproject;

/**
 *
 * @author Olaa
 */
public class Tea implements HotDrinkInterface{

    @Override
    public void prepareHotDrink() {
        System.out.println("Dear customer, we are preparing Tea for you");
    }
    
}
