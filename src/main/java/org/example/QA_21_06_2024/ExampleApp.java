package org.example.QA_21_06_2024;

public class ExampleApp {



    public static void main(String[] args) {
        Dog dog = new Dog("Mega Barsik"); // Dog
        SmallDog smallDog = new SmallDog("Barsik"); // Dog + SmallDog
        BigDog bigDog = new BigDog("Super Barsik"); // Dog + BigDog

//    smallDog.setName("Barsik");
//    bigDog.setName("Mega Barsik");
//    dog.setName("Super Barsik");

    dog.voice();
    smallDog.voice();
    bigDog.voice();

    }
}
