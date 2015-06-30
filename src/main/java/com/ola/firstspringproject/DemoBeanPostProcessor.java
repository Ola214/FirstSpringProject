/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ola.firstspringproject;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;

/**
 *
 * @author Olaa
 */
public class DemoBeanPostProcessor implements BeanPostProcessor, Ordered{

    @Override
    public Object postProcessBeforeInitialization(Object o, String string) throws BeansException {//o actual bean instance, string - name
        System.out.println("DemoBeanPostProcessor processing bean instance before initialization (i.e. after spring instantiates bean and before init life cycle event) of: "+o);
        return o;
    }

    @Override
    public Object postProcessAfterInitialization(Object o, String string) throws BeansException {
        System.out.println("DemoBeanPostProcessor processing bean instance after initialization (i.e. just after init life cycyle event) of: "+o);
        return o;
    }

    @Override
    public int getOrder() {
        return 1;
    }
    
}
