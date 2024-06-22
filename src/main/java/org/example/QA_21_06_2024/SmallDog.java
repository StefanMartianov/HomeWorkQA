package org.example.QA_21_06_2024;

public class SmallDog extends Dog {
    public SmallDog(String name) {
        super(name);
    }

    @Override
    public void voice() {
        System.out.println("I have a cold");
        super.voice();
    }

}
