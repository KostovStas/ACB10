package my_philosophy.human;


public class Human_1 {
    private  String name;
    private String surname;
    private int age;
    private String sex;


    public Human_1() {
    }
    public Human_1 (String name, String surname, int age, String sex) {
        this.name = name;
        this.surname =surname;
        this.age = age;
        this.sex = sex;
    }

    public void ShowHumanInfo(){
        System.out.println("Human name is " + name + " " +surname);
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}
