public class MainPrinter {

    private static String queue = "";
    private static int pagesCount = 0;
    private static int documentsCount = 0;
    private static int allDocumentPrint = 0;

    public void append(String documentText, String documentName, int numberOfPages) {
        this.queue = queue + "\n"
                + "Название документа: " + documentName + "\n"
                + "Текст документа: " + documentText
                + "\n" + "Количество страниц на печать: " + numberOfPages
                + "\n" + "Общее количество страниц на печать: " + pagesCount;
        pagesCount = numberOfPages + pagesCount;

    }

    public static void clear() {
        queue = "";
        pagesCount = 0;
        documentsCount = 0;
    }

    public static int getPagesCount() {
        return pagesCount;
    }

    public static int getDocumentsCount() {
        return documentsCount;
    }

    public static int getAllDocumentPrint() {
        return allDocumentPrint;
    }

    public static boolean contains(String text) {
        return queue.contains(text);
    }

    public static void print(int title) {
        System.out.println(title);
        if (queue.isEmpty()) {
            System.out.println("Документ пуст");
        } else {
            System.out.println(queue);
        }
    }


}