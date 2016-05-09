package my_project_library.model;

import java.time.LocalDate;
import java.util.ArrayList;


public class Reader {
    private Gender sex;
    private String name;
    private String surname;
    private String patronymicName;
    private LocalDate birthDate;
    /*private int dayOfBirth;
    private int monthOfBirth;
    private int yearOfBirth;*/
    private String telephone;
    private String titleOfDocument;
    private String seriesOfDocument;
    private int documentNumber;
    private boolean isInBlackList;
    private ArrayList<Book> books = new ArrayList<>();






    public boolean isInBlackList() {

        return isInBlackList;
    }

    public void setIsInBlackList(boolean isInBlackList) {

        this.isInBlackList = isInBlackList;
    }

    public Reader (String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    public Reader(Gender sex, String name, String surname, String patronymicName, int dayOfBirth, int monthOfBirth,
                  int yearOfBirth, String telephone, String titleOfDocument, String seriesOfDocument,
                  int documentNumber) {
        this.birthDate = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        this.sex = sex;
        this.name = name;
        this.surname = surname;
        this.patronymicName = patronymicName;
        /*this.dayOfBirth = dayOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.yearOfBirth = yearOfBirth;*/
        this.telephone = telephone;
        this.titleOfDocument = titleOfDocument;
        this.seriesOfDocument = seriesOfDocument;
        this.documentNumber = documentNumber;
    }

    @Override
    public String toString() {
        return String.format("Reader is %s.Full name is %s %s %s.Date of birthtay is %s." +
                        "Tephone number is %s.Document is %s, series is %s, document number is %d",
                sex, name, surname, patronymicName,birthDate, telephone,
                titleOfDocument, seriesOfDocument, documentNumber);
    }

    public Gender getSex() {
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

    /*public int getDayOfBirth() {
        return dayOfBirth;
    }

    public int getMonthOfBirth() {
        return monthOfBirth;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }*/

    public String getTelephone() {
        return telephone;
    }

    public int getDocumentNumber() {
        return documentNumber;
    }

    public boolean addBookInReader(Book book) {
        if (books.size() < 3 && isInBlackList != true) {
            if (!book.getTaken()) {
                book.setTaken(true);
               return books.add(book);
            } else {
                System.out.println("Book is absent");
            }
        } else {
            System.out.println("You have three books or you in block list.");

        }
        return false;
    }

        @Override
        public boolean equals (Object obj){
            if (this == obj) return true;
            if (obj == null) return false;
            if (this.getClass() != obj.getClass()) return false;
            Reader tmp = (Reader) obj;
            if (!this.name.equals(tmp.name))
                return false;
            if (!this.surname.equals(tmp.surname))
                return false;

            return true;
        }

    public boolean showBooksOfReader() {
        for (int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i));

        }return true;
    }







}
