package com.company;


import java.util.ArrayList;

public class Habitat {

    private static int count = 1;
    private String str = "";
    private ArrayList<Animal> members;
    private int dead = 0;

    public Habitat() {
        this.members = new ArrayList<Animal>();
    }

    public void add(Animal animal){
        members.add(animal);
    }

    private Animal getAnimal(int ID){
        return members.get(ID);
    }

    public void runIteration(int attackerID , int defenderID){
        Animal attacker = members.get(attackerID);
        Animal defender = members.get(defenderID);

        str += "Iteration: " + count + "\nAtt: " + attacker.getClass().getSimpleName() + "("+ attacker.getWeight()+")\n" +
                "Deff: " + defender.getClass().getSimpleName() + "("+ defender.getWeight()+")\n";
        members.get(attackerID).attack(members.get(defenderID));

        if(defender.isDead()){
            str += defender.getClass().getSimpleName() + "["+defenderID++ +"] (" + defender.getWeight() + ") died \n" +
             "Attacker " + attacker.getClass().getSimpleName() + "("+ attacker.getWeight()+") new weight is " + attacker.getWeight();
        }
        str += "\n\n";
        count++;
    }


    @Override
    public String toString() {
        return str;

    }
}
