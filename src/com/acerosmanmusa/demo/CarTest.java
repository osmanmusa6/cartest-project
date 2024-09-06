package com.acerosmanmusa.demo;

public class CarTest {
    public static void main(String[] args) {
        com.acerosmanmusa.demo.Main car1 = new com.acerosmanmusa.demo.Main();

        System.out.println("when the car still");
        car1.make = "Bmw";
        car1.model = "i8";
        car1.year = "2022";
        car1.distance= 0;
        car1.speed =0;
        String info = car1.getInfo();
        System.out.println(info);

        System.out.println("\nwhen the car moves");
        car1.accelerate(120);
        car1.go(100);
        car1.go(60);
        System.out.println(car1.getInfo());
        car1.stop();
        System.out.println(car1.getInfo());

        System.out.println();

        com.acerosmanmusa.demo.Main car2 = new com.acerosmanmusa.demo.Main();
        car2.make = "Mercedes";
        car2.model = "C100";
        car2.year = "2019";
        car2.distance= 16000;
        car2.speed= 150;
        System.out.println(car2.getInfo());

        car2.accelerate(215);
        double timeToGo = car2.go(950);
        System.out.println("Time to go 950 km: " + timeToGo + " hour");
        System.out.println(car2.getInfo());
    }
}



