package com.gmx.kvanbortel.adventure_game;

public class SaveData {
    private String username;

    public SaveData() {}

    public SaveData(String username) {
        this.username = username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() { return username; }
}
