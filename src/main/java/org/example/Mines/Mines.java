package org.example.Mines;

public class Mines {


    private int unitsProducedPerWeek;
    MaterialType materialType;

    public Mines(int unitsProducedPerWeek, MaterialType materialType){
        this.unitsProducedPerWeek = unitsProducedPerWeek;
        this.materialType = materialType;
    }

    public int getUnitsProducedPerWeek() {
        return unitsProducedPerWeek;
    }

    public MaterialType getMaterialType() {
        return materialType;
    }
}
