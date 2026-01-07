package org.example.rpg;

public class RpgMain {
    public static void main(String[] args) {
        Monster troll = new Troll("Shrek", 1000, 40);

        System.out.println("Troll Name: " + troll.getName());
        System.out.println("Troll Damage: " + troll.getDamage());

        System.out.println("Troll Attack Damage: " + troll.attack());
    }
}