public class Printer {

    public static void main(String[] args){

        MainPrinter printer = new MainPrinter();
        printer.append("Текст", "Название",10);

        MainPrinter secondPrinter = new MainPrinter();
        secondPrinter.append("Текст1","Название1",14);

        printer.print(MainPrinter.getPagesCount());
        secondPrinter.print(MainPrinter.getPagesCount());





    }
}