package com.company;

public class Main {

    public static void main(String[] args) {


        Habitat island = new Habitat();

        Animal bat = new Bat(2);
        Animal branhiosairus = new Brachiosaurus(56000);
        Animal crocodile1 = new Crocodile(400, "Crocodile1");
        Animal crocodile2 = new Crocodile(350, "Crocodile2");
        Animal lion = new Lion(450);
        Animal pigeon = new Pigeon(3);
        Animal rat = new Rat(1);
        Animal trex = new Tyrannosaurus(15000);

        island.add(bat);
        island.add(branhiosairus);
        island.add(crocodile1);
        island.add(crocodile2);
        island.add(lion);
        island.add(pigeon);
        island.add(rat);
        island.add(trex);



        island.runIteration(4,7);
        //island.runIteration(2,3);
        //island.runIteration(2,4);
        //island.runIteration(7,4);
        //island.runIteration(2,6);
        //island.runIteration(6,5);
        //island.runIteration(7,0);
        //island.runIteration(4,7);
        //island.runIteration(2,5);
        //island.runIteration(7,2);
        //island.runIteration(0,6);
        //island.runIteration(1,7);

        System.out.println(island);










    }
}
