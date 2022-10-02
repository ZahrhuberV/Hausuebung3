package com.beispiel1;

import java.io.IOException;
import java.util.List;

public class MainAufgabe1 {

    public static void main(String[] args) {
        MainAufgabe1 mainAufgabe1 = new MainAufgabe1();
        FileHandler fileHandler = new FileHandler();
        List<Weapon> weaponList = null;
        try {
            weaponList = fileHandler.readWeaponsFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //1.2
        mainAufgabe1.sortByDamage(weaponList);
        //1.3
        mainAufgabe1.sortByAlphabet(weaponList);
        //1.5
        Printable printable1 = n -> System.out.println(n);
        printable1.print(weaponList);
        //1.6
        Printable printable2 = n -> {
            System.out.printf("%-17s %2s %-17s %2s %-17s %2s %-17s %2s %-17s %2s %-17s %2s %-17s", "Name", "|", "CombatType", "|", "DamageType", "|", "Damage", "|", "Speed", "|", "Strength", "|", "Value");
            System.out.println();
            System.out.printf("%-17s %1s %-17s %1s %-17s %1s %-17s %1s %-17s %1s %-17s %1s %-17s", "-------------------", "+", "------------------", "+", "------------------", "+", "------------------", "+", "------------------", "+", "------------------", "+", "-----");
            System.out.println();
            n.forEach(s -> {
                System.out.format("%-17s %2s %-17s %2s %-17s %2s %-17s %2s %-17s %2s %-17s %2s %-17s", s.getName(), "|", s.getCombatType(), "|", s.getDamageType(), "|", s.getDamage(), "|", s.getSpeed(), "|", s.getStrength(), "|", s.getValue());
                System.out.println();
                System.out.printf("%-17s %1s %-17s %1s %-17s %1s %-17s %1s %-17s %1s %-17s %1s %-17s", "------------------", "+", "------------------", "+", "------------------", "+", "------------------", "+", "------------------", "+", "------------------", "+", "-----");
                System.out.println();
            });
        };
        printable2.print(weaponList);
    }

    public List<Weapon> sortByDamage(List<Weapon> weaponList) {
        weaponList.sort((n, m) -> m.getDamage() - n.getDamage() );
        return  weaponList;
    }

    public List<Weapon> sortByAlphabet(List<Weapon> weaponList) {
        weaponList.sort((n, m) -> {
            if(n.getCombatType().compareTo(m.getCombatType()) == 0){
                if(n.getDamageType().compareTo(m.getDamageType()) == 0){
                    return n.getName().compareTo(m.getName());
                }
                return n.getDamageType().compareTo(m.getDamageType());
            }
            return n.getCombatType().compareTo(m.getCombatType());
        });
        return  weaponList;
    }
}
