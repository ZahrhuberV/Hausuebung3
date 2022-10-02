package com.beispiel2;

import com.beispiel1.DamageType;
import com.beispiel1.Weapon;

import java.util.*;
import java.util.stream.Collectors;

public class Streams {

    private static int[] numbers = new int[10000];
    private static String[] words = new String[10];
    public static String allowedChars ="abcdefghijklmnopqrstuvwxyz";

    public static void main(String[] args) {
        Streams main = new Streams();
        //2.1
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = (int)(Math.random()*100);
        }
        //2.2
        double average = main.average(numbers);
        System.out.println(average);
        //2.3
        Random random = new Random();
        for(int i = 0; i < words.length; i++){
           words[i] = generateRandomString(allowedChars, random);
            System.out.println(words[i]);
        }
    }

    public double average(int[] numbers) {
        return Arrays.stream(numbers).asDoubleStream().average().getAsDouble();
    }

    public List<String> upperCase(String[] strings) {
//        Arrays.stream(strings).map(n -> n.toUpperCase());
        return Arrays.stream(strings).map(String::toUpperCase).collect(Collectors.toList());
    }

    public Weapon findWeaponWithLowestDamage(List<Weapon> weapons) {
        if(weapons.size() == 0) return null;
        return weapons.stream().min(Comparator.comparing(p -> p.getDamage())).get();
    }

    public Weapon findWeaponWithHighestStrength(List<Weapon> weapons) {
        if(weapons.size() == 0) return null;
        return weapons.stream().max(Comparator.comparing(p -> p.getStrength())).get();
    }

    public List<Weapon> collectMissileWeapons(List<Weapon> weapons) {
        return weapons.stream().filter(n -> n.getDamageType().equals(DamageType.MISSILE)).collect(Collectors.toList());
    }

    public Weapon findWeaponWithLongestName(List<Weapon> weapons) {
        if(weapons.size() == 0) return null;
        return weapons.stream().max(Comparator.comparing(p -> p.getName().length())).get();
    }

    public List<String> toNameList(List<Weapon> weapons) {
        return weapons.stream().map(n -> n.getName()).collect(Collectors.toList());
    }

    public int[] toSpeedArray(List<Weapon> weapons) {
        return weapons.stream().mapToInt(n -> n.getSpeed()).toArray();
    }

    public int sumUpValues(List<Weapon> weapons) {
        return weapons.stream().mapToInt(n -> n.getValue()).sum();
    }

    public long sumUpHashCodes(List<Weapon> weapons) {
        return weapons.stream().map(Weapon::hashCode).reduce(0, Integer::sum);
    }

    public List<Weapon> removeDuplicates(List<Weapon> weapons) {
           return weapons.stream().distinct().collect(Collectors.toList());
    }

    public void increaseValuesByTenPercent(List<Weapon> weapons) {
        weapons.stream().forEach(n -> n.setValue((int) (n.getValue()*1.1)));
    }

    private static String generateRandomString(String allowedChars,
                                               Random random) {
        int max = allowedChars.length();
        StringBuffer buffer = new StringBuffer();
        for (int i=0; i<10; i++) {
            int value = random.nextInt(max);
            buffer.append(allowedChars.charAt(value));
        }
        return buffer.toString();
    }
}
