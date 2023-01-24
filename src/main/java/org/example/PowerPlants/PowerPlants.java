package org.example.PowerPlants;

import org.example.MaterialType;

public class PowerPlants {

    private int unitsProducedPerWeek;
    private int unitsConsumedPerWeek;
    MaterialType powerPlantConsumeThisMaterial;

    public PowerPlants(int unitsConsumedPerWeek, int unitsProducedPerWeek, MaterialType powerPlantConsumeThisMaterial){
        this.unitsConsumedPerWeek = unitsConsumedPerWeek;
        this.unitsProducedPerWeek = unitsProducedPerWeek;
        this.powerPlantConsumeThisMaterial = powerPlantConsumeThisMaterial;
    }

    public int getUnitsConsumedPerWeek() {
        return unitsConsumedPerWeek;
    }

    public int getUnitsProducedPerWeek() {
        return unitsProducedPerWeek;
    }

}
