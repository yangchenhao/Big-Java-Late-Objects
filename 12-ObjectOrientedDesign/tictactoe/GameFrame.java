/*Write a tic-tac-toe game that allows a human player to play against the computer.
Your program will play many turns against a human opponent, and it will learn.
When it is the computer’s turn, the computer randomly selects an empty field,
except that it won’t ever choose a losing combination. For that purpose, your
pro­gram must keep an array of losing combinations. Whenever the human wins, the
immediately preceding combination is stored as losing. For example, suppose that
X = computer and O = human.*/

package tictactoe;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class GameFrame extends JFrame {
    private static final int FRAME_HEIGHT = 560;
    private static final int FRAME_WIDTH = 500;

    private Button[][] buttons;
    private JLabel currentStateLabel;
    
    private char currentPlayer;
    private boolean isGameOver;

    public GameFrame() {
        this.currentPlayer = 'O';
        this.createComponents();
        this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.setTitle("Tic-tac-toe");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    private void createComponents() {
        createLabel();
        createButtons();
    }

    private void createLabel() {
        this.currentStateLabel = new JLabel();
        this.currentStateLabel.setText("O's turn!");
        this.currentStateLabel.setFont(new Font("Serif", Font.PLAIN, 20));
        this.add(this.currentStateLabel, BorderLayout.SOUTH);
    }

    private void createButtons() {
        JPanel buttonPanel = new JPanel(new GridLayout(3, 3));

        this.buttons = new Button[3][3];
        for (int i = 0; i < buttons.length; i++) {
            for (int j = 0; j < buttons[i].length; j++) {
                this.buttons[i][j] = new Button(' ');
                buttonPanel.add(this.buttons[i][j]);
            }
        }

        this.add(buttonPanel, BorderLayout.CENTER);
    }

    private boolean isFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (this.buttons[i][j].getState() == ' ') {
                    return false;
                }
            }
        }

        return true;
    }

    private boolean hasAwinner(char state) {
        for (int i = 0; i < 3; i++) {
            if (this.buttons[i][0].getState() == state &&
                this.buttons[i][1].getState() == state &&
                this.buttons[i][2].getState() == state) {
                return true;
            }
        }

        for (int i = 0; i < 3; i++) {
            if (this.buttons[0][i].getState() == state &&
                this.buttons[1][i].getState() == state &&
                this.buttons[2][i].getState() == state) {
                return true;
            }
        }

        if (this.buttons[0][0].getState() == state &&
            this.buttons[1][1].getState() == state &&
            this.buttons[2][2].getState() == state) {
            return true;
        }

        if (this.buttons[0][2].getState() == state &&
            this.buttons[1][1].getState() == state &&
            this.buttons[2][0].getState() == state) {
            return true;
        }

        return false;
    }

    private class Button extends JButton {
        private char state;

        public Button(char state) {
            this.setState(state);
            this.addActionListener(new ButtonClickListener());
        }

        public char getState() {
            return this.state;
        }

        public void setState(char state) {
            this.state = state;
        }

        private class ButtonClickListener implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (GameFrame.this.isGameOver) {
                     System.exit(0);
                }

                if (Button.this.state == ' ') {
                    Button.this.setState(GameFrame.this.currentPlayer);

                    if (GameFrame.this.currentPlayer == 'O') {
                        ImageIcon image = new ImageIcon(this.getClass().getResource("tic-tac-toe-o.png"));
                        Button.this.setIcon(image);
                    } else if (GameFrame.this.currentPlayer == 'X') {
                        ImageIcon image = new ImageIcon(this.getClass().getResource("tic-tac-toe-x.png"));
                        Button.this.setIcon(image);
                    }
                }
                if (GameFrame.this.hasAwinner(GameFrame.this.currentPlayer)) {
                    GameFrame.this.currentStateLabel.setText(GameFrame.this.currentPlayer + " has won. Game over!");
                    GameFrame.this.isGameOver = true;
                } else if (GameFrame.this.isFull()) {
                    GameFrame.this.currentStateLabel.setText("Tie! Play another game!");
                    GameFrame.this.isGameOver = true;
                } else {
                    if (GameFrame.this.currentPlayer == 'X') {
                        GameFrame.this.currentPlayer = 'O';
                    } else if (GameFrame.this.currentPlayer == 'O') {
                        GameFrame.this.currentPlayer = 'X';
                    }
                    
                    GameFrame.this.currentStateLabel.setText(GameFrame.this.currentPlayer + "'s turn.");
                }
            }
        }
    }
}