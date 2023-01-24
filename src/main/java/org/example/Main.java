package org.example;

import org.example.EnergyCosnumers.EnergyConsumers;
import org.example.EnergyCosnumers.NewYork;
import org.example.EnergyCosnumers.Poland;
import org.example.EnergyCosnumers.World;
import org.example.Materials.Storage;
import org.example.Mines.HadronCollider;
import org.example.Mines.Mines;
import org.example.Mines.MoonMine;
import org.example.Mines.UraniumMine;
import org.example.PowerPlants.*;

import java.util.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        MoonMine moonMine = new MoonMine();

        HadronCollider hadronCollider = new HadronCollider();
        List<Mines> minesList = new ArrayList<>();
        Collections.addAll(minesList, moonMine, hadronCollider);
        UraniumMine[] uMines = new UraniumMine[10];
        for(int i=0; i<10; i++) {
            uMines[i] = new UraniumMine();
            minesList.add(uMines[i]);
        }
        Storage storage = new Storage();



        AnihilationPlant anihilationPlant = new AnihilationPlant();
        FusionPlant fusionPlant = new FusionPlant();
        SolarPlant solarPlant = new SolarPlant();
        List<PowerPlants> powerPlants = new ArrayList<>();
        Collections.addAll(powerPlants, fusionPlant,anihilationPlant, solarPlant);
        NuclearPlant[] nuclearPlants = new NuclearPlant[10];
        for(int i=0; i<10; i++) {
            nuclearPlants[i] = new NuclearPlant();
            powerPlants.add(nuclearPlants[i]);
        }
        int howMuchPlantsProducedEnergy = 0;


        Poland poland = new Poland();
        NewYork newYork = new NewYork();
        List<EnergyConsumers> energyConsumers = new ArrayList<>();
        World word = new World();
        Collections.addAll(energyConsumers, poland, newYork, word);
        int howMuchEnergyConsumersNeed = 0;

        int weeks = 10;
        for (int i = 0; i < weeks; i ++){
            for(EnergyConsumers consument: energyConsumers){
               howMuchEnergyConsumersNeed += consument.getUnitsConusumedPerWeek();
            }}
        for (int i = 0; i < weeks; i ++){
            for(Mines mine: minesList){
                storage.addMaterial(mine.getMaterialType(), mine.getUnitsProducedPerWeek());
            }}
        for (int i = 0; i < weeks; i ++) {
            for (PowerPlants plants : powerPlants) {
                howMuchPlantsProducedEnergy += (plants.getUnitsProducedPerWeek() - plants.getUnitsConsumedPerWeek());
            }
        }

        if(howMuchEnergyConsumersNeed < howMuchPlantsProducedEnergy){
        System.out.println("Yes, they can. They still have " + (howMuchPlantsProducedEnergy - howMuchEnergyConsumersNeed) +  " units of power.");
        }
        else {
            System.out.println("No, they can't. They need " + Math.abs(howMuchPlantsProducedEnergy - howMuchEnergyConsumersNeed) + " units of power.");
        }
    }
}


