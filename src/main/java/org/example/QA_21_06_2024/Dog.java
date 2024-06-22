package org.example.QA_21_06_2024;

public class Dog {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public void voice() {
        System.out.println("I am"+ name +"voice!");
    }
    private void printName(){
        System.out.println(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
