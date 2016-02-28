/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gkopevski.interfaces;

import com.gkopevski.model.FuelEntry;
import java.util.List;

/**
 *
 * @author gkopevski
 */
public interface IFuelEntryService {

    FuelEntry saveFuelEntry(FuelEntry fuelEntry);

    List<FuelEntry> getAllFuelEntries();

}
