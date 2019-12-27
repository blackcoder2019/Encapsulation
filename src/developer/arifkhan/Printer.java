package developer.arifkhan;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if (tonerLevel >= -1 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        }

        this.duplex = duplex;
        this.pagesPrinted = 0;
    }


    public int addToner(int totalAmount) {
        if (tonerLevel >= 0 && tonerLevel <= 100) {
            if (tonerLevel + totalAmount > 100) {
                return -1;
            }
            this.tonerLevel += totalAmount;
            return this.tonerLevel;
        } else {
            return -1;
        }
    }

    public int printPages(int pages){
        int pagesprint=pages;
        if (this.duplex) {
            pagesprint/=2;
            System.out.println("Printing in duplex mode");
        }
        this.pagesPrinted+=pages;
        return pagesprint;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
