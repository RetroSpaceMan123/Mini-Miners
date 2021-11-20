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
            int miner = (int) Math.floor(Math.random() * size);
            switch (miner){
                case 0:
                    miners[i] = new Miner("Alpha", 50, 50, 50, 50, 50,1);
                    break;
                case 1:
                    miners[i] = new Miner("Bobo", 40, 80, 20, 80, 60,1);
                    break;
                case 2:
                    miners[i] = new Miner("Candoo", 30, 30, 90, 20, 30,1);
                    break;
                case 3:
                    miners[i] = new Miner("Donbra", 80, 20, 40, 60, 40,1);
                    break;
                case 4:
                    miners[i] = new Miner("Endo", 10, 10, 10, 150, 100,1);
                    break;
                case 5:
                    miners[i] = new Miner("Fangtai", 60, 30, 70, 30, 40,1);
                    break;
                default:
                    miners[i] = new Miner("Why", 0, 0, 0, 0, 0, 0);
            }
        }
        return miners;
    }
}

