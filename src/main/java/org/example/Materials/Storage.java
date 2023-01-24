package org.example.Materials;

import org.example.Materials.MaterialType;

public class Storage {

     private int amountOfCoal = 0;
    private int amountOfHelium = 0;
    private int amountOfUranium = 0;
    private int amountOfAntimatter = 0;

    public void addMaterial(MaterialType material, int amount){

        switch (material){
            case COAL:
                amountOfCoal += amount;
            case URANIUM:
                amountOfUranium += amount;
            case HELIUM:
                amountOfHelium += amount;
            case ANTIMATTER:
                amountOfAntimatter += amount;
            }
    }
}



