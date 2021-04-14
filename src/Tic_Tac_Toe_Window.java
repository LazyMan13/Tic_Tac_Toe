/********************************************************************************
 * Author: Robert Henderson
 * Date: 4-13-2021
 * Adapted From: Mike Hostetler
 *      Assignment: Student Example 7
 *      Date: 1-4-2009
 ********************************************************************************/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Tic_Tac_Toe_Window extends JFrame{
    private static final int WIDTH = 550;
    private static final int HEIGHT = 400;

    private int count = 1;
    private String player = "";
    private int xWins = 0;
    private int oWins = 0;
    private int catGameCount = 0;

    JButton cell_1, cell_2, cell_3;
    JButton cell_4, cell_5, cell_6;
    JButton cell_7, cell_8, cell_9;

    private final JLabel xPlayer = new JLabel("Player X = " + xWins);
    private final JLabel oPlayer = new JLabel("Player O = " + oWins);
    private final JLabel catGame = new JLabel("Cat Game = " + catGameCount);

    public Tic_Tac_Toe_Window()
    {
        setTitle("Tic-Tac-Toe Window");
        setSize(WIDTH, HEIGHT);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        createContents();
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
    }


    private void createContents() {
        JPanel left = new JPanel(new GridLayout(3,3));
        add(left, BorderLayout.CENTER);
        left.setPreferredSize(new Dimension(400,400));

        //JPanel right = new JPanel(new GridLayout(1,1));
        JPanel right = new JPanel(new FlowLayout());
        add(right, BorderLayout.EAST);
        right.setPreferredSize(new Dimension(150,400));

        right.add(xPlayer);
        xPlayer.setFont(new Font("Arial", Font.BOLD, 18));
        right.add(oPlayer);
        oPlayer.setFont(new Font("Arial", Font.BOLD, 18));
        right.add(catGame);
        catGame.setFont(new Font("Arial", Font.BOLD, 18));

        cell_1 = new JButton("1");
        cell_1.setForeground(new Color(0f,0f,0f,0f));
        cell_1.addActionListener(new Listener());
        left.add(cell_1);

        cell_2 = new JButton("2");
        cell_2.setForeground(new Color(0f,0f,0f,0f));
        cell_2.addActionListener(new Listener());
        left.add(cell_2);

        cell_3 = new JButton("3");
        cell_3.setForeground(new Color(0f,0f,0f,0f));
        cell_3.addActionListener(new Listener());
        left.add(cell_3);


        cell_4 = new JButton("4");
        cell_4.setForeground(new Color(0f,0f,0f,0f));
        cell_4.addActionListener(new Listener());
        left.add(cell_4);

        cell_5 = new JButton("5");
        cell_5.setForeground(new Color(0f,0f,0f,0f));
        cell_5.addActionListener(new Listener());
        left.add(cell_5);

        cell_6 = new JButton("6");
        cell_6.setForeground(new Color(0f,0f,0f,0f));
        cell_6.addActionListener(new Listener());
        left.add(cell_6);


        cell_7 = new JButton("7");
        cell_7.setForeground(new Color(0f,0f,0f,0f));
        cell_7.addActionListener(new Listener());
        left.add(cell_7);

        cell_8 = new JButton("8");
        cell_8.setForeground(new Color(0f,0f,0f,0f));
        cell_8.addActionListener(new Listener());
        left.add(cell_8);

        cell_9 = new JButton("9");
        cell_9.setForeground(new Color(0f,0f,0f,0f));
        cell_9.addActionListener(new Listener());
        left.add(cell_9);
    }

    private class Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getActionCommand().equals("1")) {
                whoisPlayer();
                cell_1.setText(player);
                cell_1.setForeground(new Color(0f,0f,0f,1f));
                cell_1.setFont(new Font("Arial", Font.BOLD, 80));
                checkWinCondition();
            }
            if (e.getActionCommand().equals("2")) {
                whoisPlayer();
                cell_2.setText(player);
                cell_2.setForeground(new Color(0f,0f,0f,1f));
                cell_2.setFont(new Font("Arial", Font.BOLD, 80));
                checkWinCondition();
            }
            if (e.getActionCommand().equals("3")) {
                whoisPlayer();
                cell_3.setText(player);
                cell_3.setForeground(new Color(0f,0f,0f,1f));
                cell_3.setFont(new Font("Arial", Font.BOLD, 80));
                checkWinCondition();
            }
            if (e.getActionCommand().equals("4")) {
                whoisPlayer();
                cell_4.setText(player);
                cell_4.setForeground(new Color(0f,0f,0f,1f));
                cell_4.setFont(new Font("Arial", Font.BOLD, 80));
                checkWinCondition();
            }
            if (e.getActionCommand().equals("5")) {
                whoisPlayer();
                cell_5.setText(player);
                cell_5.setForeground(new Color(0f,0f,0f,1f));
                cell_5.setFont(new Font("Arial", Font.BOLD, 80));
                checkWinCondition();
            }
            if (e.getActionCommand().equals("6")) {
                whoisPlayer();
                cell_6.setText(player);
                cell_6.setForeground(new Color(0f,0f,0f,1f));
                cell_6.setFont(new Font("Arial", Font.BOLD, 80));
                checkWinCondition();
            }
            if (e.getActionCommand().equals("7")) {
                whoisPlayer();
                cell_7.setText(player);
                cell_7.setForeground(new Color(0f,0f,0f,1f));
                cell_7.setFont(new Font("Arial", Font.BOLD, 80));
                checkWinCondition();
            }
            if (e.getActionCommand().equals("8")) {
                whoisPlayer();
                cell_8.setText(player);
                cell_8.setForeground(new Color(0f,0f,0f,1f));
                cell_8.setFont(new Font("Arial", Font.BOLD, 80));
                checkWinCondition();
            }
            if (e.getActionCommand().equals("9")) {
                whoisPlayer();
                cell_9.setText(player);
                cell_9.setForeground(new Color(0f,0f,0f,1f));
                cell_9.setFont(new Font("Arial", Font.BOLD, 80));
                checkWinCondition();
            }
        }
    }

    private void whoisPlayer() {
        int a = count % 2;

        if (a == 0) {
            player = "O";
        }

        if (a == 1) {
            player = "X";
        }

    }

    private void checkWinCondition() {
        if (count >= 5) {

            //horizontal
            if(cell_1.getText().equals(cell_2.getText()) && cell_1.getText().equals(cell_3.getText())) {
                JOptionPane.showMessageDialog(null,
                        "Player " + player + " Won!",
                        "Who won?",
                        JOptionPane.PLAIN_MESSAGE);
                if(player.equals("X")) {
                    xWins++;
                    xPlayer.setText("Player X = " + xWins);
                }
                if(player.equals("O")) {
                    oWins++;
                    oPlayer.setText("Player O = " + oWins);
                }
                newGame();
            }

            if(cell_4.getText().equals(cell_5.getText()) && cell_4.getText().equals(cell_6.getText())) {
                JOptionPane.showMessageDialog(null,
                        "Player " + player + " Won!",
                        "Who won?",
                        JOptionPane.PLAIN_MESSAGE);
                if(player.equals("X")) {
                    xWins++;
                    xPlayer.setText("Player X = " + xWins);
                }
                if(player.equals("O")) {
                    oWins++;
                    oPlayer.setText("Player O = " + oWins);
                }
                newGame();
            }

            if(cell_7.getText().equals(cell_8.getText()) && cell_7.getText().equals(cell_9.getText())) {
                JOptionPane.showMessageDialog(null,
                        "Player " + player + " Won!",
                        "Who won?",
                        JOptionPane.PLAIN_MESSAGE);
                if(player.equals("X")) {
                    xWins++;
                    xPlayer.setText("Player X = " + xWins);
                }
                if(player.equals("O")) {
                    oWins++;
                    oPlayer.setText("Player O = " + oWins);
                }
                newGame();
            }

            //vertical
            if(cell_1.getText().equals(cell_4.getText()) && cell_1.getText().equals(cell_7.getText())) {
                JOptionPane.showMessageDialog(null,
                        "Player " + player + " Won!",
                        "Who won?",
                        JOptionPane.PLAIN_MESSAGE);
                if(player.equals("X")) {
                    xWins++;
                    xPlayer.setText("Player X = " + xWins);
                }
                if(player.equals("O")) {
                    oWins++;
                    oPlayer.setText("Player O = " + oWins);
                }
                newGame();
            }

            if(cell_2.getText().equals(cell_5.getText()) && cell_2.getText().equals(cell_8.getText())) {
                JOptionPane.showMessageDialog(null,
                        "Player " + player + " Won!",
                        "Who won?",
                        JOptionPane.PLAIN_MESSAGE);
                if(player.equals("X")) {
                    xWins++;
                    xPlayer.setText("Player X = " + xWins);
                }
                if(player.equals("O")) {
                    oWins++;
                    oPlayer.setText("Player O = " + oWins);
                }
                newGame();
            }

            if(cell_3.getText().equals(cell_6.getText()) && cell_3.getText().equals(cell_9.getText())) {
                JOptionPane.showMessageDialog(null,
                        "Player " + player + " Won!",
                        "Who won?",
                        JOptionPane.PLAIN_MESSAGE);
                if(player.equals("X")) {
                    xWins++;
                    xPlayer.setText("Player X = " + xWins);
                }
                if(player.equals("O")) {
                    oWins++;
                    oPlayer.setText("Player O = " + oWins);
                }
                newGame();
            }

            //diagonal
            if(cell_1.getText().equals(cell_5.getText()) && cell_1.getText().equals(cell_9.getText())) {
                JOptionPane.showMessageDialog(null,
                        "Player " + player + " Won!",
                        "Who won?",
                        JOptionPane.PLAIN_MESSAGE);
                if(player.equals("X")) {
                    xWins++;
                    xPlayer.setText("Player X = " + xWins);
                }
                if(player.equals("O")) {
                    oWins++;
                    oPlayer.setText("Player O = " + oWins);
                }
                newGame();
            }

            if(cell_3.getText().equals(cell_5.getText()) && cell_3.getText().equals(cell_7.getText())) {
                JOptionPane.showMessageDialog(null,
                        "Player " + player + " Won!",
                        "Who won?",
                        JOptionPane.PLAIN_MESSAGE);
                if(player.equals("X")) {
                    xWins++;
                    xPlayer.setText("Player X = " + xWins);
                }
                if(player.equals("O")) {
                    oWins++;
                    oPlayer.setText("Player O = " + oWins);
                }
                newGame();
            }

            //cat game
            if (count == 9) {
                JOptionPane.showMessageDialog(null,
                        "Cat Game",
                        "Who won?",
                        JOptionPane.PLAIN_MESSAGE);
                catGameCount++;
                catGame.setText("Cat Game = " + catGameCount);
                newGame();
            }
        }

        count++;
    }

    private void newGame() {
        int playAgain = JOptionPane.showConfirmDialog(null,
                                "Would you like to play again?",
                                "Play again?",
                                JOptionPane.YES_NO_OPTION,
                                JOptionPane.QUESTION_MESSAGE);
        if(playAgain == JOptionPane.YES_OPTION){
            resetBoard();
        }

        if(playAgain == JOptionPane.NO_OPTION){
            System.exit(0);
        }
    }

    private void resetBoard() {
        cell_1.setText("1");
        cell_1.setForeground(new Color(0f,0f,0f,0f));
        cell_2.setText("2");
        cell_2.setForeground(new Color(0f,0f,0f,0f));
        cell_3.setText("3");
        cell_3.setForeground(new Color(0f,0f,0f,0f));
        cell_4.setText("4");
        cell_4.setForeground(new Color(0f,0f,0f,0f));
        cell_5.setText("5");
        cell_5.setForeground(new Color(0f,0f,0f,0f));
        cell_6.setText("6");
        cell_6.setForeground(new Color(0f,0f,0f,0f));
        cell_7.setText("7");
        cell_7.setForeground(new Color(0f,0f,0f,0f));
        cell_8.setText("8");
        cell_8.setForeground(new Color(0f,0f,0f,0f));
        cell_9.setText("9");
        cell_9.setForeground(new Color(0f,0f,0f,0f));
        count = 0;
    }

    public static void main(String[]args) {
        new Tic_Tac_Toe_Window();
    }
}
