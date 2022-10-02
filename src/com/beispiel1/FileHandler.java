package com.beispiel1;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FileHandler {

    public List<Weapon> readWeaponsFile() throws IOException {
        String line;
        List<Weapon> weaponList = new ArrayList<>();
//        try {
//            Scanner s = new Scanner(new File("weapons.csv"));
//            s.nextLine();
//            while (s.hasNextLine()){
//                line = s.nextLine();
//                weaponList.add(deserialize(line));
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//        return weaponList;

       weaponList = Files.lines(new File("weapons.csv").toPath())
               .skip(1)
               .map(n -> n.split(";"))
               .map(n -> new Weapon(n[0],
                       CombatType.valueOf(n[1]),
                       DamageType.valueOf(n[2]),
                       Integer.parseInt(n[3]),
                       Integer.parseInt(n[4]),
                       Integer.parseInt(n[5]),
                       Integer.parseInt(n[6])
               )).collect(Collectors.toList());

       return weaponList;
    }

//    public Weapon deserialize(String line) {
//        String[] parts = line.split(";");
//        return new Weapon(parts[0],
//                CombatType.valueOf(parts[1]),
//                DamageTyp.valueOf(parts[2]),
//                Integer.parseInt(parts[3]),
//                Integer.parseInt(parts[4]),
//                Integer.parseInt(parts[5]),
//                Integer.parseInt(parts[6]));
//    }

}
