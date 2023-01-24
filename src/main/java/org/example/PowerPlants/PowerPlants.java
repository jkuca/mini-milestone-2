package org.example.PowerPlants;

public class PowerPlants {

    private int unitsProducedPerWeek;
    private int unitsConsumedPerWeek;

    public PowerPlants(int unitsConsumedPerWeek, int unitsProducedPerWeek){
        this.unitsConsumedPerWeek = unitsConsumedPerWeek;
        this.unitsProducedPerWeek = unitsProducedPerWeek;
    }

    public int getUnitsConsumedPerWeek() {
        return unitsConsumedPerWeek;
    }

    public int getUnitsProducedPerWeek() {
        return unitsProducedPerWeek;
    }
}
