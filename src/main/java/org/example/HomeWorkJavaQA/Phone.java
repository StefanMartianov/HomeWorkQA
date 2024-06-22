package org.example.HomeWorkJavaQA;

public class Phone {
    String number;
    String model;
    double weight;

    public Phone(String number,String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;

    }

    public void receiveCall(String callerName){
        System.out.println("Звонит"+" "+ callerName);
    }
    public String getNumber(){

        return number;
    }

    public static void main(String[] args) {
        Phone phone1 = new Phone("88005553535","NokiaC3310",150.5);
        Phone phone2 = new Phone("88005555555","NokiaC3310",100.0);
        Phone phone3 = new Phone("88005556666","NokiaC3310",100.0);
        System.out.println(phone1.number + " " +phone1.model + " "+ phone1.weight );
        System.out.println(phone2.number + " " +phone2.model + " "+ phone2.weight );
        System.out.println(phone3.number + " " +phone3.model + " "+ phone3.weight );

        phone1.receiveCall("Artem Hristos");
        System.out.println(phone1.getNumber());

        phone2.receiveCall("Dima Hristos");
        System.out.println(phone2.getNumber());

        phone3.receiveCall("Stepan Hristos");
        System.out.println(phone3.getNumber());
    }

}
