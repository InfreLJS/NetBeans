/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myinheritedprinter;

import java.util.Calendar;

/**
 *
 * @author LeeJaeseok
 */
public class IncJetPrinter {

    private String category = "IncJet";
    private String printerName;
    private String releasedYear;
    private int totalPrintingCount = 0;
    String dpi = "4800*1200";
    boolean supportColor = false;
    boolean supportSmartPrint = false;
    boolean supportEComplaint = false;
    boolean supportWireless = false;
    boolean supportWired = false;
    boolean inkError = false;
    int maxPrintingCount = 100;

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

    public String getReleasedYear() {
        Calendar now = Calendar.getInstance();
        String strReturn = new String("단종된 모델입니다.");
        int currentYear = now.get(Calendar.YEAR);
        int rYear = Integer.parseInt(releasedYear);
        if ((currentYear - rYear) >= 20) {
            return strReturn;
        }
        return releasedYear;
    }

    public void setReleasedYear(String year) {
        releasedYear = year;
    }

    public void print() {
        totalPrintingCount++;
        if (totalPrintingCount > maxPrintingCount) {
            System.out.println(getPrinterName() + " 잉크오류");
            inkError = true;
        }
    }

    public void requestAS() {
        inkError = false;
        totalPrintingCount = 0;
        System.out.println("A/S가 완료되었습니다.");
    }

    public static void main(String[] args) {
        IncJetPrinter[] printers = {
            new IncJetPrinter("Printer 1"),
            new IncJetPrinter_2016("Printer 2", true)
        };

        int i = 1;

        while (i++ <= 1001) {
            for (IncJetPrinter p : printers) {
                if (!(p.inkError)) {
                    p.print();
                }
            }
        }
    }
}
