package my_project_library;

import java.util.ArrayList;


public class Reader {
    private String sex;
    private String name;
    private String surname;
    private String patronymicName;
    private int dayOfBirth;
    private int monthOfBirth;
    private int yearOfBirth;
    private int telephone;
    private String titleOfDocument;
    private String seriesOfDocument;
    private int documentNumber;
    private ArrayList<Book> arrayListOfBooksOfReader = new ArrayList<>();


    public Reader(String sex, String name, String surname, String patronymicName, int dayOfBirth, int monthOfBirth,
                  int yearOfBirth, int telephone, String titleOfDocument, String seriesOfDocument,
                  int documentNumber) {
        this.sex = sex;
        this.name = name;
        this.surname = surname;
        this.patronymicName = patronymicName;
        this.dayOfBirth = dayOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.yearOfBirth = yearOfBirth;
        this.telephone = telephone;
        this.titleOfDocument = titleOfDocument;
        this.seriesOfDocument = seriesOfDocument;
        this.documentNumber = documentNumber;
    }

    @Override
    public String toString() {
        return String.format("Reader is %s.Full name is %s %s %s.Date of birthtay is %d-%d-%d." +
                        "Tephone number is %d.Document is %s, series is %s, document number is %d",
                sex, name, surname, patronymicName, dayOfBirth, monthOfBirth, yearOfBirth, telephone,
                titleOfDocument, seriesOfDocument, documentNumber);
    }

    public String getSex() {
        return sex;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPatronymicName() {
        return patronymicName;
    }

    public String getTitleOfDocument() {
        return titleOfDocument;
    }

    public String getSeriesOfDocument() {
        return seriesOfDocument;
    }

    public int getDayOfBirth() {
        return dayOfBirth;
    }

    public int getMonthOfBirth() {
        return monthOfBirth;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public int getTelephone() {
        return telephone;
    }

    public int getDocumentNumber() {
        return documentNumber;
    }

    public void addBookInReader(Book book) {
        if (arrayListOfBooksOfReader.size() < 3) {
            if (book.getPresenceOfBooks() == false) {
                book.setPresenceOfBooks(true);
                arrayListOfBooksOfReader.add(book);
            } else {
                System.out.println("You have three books.You can't take more than three books,  or  bla bla bla");
            }


        }
    }

        @Override
        public boolean equals (Object obj){
            if (this == obj) return true;
            if (obj == null) return false;
            if (this.getClass() != obj.getClass()) return false;
            Reader tmp = (Reader) obj;
            if (!this.name.equals(tmp.getName()))
                return false;

            return true;
        }

    public void showAllBooksOfReader() {
        for (int i = 0; i < arrayListOfBooksOfReader.size(); i++) {
            System.out.println(arrayListOfBooksOfReader.get(i) + " ");

        }
    }


}
