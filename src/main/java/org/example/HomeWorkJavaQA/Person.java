package org.example.HomeWorkJavaQA;
public class Person
{
    String fullName;
    int age;

    public Person() {
        this.fullName = "Unknow";
        this.age = 0;
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void move(){
        System.out.println("Такой-то  Person говорит");
    }
    public void talk(){
        System.out.println("Такой-то  Person говорит");
    }

    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("Artem Hristos", 33);
        person1.move();
        person1.talk();
        person2.move();
        person2.talk();
    }

}
