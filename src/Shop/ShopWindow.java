package Shop;

import Inventory.Inventory;
import Miner.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ShopWindow extends JFrame implements ActionListener {
    //Spawn the miner generator and grab its miner array
    MinerGenerator minerGenerator = new MinerGenerator();
    Miner[] miners = minerGenerator.generateMiners();

    //Declare the button and labels
    JButton shuffle;
    JLabel first, second, third, fourth, fifth, sixth;

    public ShopWindow(Inventory inventory){
        //Import inventory
        Miner[] party = inventory.getParty();
        int gold = inventory.getGold();

        //Initiate button
        shuffle = new JButton();
        shuffle.setBounds(0, 400, 800, 50); //(x,y,width,height)
        shuffle.addActionListener(this); //Call the action listener
        shuffle.setText("Reshuffle Miners");
        shuffle.setFocusable(false); //Make sure the text is flush with the button

        //Menu Options
        JMenuBar menuBar = new JMenuBar();
        menuBar.setVisible(true);

        JMenu menu = new JMenu("Menu");

        menuBar.add(menu);
        this.setJMenuBar(menuBar);

        //Initiate the Labels
        first = new JLabel();
        first.setBounds(0, 50, 800, 50);
        first.setText("1. Species: " + miners[0].getName()
                + " Attack: " + miners[0].getAttack()
                + " Defense: " + miners[0].getDefense()
                + " Speed: " + miners[0].getSpeed()
                + " Health: " + miners[0].getHealth()
                + " Gold: " + miners[0].getGold()
                + " Level: " + miners[0].getLevel()
                + " Price: " + miners[0].getPrice());
        first.setForeground(Color.BLACK);
        first.setBackground(new Color(245, 207, 171));
        first.setOpaque(true);

        second = new JLabel();
        second.setBounds(0, 100, 800, 50);
        second.setText("2. Species: " + miners[1].getName()
                + " Attack: " + miners[1].getAttack()
                + " Defense: " + miners[1].getDefense()
                + " Speed: " + miners[1].getSpeed()
                + " Health: " + miners[1].getHealth()
                + " Gold: " + miners[1].getGold()
                + " Level: " + miners[1].getLevel()
                + " Price: " + miners[1].getPrice());
        second.setForeground(Color.BLACK);
        second.setBackground(new Color(245, 207, 171));
        second.setOpaque(true);

        third = new JLabel();
        third.setBounds(0, 150, 800, 50);
        third.setText("3. Species: " + miners[2].getName()
                + " Attack: " + miners[2].getAttack()
                + " Defense: " + miners[2].getDefense()
                + " Speed: " + miners[2].getSpeed()
                + " Health: " + miners[2].getHealth()
                + " Gold: " + miners[2].getGold()
                + " Level: " + miners[2].getLevel()
                + " Price: " + miners[2].getPrice());
        third.setForeground(Color.BLACK);
        third.setBackground(new Color(245, 207, 171));
        third.setOpaque(true);

        fourth = new JLabel();
        fourth.setBounds(0, 200, 800, 50);
        fourth.setText("4. Species: " + miners[3].getName()
                + " Attack: " + miners[3].getAttack()
                + " Defense: " + miners[3].getDefense()
                + " Speed: " + miners[3].getSpeed()
                + " Health: " + miners[3].getHealth()
                + " Gold: " + miners[3].getGold()
                + " Level: " + miners[3].getLevel()
                + " Price: " + miners[3].getPrice());
        fourth.setForeground(Color.BLACK);
        fourth.setBackground(new Color(245, 207, 171));
        fourth.setOpaque(true);

        fifth = new JLabel();
        fifth.setBounds(0, 250, 800, 50);
        fifth.setText("5. Species: " + miners[4].getName()
                + " Attack: " + miners[4].getAttack()
                + " Defense: " + miners[4].getDefense()
                + " Speed: " + miners[4].getSpeed()
                + " Health: " + miners[4].getHealth()
                + " Gold: " + miners[4].getGold()
                + " Level: " + miners[4].getLevel()
                + " Price: " + miners[4].getPrice());
        fifth.setForeground(Color.BLACK);
        fifth.setBackground(new Color(245, 207, 171));
        fifth.setOpaque(true);

        sixth = new JLabel();
        sixth.setBounds(0, 300, 800, 50);
        sixth.setText("6. Species: " + miners[5].getName()
                + " Attack: " + miners[5].getAttack()
                + " Defense: " + miners[5].getDefense()
                + " Speed: " + miners[5].getSpeed()
                + " Health: " + miners[5].getHealth()
                + " Gold: " + miners[5].getGold()
                + " Level: " + miners[5].getLevel()
                + " Price: " + miners[5].getPrice());
        sixth.setForeground(Color.BLACK);
        sixth.setBackground(new Color(245, 207, 171));
        sixth.setOpaque(true);

        //Set up JFrame Elements
        this.setSize(800, 600);
        this.setTitle("Mini-Miners");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLayout(null);
        this.add(menuBar);
        this.add(first);
        this.add(second);
        this.add(third);
        this.add(fourth);
        this.add(fifth);
        this.add(sixth);
        this.add(shuffle);
        this.setVisible(true);
    }

    //Implement the Action Listener
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==shuffle){
            //Regenerate Miners
            ShopFunction.regenMiners(first, second, third, fourth, fifth, sixth, miners, minerGenerator);
            System.out.println("Miners have been reshuffled");
        }
    }
}
