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
    Miner[] miners;

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
        menuBar.setBorderPainted(true);
        menuBar.setVisible(true);

        JMenu menu = new JMenu("Menu");

        menuBar.add(menu);
        this.setJMenuBar(menuBar);

        //Initiate the Labels
        first = new JLabel();
        first.setBounds(0, 0, 800, 50);
        first.setForeground(Color.BLACK);
        first.setBackground(new Color(245, 207, 171));
        first.setOpaque(true);

        second = new JLabel();
        second.setBounds(0, 50, 800, 50);
        second.setForeground(Color.BLACK);
        second.setBackground(new Color(245, 207, 171));
        second.setOpaque(true);

        third = new JLabel();
        third.setBounds(0, 100, 800, 50);
        third.setBackground(new Color(245, 207, 171));
        third.setOpaque(true);

        fourth = new JLabel();
        fourth.setBounds(0, 150, 800, 50);
        fourth.setForeground(Color.BLACK);
        fourth.setBackground(new Color(245, 207, 171));
        fourth.setOpaque(true);

        fifth = new JLabel();
        fifth.setBounds(0, 200, 800, 50);
        fifth.setForeground(Color.BLACK);
        fifth.setBackground(new Color(245, 207, 171));
        fifth.setOpaque(true);

        sixth = new JLabel();
        sixth.setBounds(0, 250, 800, 50);
        sixth.setForeground(Color.BLACK);
        sixth.setBackground(new Color(245, 207, 171));
        sixth.setOpaque(true);

        //Creates miners and puts them up to the shop
        ShopFunction.regenMiners(first, second, third, fourth, fifth, sixth, miners, minerGenerator);
        //Set up JFrame Elements
        this.setSize(800, 600);
        this.setTitle("Mini-Miners");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setResizable(true);
        this.add(menuBar, BorderLayout.NORTH);
        this.add(first, BorderLayout.CENTER);
        this.add(second, BorderLayout.CENTER);
        this.add(third, BorderLayout.CENTER);
        this.add(fourth, BorderLayout.CENTER);
        this.add(fifth, BorderLayout.CENTER);
        this.add(sixth, BorderLayout.CENTER);
        this.add(shuffle, BorderLayout.SOUTH);
        this.setVisible(true);
    }

    //Implement the Action Listener
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==shuffle){
            //Regenerate Miners
            ShopFunction.regenMiners(first, second, third, fourth, fifth, sixth, miners, minerGenerator);
        }
    }
}
