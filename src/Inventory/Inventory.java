package Inventory;

import Miner.Miner;

public class Inventory {
    private Miner[] party;
    private int gold;

    public Inventory(){
        party = new Miner[6];
        gold = 0;
    }

    public Miner[] getParty() {
        return party;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }
}
