/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myinheritedprinter;

/**
 *
 * @author LeeJaeseok
 */
public class IncJetPrinter_2016 extends IncJetPrinter {

    private boolean doubleSidedEnable;
    int maxPrintingCount = 101;

    public IncJetPrinter_2016(String printerName) {
        super(printerName);
    }

    public IncJetPrinter_2016(String printerName, boolean doubleSidedEnable) {
        super(printerName);
        this.doubleSidedEnable = doubleSidedEnable;
    }

    public IncJetPrinter_2016(String category, String printerName) {
        super(category, printerName);
    }

    public IncJetPrinter_2016(String category, String printerName, String dpi) {
        super(category, printerName, dpi);
    }

    public IncJetPrinter_2016(String category, String printerName, String dpi, boolean supportColor,
            boolean supportSmartPrint, boolean supportEComplaint, boolean supportWireless, boolean supportWired) {
        super(category, printerName, dpi, supportColor, supportSmartPrint, supportEComplaint, supportWireless, supportWired);
    }

}
