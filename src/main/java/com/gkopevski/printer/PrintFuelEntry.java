/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gkopevski.printer;

import com.gkopevski.fuelcheck.FuelCheckForm;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;

/**
 *
 * @author gkope
 */
public class PrintFuelEntry implements Printable {

    @Override
    public int print(Graphics g, PageFormat pf, int page) throws PrinterException {
        // We have only one page, and 'page'
        // is zero-based
        if (page > 0) {
            return NO_SUCH_PAGE;
        }

        // User (0,0) is typically outside the
        // imageable area, so we must translate
        // by the X and Y values in the PageFormat
        // to avoid clipping.
        Graphics2D g2d = (Graphics2D) g;
        g2d.translate(pf.getImageableX(), pf.getImageableY());

        // Now we perform our rendering
        if(FuelCheckForm.latestFE !=null){
            
            g.drawString("Polnenje", 10, 10);
            g.drawString("Izvrshil: " + FuelCheckForm.latestFE.getDriver(), 10, 20);
            
            
        }else{
            g.drawString("Hello world!", 10, 10);
        }
        

        // tell the caller that this page is part
        // of the printed document
        return PAGE_EXISTS;
    }
    
    
     public void printLatestEntry() {
         try {
             
            PrinterJob job = PrinterJob.getPrinterJob();
            job.setPrintable(this);
            
            /**
             * Commented this in order to avoid wizard for printer selection
            */
//            boolean ok = job.printDialog();
//            if (ok) {
                try {
                    job.print();
                } catch (PrinterException ex) {
                    /* The job did not successfully complete */
                }
//            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    

}
