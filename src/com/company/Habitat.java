package com.company;

public class Habitat {

    public static void main(String[] args) {


        Animal[] animals = {new Mammal("Bat", 2),
                new Dinosaurs("Brachiosaurus", 56000),
                new Reptiles("crocodile1", 400),
                new Reptiles("Crocodile2", 350),
                new Mammal("Lion", 450),
                new Bird("Pigeon", 3),
                new Mammal("Rat", 1),
                new Dinosaurs("Tyrannosaurus", 15000)};

        for (Animal a : animals){
            System.out.println(a.getID());
        }

    }
}
