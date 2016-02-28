/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gkopevski.fuelcheck;

import com.gkopevski.interfaces.IFuelEntryService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 *
 * @author gkopevski
 */
@Component
public class SpringContextBridge implements SpringContextBridgedServices, ApplicationContextAware {

    private static ApplicationContext applicationContext;

    @Autowired
    private IFuelEntryService fuelEntryService; //Autowire the TaxService

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) 
            throws BeansException {
        this.applicationContext = applicationContext;
    }

    /**
     * A static method to lookup the SpringContextBridgedServices Bean in 
     * the applicationContext. It is basically an instance of itself, which 
     * was registered by the @Component annotation.
     *
     * @return the SpringContextBridgedServices, which exposes all the 
     * Spring services that are bridged from the Spring context.
     */
    public static SpringContextBridgedServices services() {
        return applicationContext.getBean(SpringContextBridgedServices.class);
    }
   
//    @Override
    public IFuelEntryService getFuelEntryService() {
        return fuelEntryService; //Return the Autowired taxService
    }
    
}
