/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gkopevski.utility;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author gkope
 */
public class Utility {

    /**
     * 2 letters (regardless) + (todays date + 10) + (month+10); example: tt1513
     * aka tt 05+10 03+10
     *
     * @return
     */
    public static String generatePassword() {
        String password = "tt";
        password += (Calendar.getInstance().get(Calendar.DAY_OF_MONTH) + 10);
        password += (Calendar.getInstance().get(Calendar.MONTH) + 1 + 10);
        return password;
    }

}
