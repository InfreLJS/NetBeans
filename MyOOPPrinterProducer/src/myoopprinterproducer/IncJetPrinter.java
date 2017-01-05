/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myoopprinterproducer;

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
        if (totalPrintingCount > 100) {
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
        IncJetPrinter p1 = new IncJetPrinter("p1");
        IncJetPrinter_1970 p2 = new IncJetPrinter_1970("p2");
        IncJetPrinter_1980 p3 = new IncJetPrinter_1980("p3");
        IncJetPrinter_1999 p4 = new IncJetPrinter_1999("p4");
        IncJetPrinter_2000 p5 = new IncJetPrinter_2000("p5");
        IncJetPrinter_2005 p6 = new IncJetPrinter_2005("p6");
        IncJetPrinter_2012 p7 = new IncJetPrinter_2012("p7");
        IncJetPrinter_2016 p8 = new IncJetPrinter_2016("p8");
        int i = 1;

        while (i <= 1001) {
            System.out.println(i++ + "번째 프린트");
            if (!(p1.inkError)) {
                p1.print();
            }
            if (!(p2.inkError)) {
                p2.print();
            }
            if (!(p3.inkError)) {
                p3.print();
            }
            if (!(p4.inkError)) {
                p4.print();
            }
            if (!(p5.inkError)) {
                p5.print();
            }
            if (!(p6.inkError)) {
                p6.print();
            }
            if (!(p7.inkError)) {
                p7.print();
            }
            if (!(p8.inkError)) {
                p8.print();
            }
        }
    }
}
