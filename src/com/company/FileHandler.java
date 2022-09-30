package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileHandler {

    public List<Weapon> readWeaponsFile(){
        String line;
        List<Weapon> weaponList = new ArrayList<>();
        try {
            Scanner s = new Scanner(new File("weapons.csv"));
            s.nextLine();
            while (s.hasNextLine()){
                line = s.nextLine();
                weaponList.add(deserialize(line));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return weaponList;
    }

    public Weapon deserialize(String line) {
        String[] parts = line.split(";");
        return new Weapon(parts[0],
                CombatType.valueOf(parts[1]),
                DamageTyp.valueOf(parts[2]),
                Integer.parseInt(parts[3]),
                Integer.parseInt(parts[4]),
                Integer.parseInt(parts[5]),
                Integer.parseInt(parts[6]));
    }

}
