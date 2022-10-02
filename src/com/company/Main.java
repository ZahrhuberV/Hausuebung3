package com.company;

import com.sun.security.jgss.GSSUtil;

import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        FileHandler fileHandler = new FileHandler();
        List<Weapon> weaponList = null;
        try {
            weaponList = fileHandler.readWeaponsFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //1.2
        main.sortByDamage(weaponList);
        //1.3
        main.sortByAlphabet(weaponList);
        //1.5
        Printable printable1 = n -> System.out.println(n);
        printable1.print(weaponList);
        //1.6 fehtl 1.3 funktioniert noch nicht
    }

    public List<Weapon> sortByDamage(List<Weapon> weaponList) {
        weaponList.sort((n, m) -> m.getDamage() - n.getDamage() );
        return  weaponList;
    }

    public List<Weapon> sortByAlphabet(List<Weapon> weaponList) {
        weaponList.sort((n, m) -> {
            if(n.getCombatType().equals(m.getCombatType())){
                if(n.getDamageType().equals(m.getDamageType())){
                    return n.getName().compareTo(m.getName());
                }
                return n.getDamageType().compareTo(m.getDamageType());
            }
            return n.getCombatType().compareTo(m.getCombatType());
        });
        return  weaponList;
    }
}
