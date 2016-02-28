/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gkopevski.service;

import com.gkopevski.interfaces.IFuelEntryService;
import com.gkopevski.model.FuelEntry;
import com.gkopevski.repository.FuelEntryRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author gkopevski
 */
@Service
@Transactional
public class FuelEntryServiceImpl implements IFuelEntryService {

    @Autowired
    private FuelEntryRepository fuelEntryRepository;

    @Override
    public FuelEntry saveFuelEntry(FuelEntry fuelEntry) {
        fuelEntryRepository.save(fuelEntry);
        return fuelEntry;
    }

    @Override
    public List<FuelEntry> getAllFuelEntries() {
        List<FuelEntry> result = fuelEntryRepository.getAllFuelEntries();
        return result;
    }
    
}