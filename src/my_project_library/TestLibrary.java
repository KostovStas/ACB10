package my_project_library;

/**
 * Created by Stas on 22.04.2016.
 */
public class TestLibrary {
    public static void main(String[] args) {
        Reader reader1 = new Reader("man","Igor","Petrov","Ivanovich",22,02,12,21265,"Pasport","KM",306867);
        Reader reader2 = new Reader("man","Stepan","Petrov","Ivanovich",22,02,12,21265,"Pasport","KM",306867);
        Book book1 = new Book("Kolobok",245,"Puchkin A.S","story",365,2001,false);
        Book book2 = new Book("Ryaba2",245,"Puchkin SA.","story",365,2002,false);
        Book book3 = new Book("Ryaba3",245,"Puchkin SA.","story",365,2003,false);
        Book book4 = new Book("Ryaba4",245,"Puchkin SA.","story",365,2006,false);
        Library library1 = new Library("Librari of sity Kiev","Kiev,Khreshchatyk 23",123567);

        library1.addBookInLibrary(book1);
        library1.addBookInLibrary(book2);
        library1.addBookInLibrary(book3);
        library1.addBookInLibrary(book4);

        library1.addReaderInLibrary(reader1);
        library1.addReaderInLibrary(reader2);
        reader1.addBookInReader(book1);
        reader1.addBookInReader(book2);
        library1.showListOfFreeBooks();
        reader1.addBookInReader(book1);


        /*reader1.showAllBooksOfReader();
        System.out.println("------------------");
        reader1.addBookInReader(book3);
        reader1.showAllBooksOfReader();
        System.out.println("--------------");
        reader1.addBookInReader(book4);*/

        /*library1.showAllReadersInLibrary();
        System.out.println("-------------------");
        library1.showBooksOfSomehingAuthor("Puchkin A.S");
        System.out.println("-----------------------");*/
        /*reader1.addBookInReader(book1);
        reader1.addBookInReader(book2);
        reader1.addBookInReader(book2);

        System.out.println("---------------------------");
        reader1.showAllBooksOfReader();*/
       /* library1.toLookNewBooks(2001);
        System.out.println("---------------");
        library1.lookBooksAfter2003();
*/
    }
}
