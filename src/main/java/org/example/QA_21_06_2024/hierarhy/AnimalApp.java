package org.example.QA_21_06_2024.hierarhy;

public class AnimalApp {

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.printInfo();
        animal.printFromAnimal();

        WaterAnimal waterAnimal = new WaterAnimal();
        waterAnimal.printInfo();
        waterAnimal.printFromWaterAnimal();
        waterAnimal.printFromAnimal();

        OceanAnimal oceanAnimal = new OceanAnimal();
        oceanAnimal.printInfo();
        oceanAnimal.printFromOceanAnimal();

        oceanAnimal.printFromAnimal();
        oceanAnimal.printFromWaterAnimal();
    }
}
