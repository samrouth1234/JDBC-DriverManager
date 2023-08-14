package Modle;

public class Student {
    private  Integer id;
    private  String  name;
    private  String  sex;
    private  String object;

    // create default constructor
    public Student() {
    }
    // create default constructor with parameter
    public Student(Integer id, String name, String sex, String object) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.object = object;
    }

    // create to String

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", object='" + object + '\'' +
                '}';
    }
}
