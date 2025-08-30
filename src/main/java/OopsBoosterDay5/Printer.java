package OopsBoosterDay5;

public class Printer implements  IScanner,IPrinter,IFax {
    private String name;

    @Override
    public void print() {
        System.out.println("Print");
    }

    @Override
    public void scan() {
        System.out.println("Scan");
    }

    @Override
    public void fax() {
        System.out.println("Fax");
    }
}
