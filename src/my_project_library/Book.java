package my_project_library;

/**
 * Created by Stas on 18.04.2016.
 */
public class Book {
    private String name;
    private int uniqueNumber;
    private String authorTheBook;
    private String genre;
    private int quantityOfPages;
    private int publicationDate;
    private boolean presenceOfBooks ;

    public Book (String name, int uniqueNumber,String authorTheBook,
                 String  genre, int quantityOfPages, int publicationDate,boolean presenceOfBooks){

        this.name=name;
        this.uniqueNumber=uniqueNumber;
        this.authorTheBook=authorTheBook;
        this.genre=genre;
        this.quantityOfPages=quantityOfPages;
        this.publicationDate=publicationDate;
        this.presenceOfBooks=presenceOfBooks;
    }
    public boolean getPresenceOfBooks(){return presenceOfBooks;}
    public String getName(){
        return name;
    }
    public void setPresenceOfBooks ( boolean presenceOfBooks){
        this.presenceOfBooks = presenceOfBooks;

    }


    public String getAuthorTheBook(){
        return authorTheBook;
    }
    public String getGenre(){
        return genre;
    }

    public int getUniqueNumber(){
        return uniqueNumber;
    }
    public int getQuantityOfPages(){
        return  quantityOfPages;
    }
    public int getPublicationDate(){
        return publicationDate;
    }

    public String toString (){
        return String.format("The booke name is " + name + ", unique number in " + uniqueNumber +
                ", genre is " + genre + ",quantity of pages is " + quantityOfPages +
                ", publication date is " + publicationDate);

    }


}
