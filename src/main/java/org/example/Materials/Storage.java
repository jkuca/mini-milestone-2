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
//
//    public void getMaterialFromStorage(MaterialType material, int amount){
//        switch (material){
//            case COAL:
//                amountOfCoal -= amount;
//                break;
//            case URANIUM:
//                amountOfUranium -= amount;
//                break;
//            case HELIUM:
//                amountOfHelium -= amount;
//            case ANTIMATTER:
//                amountOfAntimatter -= amount;
//        }
//    }    public boolean checkIfIsEnoughMaterial (MaterialType material, int amount){
//        switch (material){
//            case COAL:
//               if(amountOfCoal < amount)
//                return false;
//            case URANIUM:
//               if (amountOfUranium < amount)
//                   System.out.println(amountOfUranium);
//            case HELIUM:
//                if (amountOfHelium < amount)
//                return false;
//            case ANTIMATTER:
//               if (amountOfAntimatter < amount)
//                return false;
//        }
//        return true;
//    }

}



