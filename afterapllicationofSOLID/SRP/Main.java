package afterapllicationofSOLID.SRP;

public class Main {
    public static void main(String[] args) {
        BookSRP book = new BookSRP(
            "Le Petit Prince",
            "Antoine de Saint-Exupéry",
            "Un aviateur rencontre un petit prince venu d'une autre planète..."
        );

        BookPrinter printer = new BookPrinter();
        BookSaver saver = new BookSaver();
        BookBusinessLogic logic = new BookBusinessLogic();

        printer.printToScreen(book);
        printer.printToHTML(book);

        saver.saveToDatabase(book);
        saver.saveToFile(book, "le_petit_prince.txt");

        logic.emprunter(book, "Alice");
        logic.autreService(book);
    }
}