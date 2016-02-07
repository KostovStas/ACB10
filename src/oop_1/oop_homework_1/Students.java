package oop_1.oop_homework_1;

/**
 * Created by admin on 07.02.2016.
 */
public class Students {
    private String name;
    private String surname;
    private String middlename;
    private int age;
    private boolean sex;

 public void initStudents(String name,int age, boolean sex,String surname,String middlename){
     this.name=name;
     this.surname=surname;
     this.middlename=middlename;
     this.age=age;
     this.sex=sex;
   }
    public void showStudent(){
        if (sex==true){
            String sex1 = "Boy";
            System.out.println("Your name is" +name +"you age" +age+ sex1);
        }else{
            String sex1 ="Girl";
            System.out.println("Your name is " +name+ " you are " +age + sex1);
        }

    }
    public void showFio (){
        System.out.println(name +" "+ surname +" " + middlename);
    }


}

