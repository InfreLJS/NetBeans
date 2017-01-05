/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myoopprinterproducer;

import java.util.ArrayList;

/**
 *
 * @author LeeJaeseok
 */
public class MyPrinterManager {

    ArrayList<IncJetPrinter> printers;

    public MyPrinterManager() {
        this.printers = new ArrayList<>();
    }

    public String addPrinter(String printerName) {
        for (IncJetPrinter item : printers) {
            if (item.getPrinterName().equals(printerName)) {
                printers.remove(item);
                break;
            }
        }
        printers.add(new IncJetPrinter(printerName));
        incCount();
        return printerName;
    }

    public boolean removePrinter(String name) {
        for (IncJetPrinter item : printers) {
            if (item.getPrinterName().equals(name)) {
                printers.remove(item);
                decCount();
                return true;
            }
        }
        return false;
    }

    static int modelCount = 0;

    public int incCount() {
        modelCount++;
        return modelCount;
    }

    public int decCount() {
        modelCount--;
        if (modelCount < 0) {
            modelCount = 0;
        }
        return modelCount;
    }

    public String getModelName() {
        return (String.valueOf(modelCount));
    }

    public int getModelCount() {
        return printers.size();
    }
}
