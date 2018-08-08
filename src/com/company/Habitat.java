package com.company;

public class Habitat {

    private Animal[] habitat;

    public Habitat() {
        this.habitat = animals;
    }

    private Animal[] animals = {new Bat("Bat", 2),
                new Dinosaurs("Brachiosaurus", 56000),
                new Reptiles("crocodile1", 400),
                new Reptiles("Crocodile2", 350),
                new Lion("Lion", 450),
                new Bird("Pigeon", 3),
                new Rat("Rat", 1),
                new Dinosaurs("Tyrannosaurus", 15000)};



    @Override
    public String toString() {
        return animals[0].getName() + "[" + animals[0].getID() + "]" + "\n" +
                animals[1].getName() + "[" + animals[1].getID() + "]" + "\n" +
                animals[2].getName() + "[" + animals[2].getID() + "]" + "\n" +
                animals[3].getName() + "[" + animals[3].getID() + "]" + "\n" +
                animals[4].getName() + "[" + animals[4].getID() + "]" + "\n" +
                animals[5].getName() + "[" + animals[5].getID() + "]" + "\n" +
                animals[6].getName() + "[" + animals[6].getID() + "]" + "\n" +
                animals[7].getName() + "[" + animals[7].getID() + "]" + "\n";


    }
}
