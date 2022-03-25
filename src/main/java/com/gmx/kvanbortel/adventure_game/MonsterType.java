package com.gmx.kvanbortel.adventure_game;

public class MonsterType {
    public static final MonsterType LICH = new MonsterType("Lich", 10);
    private final String name;
    private final int totalHealth;

    public MonsterType(String name, int totalHealth) {
        this.name = name;
        this.totalHealth = totalHealth;
    }

    public String getName() { return name; }
    public int getTotalHealth() { return totalHealth; }
}
