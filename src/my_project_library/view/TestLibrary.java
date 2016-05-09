package my_project_library.view;

import my_project_library.controller.Library;
import my_project_library.model.Book;
import my_project_library.model.Gender;
import my_project_library.model.Genres;
import my_project_library.model.Reader;

import java.util.Scanner;

/**
 * Created by Stas on 22.04.2016.
 */
public class TestLibrary {
    public static void main(String[] args) {

        // create  readers
        Reader reader1 = new Reader(Gender.MALE,"Igor","Petrov","Ivanovich",22, 1,2012,"21265","Pasport","KM",306867);
        Reader reader2 = new Reader(Gender.FEMALE,"Stepan","Petrov","Ivanovich",22,02,1991,"21265","Pasport","KM",306867);

        // create  books
        Book book1 = new Book("Kolobok",245,"Puchkin A.S", Genres.COMEDY,365,2001);
        Book book2 = new Book("Ryaba2",245,"Puchkin SA.",Genres.HORROR,365,2002);
        Book book3 = new Book("Ryaba3",245,"Puchkin SA.",Genres.PHANTASTIC,365,2003);
        Book book4 = new Book("Ryaba4",245,"Puchkin SA.",Genres.ROMANE,365,2006);
        Library library1 = new Library("Librari of sity Kiev","Kiev,Khreshchatyk 23","12357890");

        // add readers
        library1.addReaderInLibrary(reader1);
        library1.addReaderInLibrary(reader2);

        // add  books
        library1.addBookInLibrary(book1);
        library1.addBookInLibrary(book2);
        library1.addBookInLibrary(book3);
        library1.addBookInLibrary(book4);

        // add in block list
        ;library1.addToBlockList(reader1);
        reader1.addBookInReader(book1);
        reader2.addBookInReader(book2);
        reader2.addBookInReader(book3);

        // delete in block list
        library1.deleteToBlockList(reader1);

        reader1.addBookInReader(book4);


        System.out.println("------------");
        library1.showListOfFreeBooks();
        System.out.println("-------------");
        library1.showAllBooksOfReaders();
        System.out.println("-------------");
        System.out.println("-------------");
        reader1.showBooksOfReader();

        // add readers the same as reader1 and reader2
        /*library1.addReaderInLibrary(reader1);
        library1.addReaderInLibrary(reader2);
        library1.showAllReadersInLibrary();*/



    }
}






        /*Reader reader1 = new Reader(Gender.MALE,"Igor","Petrov","Ivanovich",22, 1,2012,"21265","Pasport","KM",306867);
        Reader reader2 = new Reader(Gender.FEMALE,"Stepan","Petrov","Ivanovich",22,02,12,"21265","Pasport","KM",306867);
        Book book1 = new Book("Kolobok",245,"Puchkin A.S", Genres.COMEDY,365,2001);
        Book book2 = new Book("Ryaba2",245,"Puchkin SA.",Genres.HORROR,365,2002);
        Book book3 = new Book("Ryaba3",245,"Puchkin SA.",Genres.PHANTASTIC,365,2003);
        Book book4 = new Book("Ryaba4",245,"Puchkin SA.",Genres.ROMANE,365,2006);
        Library library1 = new Library("Librari of sity Kiev","Kiev,Khreshchatyk 23","12357890");

        library1.addBookInLibrary(book1);
        library1.addBookInLibrary(book2);
        library1.addBookInLibrary(book3);
        library1.addBookInLibrary(book4);
*//*
//        delete Book
        library1.showListOfFreeBooks();
        library1.deleteBookFromLibrary(findBook());
        library1.showListOfFreeBooks();*//*


        library1.addReaderInLibrary(reader1);
        library1.addReaderInLibrary(reader2);
        reader1.addBookInReader(book1);
        reader1.addBookInReader(book2);
        library1.showListOfFreeBooks();
        reader1.addBookInReader(book1);

*//*//     delete reader
        library1.showAllReadersInLibrary();
        library1.deleteReaderInLibrary(findReader());
        library1.showAllReadersInLibrary();*//*

        *//*reader1.showAllBooksOfReader();
        System.out.println("------------------");
        reader1.addBookInReader(book3);
        reader1.showAllBooksOfReader();
        System.out.println("--------------");
        reader1.addBookInReader(book4);*//*

        *//*library1.showAllReadersInLibrary();
        System.out.println("-------------------");
        library1.showBooksOfSomehingAuthor("Puchkin A.S");
        System.out.println("-----------------------");*//*
        *//*reader1.addBookInReader(book1);
        reader1.addBookInReader(book2);
        reader1.addBookInReader(book2);

        System.out.println("---------------------------");
        reader1.showAllBooksOfReader();*//*
       *//* library1.toLookNewBooks(2001);
        System.out.println("---------------");
        library1.lookBooksAfter2003();
*//*
    }
    public static Book findBook(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name: ");
        String name = sc.nextLine();
        System.out.println("Enter author: ");
        String author = sc.nextLine();

        return new Book(name, author);
    }
    public static Reader findReader(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name: ");
        String name = sc.nextLine();
        System.out.println("Enter surname: ");
        String surname = sc.nextLine();

        return new Reader(name, surname);*/


