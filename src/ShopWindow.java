import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ShopWindow extends JFrame implements ActionListener {
    //Spawn the miner generator and grab its miner array
    MinerGenerator minerGenerator = new MinerGenerator();
    Miner[] miners = minerGenerator.generateMiners();

    //Declare the button and labels
    JButton button;
    JLabel first, second, third, fourth, fifth, sixth;

    public ShopWindow(){
        //Initiate button
        button = new JButton();
        button.setBounds(0, 600, 795, 65); //(x,y,width,height)
        button.addActionListener(this); //Call the action listener
        button.setText("Reshuffle Miners");
        button.setFocusable(false); //Make sure the text is flush with the button

        //Initiate the Labels
        first = new JLabel();
        first.setBounds(0, 0, 800, 100);
        first.setText("Species: " + miners[0].getName()
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
        second.setBounds(0, 100, 800, 100);
        second.setText("Species: " + miners[1].getName()
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
        third.setBounds(0, 200, 800, 100);
        third.setText("Species: " + miners[2].getName()
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
        fourth.setBounds(0, 300, 800, 100);
        fourth.setText("Species: " + miners[3].getName()
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
        fifth.setBounds(0, 400, 800, 100);
        fifth.setText("Species: " + miners[4].getName()
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
        sixth.setBounds(0, 500, 800, 100);
        sixth.setText("Species: " + miners[5].getName()
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
        this.setSize(800, 700);
        this.setTitle("Mini-Miners");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLayout(null);
        this.add(button);
        this.add(first);
        this.add(second);
        this.add(third);
        this.add(fourth);
        this.add(fifth);
        this.add(sixth);
        this.setVisible(true);
    }

    //Implement the Action Listener
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==button){
            //Regenerate Miners
            miners = minerGenerator.generateMiners();
            first.setText("Species: " + miners[0].getName()
                    + " Attack: " + miners[0].getAttack()
                    + " Defense: " + miners[0].getDefense()
                    + " Speed: " + miners[0].getSpeed()
                    + " Health: " + miners[0].getHealth()
                    + " Gold: " + miners[0].getGold()
                    + " Level: " + miners[0].getLevel()
                    + " Price: " + miners[0].getPrice());
            second.setText("Species: " + miners[1].getName()
                    + " Attack: " + miners[1].getAttack()
                    + " Defense: " + miners[1].getDefense()
                    + " Speed: " + miners[1].getSpeed()
                    + " Health: " + miners[1].getHealth()
                    + " Gold: " + miners[1].getGold()
                    + " Level: " + miners[1].getLevel()
                    + " Price: " + miners[1].getPrice());
            third.setText("Species: " + miners[2].getName()
                    + " Attack: " + miners[2].getAttack()
                    + " Defense: " + miners[2].getDefense()
                    + " Speed: " + miners[2].getSpeed()
                    + " Health: " + miners[2].getHealth()
                    + " Gold: " + miners[2].getGold()
                    + " Level: " + miners[2].getLevel()
                    + " Price: " + miners[2].getPrice());
            fourth.setText("Species: " + miners[3].getName()
                    + " Attack: " + miners[3].getAttack()
                    + " Defense: " + miners[3].getDefense()
                    + " Speed: " + miners[3].getSpeed()
                    + " Health: " + miners[3].getHealth()
                    + " Gold: " + miners[3].getGold()
                    + " Level: " + miners[3].getLevel()
                    + " Price: " + miners[3].getPrice());
            fifth.setText("Species: " + miners[4].getName()
                    + " Attack: " + miners[4].getAttack()
                    + " Defense: " + miners[4].getDefense()
                    + " Speed: " + miners[4].getSpeed()
                    + " Health: " + miners[4].getHealth()
                    + " Gold: " + miners[4].getGold()
                    + " Level: " + miners[4].getLevel()
                    + " Price: " + miners[4].getPrice());
            sixth.setText("Species: " + miners[5].getName()
                    + " Attack: " + miners[5].getAttack()
                    + " Defense: " + miners[5].getDefense()
                    + " Speed: " + miners[5].getSpeed()
                    + " Health: " + miners[5].getHealth()
                    + " Gold: " + miners[5].getGold()
                    + " Level: " + miners[5].getLevel()
                    + " Price: " + miners[5].getPrice());
            System.out.println("Miners have been reshuffled");
        }
    }
}
