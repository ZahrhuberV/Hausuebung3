package com.beispiel1;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MainAufgabe1Test {

    @org.junit.jupiter.api.Test
    void sortByDamage() {
        MainAufgabe1 mainAufgabe1 = new MainAufgabe1();

        List<Weapon> expected = new ArrayList<>();
        List<Weapon> result = new ArrayList<>();
        result.add(new Weapon("weapon1", CombatType.MELEE, DamageType.MISSILE,
                10, 3, 5, 4250));
        result.add(new Weapon("weapon1", CombatType.MELEE, DamageType.MISSILE,
                8, 3, 5, 4250));
        result.add(new Weapon("weapon1", CombatType.MELEE, DamageType.MISSILE,
                19, 3, 5, 4250));

        expected.add(new Weapon("weapon1", CombatType.MELEE, DamageType.MISSILE,
                19, 3, 5, 4250));
        expected.add(new Weapon("weapon1", CombatType.MELEE, DamageType.MISSILE,
                10, 3, 5, 4250));
        expected.add(new Weapon("weapon1", CombatType.MELEE, DamageType.MISSILE,
                8, 3, 5, 4250));

        result = mainAufgabe1.sortByDamage(result);

        assertEquals(result.toString(), expected.toString());
    }

    @org.junit.jupiter.api.Test
    void sortByAlphabet() {
//        Main main = new Main();
//
//        List<Weapon> expected = new ArrayList<>();
//        List<Weapon> result = new ArrayList<>();
//
//        result.add(new Weapon("dora", CombatType.RANGED, DamageTyp.SLASHING,
//                8, 3, 5, 4250));
//        result.add(new Weapon("claus", CombatType.NONE, DamageTyp.PIERCING,
//                10, 3, 5, 4250));
//        result.add(new Weapon("esther", CombatType.RANGED, DamageTyp.SLASHING,
//                8, 3, 5, 4250));
//        result.add(new Weapon("berta", CombatType.MELEE, DamageTyp.BLUNT,
//                19, 3, 5, 4250));
//        result.add(new Weapon("alex", CombatType.MELEE, DamageTyp.MISSILE,
//                19, 3, 5, 4250));
//
//        expected.add(new Weapon("berta", CombatType.MELEE, DamageTyp.BLUNT,
//                19, 3, 5, 4250));
//        expected.add(new Weapon("alex", CombatType.MELEE, DamageTyp.MISSILE,
//                19, 3, 5, 4250));
//        expected.add(new Weapon("claus", CombatType.NONE, DamageTyp.PIERCING,
//                10, 3, 5, 4250));
//        expected.add(new Weapon("dora", CombatType.RANGED, DamageTyp.SLASHING,
//                8, 3, 5, 4250));
//        expected.add(new Weapon("esther", CombatType.RANGED, DamageTyp.SLASHING,
//                8, 3, 5, 4250));
//
//        result = main.sortByAlphabet(result);
//
//        assertEquals(expected.toString(), result.toString());
    }
}