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

    public void runIteration(int attackerID , int defenderID){
        Animal attacker = members.get(attackerID);
        Animal defender = members.get(defenderID);

        if (!defender.isDead() && !attacker.isDead()){
            str += "Iteration: " + count + "\nAtt: " + attacker.getName() + "[" + (attackerID+1) +"] ("+ attacker.getWeight()+")\n" +
                    "Deff: " + defender.getName() + "[" + (defenderID+1) + "] (" + defender.getWeight() + ")\n";
            members.get(attackerID).attack(members.get(defenderID));
            if(attacker.isDead() && defender.isDead()){
                str += "BOTH OF THEM ARE DIED!!";
            }else if(defender.isDead()){
                str += defender.getName() + "["+(defenderID+1) +"] (" + defender.getWeight() + ") died \n" +
                        "Attacker " + attacker.getName() +"["+(attackerID+1) +"] ("+ attacker.getWeight()+") new weight is " + attacker.getWeight();
            }else {
                str += "NO ONE DIED, WEIGHTS ARE STILL SAME.\n";
            }
            str += "\n\n";
        }else {
            str += "Iteration: " + count + "\nONE OF THE ANIMAL IN THIS ITERATION IS DEAD, NO FIGHT.\n\n";
        }
        count++;
    }


    @Override
    public String toString() {
        for(Animal a : this.members){
            if(!a.isDead()){
                str += "SURVIVOR IS: " + a.getClass().getSimpleName() + " with weight " + a.getWeight();
            }
        }
        return str;

    }
}
