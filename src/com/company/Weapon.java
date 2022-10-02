package com.company;

public class Weapon {
    private String name;
    private CombatType combatType;
    private DamageTyp damageType;
    private int damage;
    private int speed;
    private int strength;
    private int value;

    public Weapon(String name, CombatType combatType, DamageTyp damageType, int damage, int speed, int strength, int value) {
        this.name = name;
        this.combatType = combatType;
        this.damageType = damageType;
        this.damage = damage;
        this.speed = speed;
        this.strength = strength;
        this.value = value;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public CombatType getCombatType() {
        return combatType;
    }
    public void setCombatType(CombatType combatType) {
        this.combatType = combatType;
    }
    public DamageTyp getDamageType() {
        return damageType;
    }
    public void setDamageType(DamageTyp damageType) {
        this.damageType = damageType;
    }
    public int getDamage() {
        return damage;
    }
    public void setDamage(int damage) {
        this.damage = damage;
    }
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public int getStrength() {
        return strength;
    }
    public void setStrength(int strength) {
        this.strength = strength;
    }
    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Weapon: " + name + " CombatType: " + combatType + " DamageType: " + damageType + " Damage: " + damage + " Speed: " + speed + " Strength: " + strength + " Value: " + value + "\n";
    }
}
