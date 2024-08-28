import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Printer extends Object {
    private String brand;
    private int pages;
    private boolean color;
    private String firmwareVersion;

    public Printer(String brand, int pages, boolean color, String firmwareVersion) {
        this.brand = brand;
        this.pages = pages;
        this.color = color;
        this.firmwareVersion = firmwareVersion;
    }

    public Printer(String brand) {
        // constructor
        // overloaded constructor...
        // default no-arg is now gone - unless
        // I provide one
        this.brand = brand;
        pages = 0;
        color = true;
        firmwareVersion = "0.1a";
    }

    public Printer() {
        // default no arg
        this("HP");
    }

    public void setColor(boolean color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public int getPages() {
        return pages;
    }

    public boolean isColor() {
        return color;
    }

    public String getFirmwareVersion() {
        return firmwareVersion;
    }

    public void print(String stuff) {
        int numPages = stuff.length()/1000;
        pages++;
        // print...
    }

    @Override
    public String toString() {
        return "Printer{" +
                "brand='" + brand + '\'' +
                ", pages=" + pages +
                ", color=" + color +
                ", firmwareVersion='" + firmwareVersion + '\'' +
                '}';
    }
}
class Main {
    public static void main(String[] args) {
        ArrayList<Printer> myPrinterCollection = new ArrayList<>();
        /*
        1. read the file
        2. parse the file
         */

        File printerDataFile = new File("src/printerData.csv");
        try {
            Scanner printerFileReader = new Scanner(printerDataFile);

            // save the first row/header row
            String headerRow = printerFileReader.nextLine();

            while(printerFileReader.hasNextLine()) {
                String printerInfo = printerFileReader.nextLine();
                String[] printInfoSplit = printerInfo.split(",");
                boolean color = true;
                if (printInfoSplit[1].trim().equals("color")) {
                    color = true;
                } else if (printInfoSplit[1].trim().equals("black and white")) {
                    color = false;
                }
                Printer printer = new Printer(printInfoSplit[0], Integer.parseInt(printInfoSplit[2].trim()), color, printInfoSplit[3]);
                myPrinterCollection.add(printer);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Problem!  File not found!");
            System.exit(1);
        }




        Printer p1 = new Printer();
        p1.setColor(false);

        Printer p2 = new Printer();
        p2.setColor(true);

        p2.print("aas;ldkfjas;ldkfj;asldfkjas;ldkfjs;aldfjksl;adfjksl;adfjksd;alfjksda;lfkjs;aldfkjsa;ldkfjsa;ldkfjs;adlfkjsd;alfkjsal;dfkjs;aldfkjs;aldkfjl;asdfjk;asldfkj;asldfkjl;asdkfjl;asdkfj;asdlkfjs;aldfkjsdl;afjks;adlfkjs;aldfkjs;aldkfjs;aldfkjsl;adfkjs;aldfjk;saldfkj;sladfjk;sadlfjks;adlfkjs;adlfkjsd;alfjks;aldfjksd;alfkjsda;lfkjsda;flkjsdf;lksdjaf;lskadjfdl;sakfjsd;lakfjs;aldkfjs;adlfjksd;alfkjsdl;afkjsd;alfkjsda;flkjsda;flskdjf;lsadkfj;sladkfjsl;adkfj;asldkfjs;adlkfjsd;alfkjsad;lfkjsda;flkjsda;lfkjsda;flksdjaf;lsdakjfl;sdakfjd;slafjsdl;afjksd;aflksdjf;lsadkjf;lsdakfj;sdlafjksdl;afkjsd;lafkj;sdalfkjsdl;afkjsda;lfkjsda;lfkjdsl;f");
        System.out.println(p1.toString());

        System.out.println(p2);

        myPrinterCollection.add(p1);

        myPrinterCollection.add(p2);

        System.out.println(myPrinterCollection);

        //System.gc();
    }
}
