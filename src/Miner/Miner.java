package Miner;

public class Miner {
    //Miner.Miner Traits
    private final String name;
    private int attack, defense, speed, health, gold, level, price;

    public Miner(String name, int attack, int defense, int speed, int health, int gold, int level){
        this.name = name;
        //Miner.Miner Stats are Randomized between half and double the introduced value
        this.attack = (int) (Math.random() * ((2 * attack) - (attack / 2)) + (attack / 2));
        this.defense = (int) (Math.random() * ((2 * defense) - (defense / 2)) + (defense / 2));
        this.speed = (int) (Math.random() * ((2 * speed) - (speed / 2)) + (speed / 2));
        this.health = (int) (Math.random() * ((2 * health) - (health / 2)) + (health / 2));
        this.gold = (int) (Math.random() * ((2 * gold) - (gold / 2)) + (gold / 2));
        this.level = level;
        //Price for the Miner.Miner is the average of all stats times its level
        this.price = ( level * (attack + defense + speed + health + gold) ) / 5;
    }

    public String getName() {
        return name;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }

    public int getSpeed() {
        return speed;
    }

    public int getHealth() {
        return health;
    }

    public int getGold() {
        return gold;
    }

    public int getLevel() {
        return level;
    }

    public int getPrice() {
        return price;
    }

    public void updatePrice(){
        price = (level * (attack + defense + speed + health + gold) / 5);
    }

    public void levelUp(int levelUp){
        for (int i = 0; i < levelUp; i++){
            level ++;
            //Increase all stats by 50% per level
            attack *= 1.5;
            defense *= 1.5;
            speed *= 1.5;
            health *= 1.5;
            gold *= 1.5;
        }
        updatePrice();
    }

    public boolean merge(Miner miner){
        if(this.name.equals(miner.getName())){
            /*When Miners merge, the merged miner's stats increase by the average of the two miner's states
              Merges can only happen with two miners of the same species
             */
            level += (level + miner.getLevel()) / 2;
            attack += (attack + miner.getAttack()) / 2;
            defense += (defense + miner.getDefense()) / 2;
            speed += (speed + miner.getSpeed()) / 2;
            health += (health + miner.getHealth()) / 2;
            gold += (gold + miner.getGold()) / 2;
            updatePrice();
            return true;
        }
        else return false;
    }
}
