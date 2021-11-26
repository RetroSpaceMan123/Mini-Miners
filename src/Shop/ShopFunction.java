package Shop;

import Miner.Miner;
import Miner.MinerGenerator;

import javax.swing.*;

public class ShopFunction {
    //Buy Miners
    public static boolean buyMiner(int position, Miner[] miners,Miner[] party){
        for(int i = 0; i < party.length; i++){
            if(party[i] == null){
                party[i] = miners[position];
                return true;
            }
            else continue;
        }
        return false;
    }

    //Regenerates Miners
    public static void regenMiners(JLabel first, JLabel second, JLabel third, JLabel fourth, JLabel fifth, JLabel sixth, Miner[] miners, MinerGenerator minerGenerator){
        miners = minerGenerator.generateMiners();
        first.setText("1. Species: " + miners[0].getName()
                + " Attack: " + miners[0].getAttack()
                + " Defense: " + miners[0].getDefense()
                + " Speed: " + miners[0].getSpeed()
                + " Health: " + miners[0].getHealth()
                + " Gold: " + miners[0].getGold()
                + " Level: " + miners[0].getLevel()
                + " Price: " + miners[0].getPrice());

        ImageIcon icon = new ImageIcon(miners[0].getImage());
        first.setIcon(icon);

        second.setText("2. Species: " + miners[1].getName()
                + " Attack: " + miners[1].getAttack()
                + " Defense: " + miners[1].getDefense()
                + " Speed: " + miners[1].getSpeed()
                + " Health: " + miners[1].getHealth()
                + " Gold: " + miners[1].getGold()
                + " Level: " + miners[1].getLevel()
                + " Price: " + miners[1].getPrice());

        ImageIcon icon1 = new ImageIcon(miners[1].getImage());
        second.setIcon(icon1);

        third.setText("3. Species: " + miners[2].getName()
                + " Attack: " + miners[2].getAttack()
                + " Defense: " + miners[2].getDefense()
                + " Speed: " + miners[2].getSpeed()
                + " Health: " + miners[2].getHealth()
                + " Gold: " + miners[2].getGold()
                + " Level: " + miners[2].getLevel()
                + " Price: " + miners[2].getPrice());

        ImageIcon icon2 = new ImageIcon(miners[2].getImage());
        third.setIcon(icon2);

        fourth.setText("4. Species: " + miners[3].getName()
                + " Attack: " + miners[3].getAttack()
                + " Defense: " + miners[3].getDefense()
                + " Speed: " + miners[3].getSpeed()
                + " Health: " + miners[3].getHealth()
                + " Gold: " + miners[3].getGold()
                + " Level: " + miners[3].getLevel()
                + " Price: " + miners[3].getPrice());

        ImageIcon icon3 = new ImageIcon(miners[3].getImage());
        fourth.setIcon(icon3);

        fifth.setText("5. Species: " + miners[4].getName()
                + " Attack: " + miners[4].getAttack()
                + " Defense: " + miners[4].getDefense()
                + " Speed: " + miners[4].getSpeed()
                + " Health: " + miners[4].getHealth()
                + " Gold: " + miners[4].getGold()
                + " Level: " + miners[4].getLevel()
                + " Price: " + miners[4].getPrice());

        ImageIcon icon4 = new ImageIcon(miners[4].getImage());
        fifth.setIcon(icon4);

        sixth.setText("6. Species: " + miners[5].getName()
                + " Attack: " + miners[5].getAttack()
                + " Defense: " + miners[5].getDefense()
                + " Speed: " + miners[5].getSpeed()
                + " Health: " + miners[5].getHealth()
                + " Gold: " + miners[5].getGold()
                + " Level: " + miners[5].getLevel()
                + " Price: " + miners[5].getPrice());

        ImageIcon icon5 = new ImageIcon(miners[5].getImage());
        first.setIcon(icon5);
    }
}
