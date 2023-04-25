package logic;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import domain.Player;
import gui.GUIGame;

public class Logic {

	public void createButtonMatrix(GUIGame game, JButton[][] matrix, int font) {

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {

				matrix[i][j] = new JButton();
				matrix[i][j].setBackground(Color.white);
				matrix[i][j].setFont(new Font("Arial", Font.BOLD, font));
				matrix[i][j].setText("");
				game.getPnlBoard().add(matrix[i][j]);
			}
		}
	}
	
	public void tieGame(JButton matrix[][]) {
		int count = matrix.length*matrix.length;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				if (!matrix[i][j].getText().equals("")) {
					count--;
				}
			}
		}
		if(count == 0) {
			JOptionPane.showMessageDialog(null, "Juego empatado, Reinicia el juego");
		}
	}

	public Player selectTurns(ArrayList<Player> players) {

		Player playerTemp = null;

		if (players.get(0).isTurns()) {
			players.get(0).setTurns(false);
			players.get(1).setTurns(true);
		} else {
			players.get(1).setTurns(false);
			players.get(0).setTurns(true);
		}

		for (Player player : players) {

			if (player.isTurns()) {
				playerTemp = player;
			}

		}

		return playerTemp;
	}

	public String selectPlayer(ArrayList<Player> players) {

		String playerSimbol = "";

		Random ran = new Random();
		int x = ran.nextInt(2) + 1;

		if (x == 1) {
			players.get(0).setTurns(true);
			playerSimbol = players.get(0).getSimbol();
		} else {
			players.get(1).setTurns(true);
			playerSimbol = players.get(1).getSimbol();
		}

		return playerSimbol;
	}

	public boolean verifyRigthDiagonal(JButton[][] matrix, String value) {
		boolean flag = false;

		int x = 0;
		int y = matrix.length-1;

		int count = matrix.length;

		for (int i = 0; i < matrix.length; i++) {
			if (matrix[x][y].getText().equalsIgnoreCase(value)) {
				count--;
			}
			y--;
			x++;
		}

		if (count == 0) {
			flag = true;
		}

		return flag;
	}

	public boolean verifyLeftDiagonal(JButton[][] matrix, String value) {
		boolean flag = false;

		int x = 0;
		int y = 0;

		int count = matrix.length;

		for (int i = 0; i < matrix.length; i++) {
			if (matrix[x][y].getText().equalsIgnoreCase(value)) {
				count--;
			}
			y++;
			x++;
		}

		if (count == 0) {
			flag = true;
		}

		return flag;
	}

	public boolean verifyWinRow(JButton[][] matrix, String value, int j) {

		boolean flag = false;
		int count = matrix.length;

		for (int i = 0; i < matrix.length; i++) {
			if (matrix[i][j].getText().equalsIgnoreCase(value)) {
				count--;
			}
		}

		if (count == 0) {
			flag = true;
		}

		return flag;
	}

	public boolean verifyWinColumn(JButton[][] matrix, String value, int i) {

		boolean flag = false;
		int count = matrix.length;

		for (int j = 0; j < matrix.length; j++) {
			if (matrix[i][j].getText().equalsIgnoreCase(value)) {
				count--;
			}
		}
		if (count == 0) {
			flag = true;
		}

		return flag;
	}

}
