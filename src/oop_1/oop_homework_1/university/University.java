package oop_1.oop_homework_1.university;

/**
 * Created by admin on 07.02.2016.
 */
public class University {
    private static final int DEFAULT_SIZE = 10;
    private String name;
    private GroupOfStudents [] araayaGrups ;
    private  int groupPosition; // groupPosition=0

    public University (String name ){
        this.name = name;
        this.araayaGrups= new GroupOfStudents[DEFAULT_SIZE];
    }
    public  University (String name, int size){
        this.name=name;
        this.araayaGrups= new GroupOfStudents[size];
    }
    public void addGroup (GroupOfStudents group){

        if (araayaGrups.length - groupPosition > 0){
            araayaGrups[groupPosition]=group;
//            System.out.println("add student");
            groupPosition++;
        }else {
            System.out.println("University does not have free places");
        }


    }
    public void showAllStudents (){
        for (int i = 0; i < groupPosition; i++) {
            araayaGrups[i].showStudetGroup();
        }
    }

    public  void showGroups (){
        for (int i = 0; i <groupPosition ; i++) {
            System.out.println(araayaGrups[i] );
        }
    }
    private void deleteFreeCellInUniversity (int i){
        int nextAfterI = i + 1;
        GroupOfStudents [] tmp = new GroupOfStudents[araayaGrups.length];
        System.arraycopy(araayaGrups, 0, tmp, 0, i);
        System.arraycopy(araayaGrups, i + 1, tmp, i, groupPosition - nextAfterI);
        araayaGrups = tmp;
    }

    //    todo method
    public void deleteGroup(String name, int id){

        for (int i = 0; i <groupPosition ; i++) {

            if(araayaGrups[i].getName().equals(name) && araayaGrups[i].getId()==id){
                araayaGrups[i]=null;

                deleteFreeCellInUniversity(i);
                groupPosition--;

            }

        }

    }

    //    todo method
    public void deleteStudent(String name, String surname){
        for (int i = 0; i < groupPosition ; i++) {
             araayaGrups[i].deleteStudent(name,surname);

        }
    }
//     todo override method
    @Override
    public String toString(){

        return "University name is " +name;
    }







}
