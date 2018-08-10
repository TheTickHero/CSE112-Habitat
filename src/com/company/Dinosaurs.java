package com.company;

public abstract class Dinosaurs extends Animal implements canWalk {

    public Dinosaurs(float weight) {
        super(weight);
    }

    @Override
    public void attack(Animal defending){
        if(defending instanceof Dinosaurs && !(defending instanceof canFly)){
            defending.setDead();
            this.setDead();
        }else{
            if (!defending.isDead() && !this.isDead()){
                if (defending.getWeight() < this.getWeight()) {
                    defending.setDead();
                    float newWeight = this.getWeight() + defending.getWeight() / 2;
                    this.setWeight(newWeight);
                }
            }
        }

    }
}
