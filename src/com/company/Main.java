package com.company;

public class Main {

    public static void main(String[] args) {

        Animal pigeon = new Bird("Pigeon" , 3);
        Animal tyrana = new Dinosaurs("Tyranasaurus" , 15000);
        Animal lion = new Mammal("Lion" , 450);

        tyrana.attack(lion);

        pigeon.getID();





    }
}
