package com.company;

public class Animal {

    private String name;
    private float weight;
    private boolean isDead;
    private static int count;
    private int ID;

    public Animal(String name, float weight) {
        this.name = name;
        this.weight = weight;
        this.isDead = false;
        count++;
        this.ID = count;
    }


    public void attack(Animal defending) {
        if (!defending.isDead && !isDead) {
            if (defending.getWeight() < this.weight) {
                defending.setDead();
                this.weight += defending.getWeight() / 2;
            }
        }
    }


    public void setDead() {
        isDead = true;
    }

    public boolean isDead() {
        return isDead;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getWeight() {
        return weight;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }


}
