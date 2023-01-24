package org.example.Mines;

import org.example.MaterialType;

public class Mines {


    private int unitsProducedPerWeek;
    private int amountOfMaterial = 0;
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
