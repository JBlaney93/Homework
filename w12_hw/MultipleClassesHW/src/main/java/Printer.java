public class Printer {

    private int paperCount;
    private int tonerCount;

    public Printer(int paperCount, int tonerCount) {
        this.paperCount = paperCount;
        this.tonerCount = tonerCount;
    }

    public int getPaperCount() {
        return this.paperCount;
    }

    public int print(int pages, int copies) {
        int totalPrint = (pages * copies);
        int currentPaperCount = this.getPaperCount();
        int currentTonerCount = this.getTonerCount();
        if (currentPaperCount > totalPrint) {
            return (currentPaperCount - totalPrint); //(currentTonerCount - totalPrint) ;
        } else {
            return 0; //could only get this to accept an int
        }
    }

    public int getTonerCount() {
        return this.tonerCount;
    }
}
