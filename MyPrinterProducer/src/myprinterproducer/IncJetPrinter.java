/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myprinterproducer;

/**
 *
 * @author LeeJaeseok
 */
public class IncJetPrinter {

    private String category = "IncJet";
    private String printerName;
    String dpi = "4800*1200";
    boolean supportColor = false;
    boolean supportSmartPrint = false;
    boolean supportEComplaint = false;
    boolean supportWireless = false;
    boolean supportWired = false;

    public IncJetPrinter(String printerName) {
        this.printerName = printerName;
        System.out.println("Printer Name : " + this.printerName);
    }

    public IncJetPrinter(String category, String printerName) {
        this(printerName);
        this.category = category;
        System.out.println("Category : " + this.category);
    }

    public IncJetPrinter(String category, String printerName, String dpi) {
        this(category, printerName);
        this.dpi = dpi;
        System.out.println("DPI : " + this.dpi);
    }

    public IncJetPrinter(String category, String printerName, String dpi, boolean supportColor,
            boolean supportSmartPrint, boolean supportEComplaint, boolean supportWireless, boolean supportWired) {
        this(category, printerName, dpi);
        this.supportColor = supportColor;
        this.supportSmartPrint = supportSmartPrint;
        this.supportEComplaint = supportEComplaint;
        this.supportWireless = supportWireless;
        this.supportWired = supportWired;
        System.out.println("Does Printer Support Color? : " + this.supportColor);
        System.out.println("Does Printer Support Smart Printing? : " + this.supportSmartPrint);
        System.out.println("Does Printer Support E-Complaint? : " + this.supportEComplaint);
        System.out.println("Does Printer Support Wireless? : " + this.supportWireless);
        System.out.println("Does Printer Support Wired? : " + this.supportWired);
    }

    public String getPrinterName() {
        return this.printerName;
    }

    public void setPrinterName(String printerName) {
        this.printerName = printerName;
    }
}
