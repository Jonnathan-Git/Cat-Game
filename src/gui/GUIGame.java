package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.GridLayout;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JLabel;
import java.awt.Font;

public class GUIGame extends JFrame {

	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu miMenu;
	private JMenuItem mnitmRestart;
	private JMenuItem mnitmNewGame;
	private JMenuItem mnitmExit;
	private JPanel pnlBoard;
	private JLabel lblNewLabel;
	private JLabel lblPlayersTurns;
	private JMenuItem menuItem;

	public GUIGame() {
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 798, 700);
		setJMenuBar(getMenuBar_1());
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getPnlBoard());
		contentPane.add(getLblNewLabel());
		contentPane.add(getLblPlayersTurns());
		
		this.setLocationRelativeTo(null);
		setVisible(true);
		
	}
	public JMenuBar getMenuBar_1() {
		if (menuBar == null) {
			menuBar = new JMenuBar();
			menuBar.add(getMiMenu());
		}
		return menuBar;
	}
	public JMenu getMiMenu() {
		if (miMenu == null) {
			miMenu = new JMenu("Menu");
			miMenu.add(getMnitmRestart());
			miMenu.add(getMnitmNewGame());
			miMenu.add(getMenuItem());
			miMenu.add(getMnitmExit());
		}
		return miMenu;
	}
	
	public JMenuItem getMnitmRestart() {
		if (mnitmRestart == null) {
			mnitmRestart = new JMenuItem("Reiniciar");
		}
		return mnitmRestart;
	}
	public JMenuItem getMnitmNewGame() {
		if (mnitmNewGame == null) {
			mnitmNewGame = new JMenuItem("Nueva Partida");
		}
		return mnitmNewGame;
	}
	public JMenuItem getMnitmExit() {
		if (mnitmExit == null) {
			mnitmExit = new JMenuItem("Salir");
		}
		return mnitmExit;
	}
	public JPanel getPnlBoard() {
		if (pnlBoard == null) {
			pnlBoard = new JPanel();
			pnlBoard.setBorder(UIManager.getBorder("ToolBar.border"));
			pnlBoard.setBackground(Color.BLACK);
			pnlBoard.setBounds(57, 83, 672, 540);
			pnlBoard.setLayout(new GridLayout(1, 1, 5, 5));
		}
		return pnlBoard;
	}
	public JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("El turno es de: ");
			lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 20));
			lblNewLabel.setBounds(61, 31, 148, 41);
		}
		return lblNewLabel;
	}
	public JLabel getLblPlayersTurns() {
		if (lblPlayersTurns == null) {
			lblPlayersTurns = new JLabel("");
			lblPlayersTurns.setFont(new Font("Times New Roman", Font.PLAIN, 20));
			lblPlayersTurns.setBounds(179, 31, 550, 41);
		}
		return lblPlayersTurns;
	}
	public JMenuItem getMenuItem() {
		if (menuItem == null) {
			menuItem = new JMenuItem("New menu item");
		}
		return menuItem;
	}
}
