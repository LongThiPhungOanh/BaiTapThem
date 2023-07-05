package Tao_Class;
import java.util.Scanner;
public class Student {
    public String name;
    public String className;
    public int age;
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public String getClassName() {
        return className;
    }
    public void setClassName(String className) {
        this.className = className;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
   public Student(String name, String className, int age){
       this.name = name;
       this.className = className;
       this.age = age;
   }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("name");
        String name1 = input.nextLine();
        System.out.println("className");
        String className1 = input.nextLine();
        System.out.println("age");
        int age1 = input.nextInt();
        Student student1 = new Student(name1 ,className1,age1);
        System.out.println(student1.getName());
        System.out.println(student1.getClassName());
        System.out.println(student1.age);
    }
}



