package com.gmx.kvanbortel.adventure_game;

public class Monster {
    private MonsterType type;
    private int currentHealth;

    public Monster(MonsterType type) {
        this.type = type;
        this.currentHealth = type.getTotalHealth();
    }

    public MonsterType getType() { return type; }
    public int getCurrentHealth() { return currentHealth; }

    public String getName() { return type.getName(); }
    public int getTotalHealth() { return type.getTotalHealth(); }

    public void display() {
        System.out.printf(
            "It's a %s!%n" +
            "It has %d health.%n",
            getName(), getTotalHealth()
        );
    }

    public void displayHealthBar() {
        System.out.printf("%s [", getName());
        int i = 0;
        for (; i < currentHealth; i++)
            System.out.print("+");
        for (; i < getTotalHealth(); i++)
            System.out.print("-");
        System.out.println("]");
    }
}
