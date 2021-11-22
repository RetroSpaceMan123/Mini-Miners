package Miner;

public class MinerGenerator {
    private Miner[] miners;
    private final int size;

    public MinerGenerator() {
        this.size = 6;
    }

    public int getSize() {
        return size;
    }

    public Miner[] getMiners() {
        return miners;
    }

    public Miner[] generateMiners(){
        this.miners = new Miner[size];
        for(int i = 0; i < size; i++){
            miners[i] = newMiner();
        }
        return miners;
    }

    public Miner newMiner(){
        Miner newMiner;
            int rng = (int) Math.floor(Math.random() * size);
            switch (rng){
                case 0:
                    newMiner = new Miner("Alpha", 50, 50, 50, 50, 50,1);
                    break;
                case 1:
                    newMiner = new Miner("Bobo", 40, 80, 20, 80, 60,1);
                    break;
                case 2:
                    newMiner = new Miner("Candoo", 30, 30, 90, 20, 30,1);
                    break;
                case 3:
                    newMiner = new Miner("Donbra", 80, 20, 40, 60, 40,1);
                    break;
                case 4:
                    newMiner = new Miner("Endo", 10, 10, 10, 150, 100,1);
                    break;
                case 5:
                    newMiner = new Miner("Fangtai", 60, 30, 70, 30, 40,1);
                    break;
                default:
                    newMiner = new Miner("Why", 0, 0, 0, 0, 0, 0);
        }
        return newMiner;
    }
}

