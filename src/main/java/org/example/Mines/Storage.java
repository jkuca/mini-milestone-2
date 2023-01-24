package org.example.Mines;

import org.example.MaterialType;

public class Storage {

     int amountOfCoal = 0;
     int amountOfSunlight = 99999999;
     int amountOfHelium = 0;
    public int amountOfUranium = 0;
     int amountOfAntimatter = 0;


    public void addMaterial(MaterialType material, int amount){

        switch (material){
            case COAL:
                amountOfCoal += amount;
                break;
            case URANIUM:
                amountOfUranium += amount;
                break;
            case HELIUM:
                amountOfHelium += amount;
            case ANTIMATTER:
                amountOfAntimatter += amount;
            }


    }
}



