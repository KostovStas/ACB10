package my_project_library.controller;


import my_project_library.model.Book;
import my_project_library.model.Reader;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<>();
    private List<Reader> readers = new ArrayList<>();
    private String name;
    private String address;
    private String telephone;

    public Library(String name, String address, String telephone) {
        this.name = name;
        this.address = address;
        this.telephone = telephone;

    }

    public boolean addBookInLibrary(Book book) {
        return books.add(book);
    }

    public  void addToBlockList (Reader reader){

         reader.setIsInBlackList(true);
    }

    public void deleteToBlockList(Reader reader){
        reader.setIsInBlackList(false);
    }

    /**
     * @return true if reader is added
     * false if reader was register before
     */
    public boolean addReaderInLibrary(Reader reader) {
//        todo check if register

            if (!readers.contains(reader)) {
                return readers.add(reader);

            }else {
            System.out.println(readers + " was register before");
        }return false;
    }




    public boolean deleteBookFromLibrary(Book book) {

        return books.remove(book);
    }

    public boolean deleteReaderInLibrary(Reader reader) {

        return readers.remove(reader);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        Book tmp = (Book) obj;
        if (!this.name.equals(tmp.getName()))
            return false;

        return true;
    }

    //see the list of readers
    public void showAllReadersInLibrary() {
        for (int i = 0; i < readers.size(); i++) {
            System.out.println("A list of library readers " + readers.get(i));

        }
    }

    //see the list of available books

    public void showBooksOfSomehingAuthor(String authorTheBook) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getAuthorTheBook().equals(authorTheBook)) {
                System.out.println(books.get(i));
            }

        }
    }

    public void toLookNewBooks(int year) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getPublicationDate() <= year) {
                System.out.println(books.get(i));
            }//else continue;

        }
    }
    public  void lookBooksAfter2003 (){
        for (int i = 0; i < books.size() ; i++) {
            if (books.get(i).getPublicationDate()>= 2003){
                System.out.println(books.get(i));
            }

        }
    }
    public void showListOfFreeBooks(){
        for (int i = 0; i < books.size() ; i++) {
            if(!books.get(i).getTaken()){
                System.out.println(books.get(i));
            }

        }
    }


    public boolean showAllBooksOfReaders () {
        for (int i = 0; i < readers.size(); i++) {

            System.out.println(readers.get(i).showBooksOfReader());
        }return true;

    }
}
