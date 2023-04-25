package logic;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;

import domain.Player;
import gui.GUIGame;
import gui.GUIWinner;

public class GameController implements ActionListener {

	private GUIGame game;
	private JButton[][] matrix;
	private Logic log;
	public static ArrayList<Player> players = new ArrayList<>();
	private Player playerInTurns;
	private GUIWinner winner;
	public static int i=0;
	public static int j=0;
	public static int font=0;
	
	public GameController() {
		game = new GUIGame();
		game.getPnlBoard().setLayout(new GridLayout(i, j, 5, 5));
		matrix = new JButton[i][j];
		log = new Logic();
		initializer();
	}

	private void initializer() {

		game.getMnitmExit().addActionListener(this);
		game.getMnitmNewGame().addActionListener(this);
		game.getMnitmRestart().addActionListener(this);

		log.createButtonMatrix(game, matrix,font);
		actionButtonMatrix();
		log.selectPlayer(players);

		playerInTurns = log.selectTurns(players);
		game.getLblPlayersTurns().setText(playerInTurns.getName() + " simbolo: " + playerInTurns.getSimbol());

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		playerInTurns = log.selectTurns(players);
		game.getLblPlayersTurns().setText(playerInTurns.getName() + " simbolo: " + playerInTurns.getSimbol());

		if (e.getSource() == game.getMnitmNewGame()) {
			players.clear();
			game.setVisible(false);
			game.dispose();
			
			new RegisterController();
			
		}
		
		
		if (e.getSource() == game.getMnitmRestart()) {
			restart();
		}
		
		if (e.getSource() == game.getMnitmExit()) {
			game.setVisible(false);
			game.dispose();
		}

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (e.getSource() == matrix[i][j]) {

					playerInTurns = log.selectTurns(players);
					matrix[i][j].setText(playerInTurns.getSimbol());
					matrix[i][j].setEnabled(false);

					log.tieGame(matrix);
					
					if (log.verifyWinRow(matrix, playerInTurns.getSimbol(), j)) {
						win();
					} else if (log.verifyWinColumn(matrix, playerInTurns.getSimbol(), i)) {
						win();
					} else if (log.verifyRigthDiagonal(matrix, playerInTurns.getSimbol())) {
						win();
					}
					if (log.verifyLeftDiagonal(matrix, playerInTurns.getSimbol())) {
						win();
					}

					playerInTurns = log.selectTurns(players);
					game.getLblPlayersTurns()
							.setText(playerInTurns.getName() + " simbolo: " + playerInTurns.getSimbol());

				}
			}
		}

	}

	public void restart() {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				matrix[i][j].setText("");
				matrix[i][j].setEnabled(true);
			}
		}
	}

	public void win() {
		winner = new GUIWinner();
		winner.getWinner().setText(playerInTurns.getName() + " tú eres el ganador!!");
	}

	public void actionButtonMatrix() {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				matrix[i][j].addActionListener(this);
			}
		}
	}

}
