package com.company;


import java.util.ArrayList;

public class Habitat {

    private ArrayList<Animal> animalsInHabitat;

    private int dead = 0;

    public Habitat() {
        this.animalsInHabitat = new ArrayList<Animal>();
    }

    public void add(Animal animal){
        animalsInHabitat.add(animal);
    }

    public Animal getAnimal(int ID){
        return animalsInHabitat.get(ID);
    }

    public void runIteration(int attackerID , int defenderID){
        animalsInHabitat.get(attackerID).attack(animalsInHabitat.get(defenderID));
    }


}
