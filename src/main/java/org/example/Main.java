package org.example;

import org.example.EnergyCosnumers.EnergyConsumers;
import org.example.EnergyCosnumers.Poland;
import org.example.Mines.Mines;
import org.example.Mines.MoonMine;
import org.example.Mines.Storage;
import org.example.Mines.UraniumMine;
import org.example.PowerPlants.FusionPlant;
import org.example.PowerPlants.NuclearPlant;
import org.example.PowerPlants.PowerPlants;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        MoonMine moonMine = new MoonMine();
        UraniumMine uraniumMine = new UraniumMine();
        List<Mines> minesList = new ArrayList<>();
        minesList.add(uraniumMine);
        minesList.add(moonMine);
        Storage storage = new Storage();

        NuclearPlant nuclearPlant = new NuclearPlant();
        FusionPlant fusionPlant = new FusionPlant();
        List<PowerPlants> powerPlants = new ArrayList<>();
        powerPlants.add(fusionPlant);
        powerPlants.add(nuclearPlant);


        Poland poland = new Poland();
        List<EnergyConsumers> energyConsumers = new ArrayList<>();
        energyConsumers.add(poland);
        int howMuchEnergyConsumersNeed;

        for (int i = 0; i < 10; i ++){
            for(EnergyConsumers consument: energyConsumers){
                consument
            }
            for(Mines mine: minesList){
                storage.addMaterial(mine.getMaterialType(), mine.getUnitsProducedPerWeek());
            }
            //for(PowerPlants )
        }

        System.out.println(storage.amountOfUranium);
    }
}