/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gkopevski.fuelcheck;

import com.gkopevski.interfaces.IFuelEntryService;

/**
 *
 * @author gkopevski
 */
public interface SpringContextBridgedServices {
    
    IFuelEntryService getFuelEntryService();
}
