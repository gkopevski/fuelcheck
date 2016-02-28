/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gkopevski.utility;

import com.gkopevski.model.FuelEntry;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author gkopevski
 */
public final class FuelEntryFactory {
    public static FuelEntry createFunnelEntry() {
        FuelEntry fuelEntry = new FuelEntry();
        fuelEntry.setDispenzer(2);
        fuelEntry.setDriver("driver");
        fuelEntry.setMeasurementUnit("L");
        fuelEntry.setProduct("product");
        fuelEntry.setQuantity(new BigDecimal("10.2"));
        fuelEntry.setStartDate(new Date());
        fuelEntry.setVehicle("vehicle");
        return fuelEntry;
    }
}
