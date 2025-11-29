package L7Assignment1;

import java.sql.SQLOutput;

public class Student {
    String name;
    int age;


    public Student(){
        this.name = "null";
        this.age = 0;
    }

    public Student(String getN, int getA){
        this.name = getN;
        this.age = getA;
    }

    public void printStudentInfo(){
        System.out.println("Students: " + name + ", Ages: " + age);
        }


}


