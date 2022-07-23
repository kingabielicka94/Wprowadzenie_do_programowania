public class ForLoop {
    //komentarz
    public static void main(String[] args) {

        String[] catBoard = new String[]{"Karmi", "Bubu", "Łapki", "Simba", "Tofik"};

        for (int i = 0; i < catBoard.length; i++) {
            System.out.println(catBoard[i]);
        }
        for (String cat: catBoard)
            System.out.println(cat);
    }

}
