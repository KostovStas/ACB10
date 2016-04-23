package my_project_library;


import java.util.ArrayList;

public class Library {
    private ArrayList<Book> arrayListOfBooks = new ArrayList<Book>();
    private ArrayList<Reader> arrayListOfReaders = new ArrayList<Reader>();
    private ArrayList<Reader> blackListOfReaders = new ArrayList<Reader>();
    private String name;
    private String address;
    private int telephone;

    public Library(String name, String address, int telephone) {
        this.name = name;
        this.address = address;
        this.telephone = telephone;

    }

    public void addBookInLibrary(Book book) {
        arrayListOfBooks.add(book);
    }

    public void addReaderInLibrary(Reader reader) {
        arrayListOfReaders.add(reader);
    }

    public boolean deleteBookInLibrary(String name) {
        for (int i = 0; i < arrayListOfBooks.size(); i++) {
            if (arrayListOfBooks.get(i).getName().equals(name)) {
                arrayListOfBooks.remove(i);
                return true;
            }

        }
        return false;
    }

    public boolean deleteReaderInLibrary(String name, String surname, String patronymicName) {
        for (int i = 0; i < arrayListOfReaders.size(); i++) {
            if (arrayListOfReaders.get(i).getName().equals(name) && arrayListOfReaders.get(i).getSurname().equals(surname)
                    && arrayListOfReaders.get(i).getPatronymicName().equals(patronymicName)) {
                arrayListOfBooks.remove(i);
                return true;
            }

        }
        return false;
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
        for (int i = 0; i < arrayListOfReaders.size(); i++) {
            System.out.println("A list of library readers " + arrayListOfReaders.get(i));

        }
    }

    //see the list of available books

    public void showBooksOfSomehingAuthor(String authorTheBook) {
        for (int i = 0; i < arrayListOfBooks.size(); i++) {
            if (arrayListOfBooks.get(i).getAuthorTheBook().equals(authorTheBook)) {
                System.out.println(arrayListOfBooks.get(i));
            }

        }
    }

    public void toLookNewBooks(int year) {
        for (int i = 0; i < arrayListOfBooks.size(); i++) {
            if (arrayListOfBooks.get(i).getPublicationDate() <= year) {
                System.out.println(arrayListOfBooks.get(i));
            }//else continue;

        }
    }
    public  void lookBooksAfter2003 (){
        for (int i = 0; i < arrayListOfBooks.size() ; i++) {
            if (arrayListOfBooks.get(i).getPublicationDate()>= 2003){
                System.out.println(arrayListOfBooks.get(i));
            }

        }
    }
    public void showListOfFreeBooks(){
        for (int i = 0; i <arrayListOfBooks.size() ; i++) {
            if(!arrayListOfBooks.get(i).getPresenceOfBooks()){
                System.out.println(arrayListOfBooks.get(i));
            }

        }
    }


}
