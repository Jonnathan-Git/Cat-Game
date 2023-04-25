package logic;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import domain.Player;
import gui.GUIPlayers;

public class RegisterController implements ActionListener {

	private GUIPlayers player;
	private int num = 0;

	public RegisterController() {
		player = new GUIPlayers();

		initializer();
	}

	private void initializer() {

		player.getBtnRegisterP1().addActionListener(this);
		player.getBtnRegisterP2().addActionListener(this);
		player.getCbxSimbolsP1().addActionListener(this);
		player.getCbxSimbolsP2().addActionListener(this);

		player.getBtnRegisterP1().setEnabled(false);
		player.getBtnRegisterP2().setEnabled(false);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == player.getCbxSimbolsP1()) {

			if (player.getCbxSimbolsP1().getSelectedItem().toString()
					.equals(player.getCbxSimbolsP2().getSelectedItem().toString())) {
				player.getBtnRegisterP1().setEnabled(false);
				player.getBtnRegisterP2().setEnabled(false);
			} else {
				player.getBtnRegisterP1().setEnabled(true);
				player.getBtnRegisterP2().setEnabled(true);
			}

		}

		if (e.getSource() == player.getCbxSimbolsP2()) {

			if (player.getCbxSimbolsP2().getSelectedItem().toString()
					.equals(player.getCbxSimbolsP1().getSelectedItem().toString())) {
				player.getBtnRegisterP1().setEnabled(false);
				player.getBtnRegisterP2().setEnabled(false);
			} else {
				player.getBtnRegisterP1().setEnabled(true);
				player.getBtnRegisterP2().setEnabled(true);
			}

		}

		if (e.getSource() == player.getBtnRegisterP1()) {

			Player p1 = new Player(player.getTxtNamePlayer1().getText(), false,
					player.getCbxSimbolsP1().getSelectedItem().toString(), false);

			GameController.players.add(p1);

			num++;

			if (num == 2) {

				player.setVisible(false);
				player.dispose();
				selectLevel();
				new GameController();
			}

		}

		if (e.getSource() == player.getBtnRegisterP2()) {
			Player p2 = new Player(player.getTxtNamePlayer2().getText(), false,
					player.getCbxSimbolsP2().getSelectedItem().toString(), false);
			GameController.players.add(p2);

			num++;

			if (num == 2) {

				player.setVisible(false);
				player.dispose();
				selectLevel();
				new GameController();
			}

		}

	}

	public void selectLevel() {
		
		if(player.getCbxLevels().getSelectedItem().toString().equals("Nivel 1")) {
			GameController.i = 3;
			GameController.j= 3;
			GameController.font = 60;
		}else if(player.getCbxLevels().getSelectedItem().toString().equals("Nivel 2")) {
			GameController.i = 5;
			GameController.j= 5;
			GameController.font = 40;
		} else if(player.getCbxLevels().getSelectedItem().toString().equals("Nivel 3")) {
			GameController.i = 10;
			GameController.j= 10;
			GameController.font = 20;
		}
		
	}
	
}
