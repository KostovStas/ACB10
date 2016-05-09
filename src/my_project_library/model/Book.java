package my_project_library.model;

/**
 * Created by Stas on 18.04.2016.
 */
public class Book {
    private String name;
    private int uniqueNumber;
    private String authorTheBook;
    private Genres genre;
    private int quantityOfPages;
    //    todo Date or LocalDate
    private int publicationDate;
    private boolean isTaken;

    public Book (String name, String authorTheBook){
        this.name = name;
        this.authorTheBook = authorTheBook;
    }

    public Book(String name, int uniqueNumber, String authorTheBook,
                Genres genre, int quantityOfPages, int publicationDate) {

        this.name = name;
        this.uniqueNumber = uniqueNumber;
        this.authorTheBook = authorTheBook;
        this.genre = genre;
        this.quantityOfPages = quantityOfPages;
        this.publicationDate = publicationDate;
    }

    public boolean getTaken() {
        return isTaken;
    }

    public String getName() {
        return name;
    }

    public void setTaken(boolean taken) {
        this.isTaken = taken;

    }


    public String getAuthorTheBook() {
        return authorTheBook;
    }

    public Genres getGenre() {
        return genre;
    }

    public int getUniqueNumber() {
        return uniqueNumber;
    }

    public int getQuantityOfPages() {
        return quantityOfPages;
    }

    public int getPublicationDate() {
        return publicationDate;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        if (!name.equals(book.name)) return false;
        return authorTheBook.equals(book.authorTheBook);

    }

    @Override
    public String toString() {
        return String.format("The booke name is " + name + ", unique number in " + uniqueNumber +
                ", genre is " + genre + ",quantity of pages is " + quantityOfPages +
                ", publication date is " + publicationDate);

    }


}
