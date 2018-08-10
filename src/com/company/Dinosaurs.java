package com.company;

public abstract class Dinosaurs extends Animal implements canWalk {

    public Dinosaurs(float weight) {
        super(weight);
    }

    @Override
    public void attack(Animal defending){
        if(defending instanceof canFly){

        }else if(defending instanceof Dinosaurs){
            defending.setDead(true);
            this.setDead(true);
        }else{
            if (!defending.isDead() && !this.isDead()){
                if (defending.getWeight() < this.getWeight()) {
                    defending.setDead(true);
                    float newWeight = this.getWeight() + defending.getWeight() / 2;
                    this.setWeight(newWeight);
                }
            }
        }

    }
}
