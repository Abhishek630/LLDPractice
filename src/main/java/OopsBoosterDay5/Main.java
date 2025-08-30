package OopsBoosterDay5;

public class Main {
    public static void main(String[] args) {
        IPrinter printer = new OldPrinter();
        printer.print();


        IScanner scanner = new Printer();
        scanner.scan();
    }
}
