package oop_1.oop_homework_1.university;


public class GroupOfStudents {
    private static final int DEFAULT_SIZE = 10;
    private String name;
    private Integer id;
    private int freePlace;
    private int studentPosition;


    Student listStudents[];
    //Student listStudents[] = new Student[10];

    public GroupOfStudents(String name, int id) {
        this.name = name;
        this.id = id;
        listStudents = new Student[DEFAULT_SIZE];
        this.freePlace = DEFAULT_SIZE;
    }
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }

    public GroupOfStudents(String name, int id, int size){
        this.name = name;
        this.id = id;
        this.listStudents = new Student[size];
        this.freePlace = size;

    }
    @Override
    public String toString (){
        return String.format("Group - %s, # %d, student count - %d", name, id, studentPosition);
//        return "Group - "+ name +" № " + id + " student count " + studentPosition;
    }

    public void addStudent (Student student) {

        if(freePlace == 0){
            System.out.println("cant add stusent");
        } else {
            listStudents[studentPosition] = student;
            freePlace--;
            studentPosition++;

        }

    }
    public void showStudetGroup (){
        for (int i = 0; i < studentPosition; i++){
            System.out.println(listStudents[i]);
        }
    }

    public void deleteStudent (String name, String  surname){
        for (int i = 0; i < studentPosition; i++) {
            if (listStudents[i].getName().equals(name) && listStudents[i].getSurname().equals(surname)){
                listStudents[i] = null;
                freePlace++;
                deleteFreeCell(i);
                studentPosition--;
            }
        }
    }

    private void deleteFreeCell(int i) {
        int nextAfterI = i + 1;
        Student[] tmp = new Student[listStudents.length];
        System.arraycopy(listStudents, 0, tmp, 0, i);
        System.arraycopy(listStudents, i + 1, tmp, i, studentPosition - nextAfterI);
        listStudents = tmp;
    }
}
