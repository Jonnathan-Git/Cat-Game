package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class GUIPlayers extends JFrame {

	private JPanel contentPane;
	private JPanel pnlPlayer1;
	private JPanel pnlPlayer2;
	private JLabel lblNewLabel;
	private JLabel lblPlayer;
	private JTextField txtNamePlayer1;
	private JTextField txtNamePlayer2;
	private JComboBox<String> cbxSimbolsP1;
	private JComboBox<String> cbxSimbolsP2;
	private JButton btnRegisterP1;
	private JButton btnRegisterP2;
	private JLabel lblNivel;
	private JComboBox<String> cbxLevels;

	public GUIPlayers() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 428);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getPnlPlayer1());
		contentPane.add(getPnlPlayer2());
		contentPane.add(getLblNewLabel());
		contentPane.add(getLblPlayer());
		contentPane.add(getBtnRegisterP1());
		contentPane.add(getBtnRegisterP2());
		contentPane.add(getLblNivel());
		contentPane.add(getCbxLevels());
		
		
		setVisible(true);
	}

	public JPanel getPnlPlayer1() {
		if (pnlPlayer1 == null) {
			pnlPlayer1 = new JPanel();
			pnlPlayer1.setBounds(35, 92, 395, 216);
			pnlPlayer1.setLayout(null);
			pnlPlayer1.add(getTxtNamePlayer1());
			pnlPlayer1.add(getCbxSimbolsP1());
		}
		return pnlPlayer1;
	}
	public JPanel getPnlPlayer2() {
		if (pnlPlayer2 == null) {
			pnlPlayer2 = new JPanel();
			pnlPlayer2.setBounds(459, 92, 395, 216);
			pnlPlayer2.setLayout(null);
			pnlPlayer2.add(getTxtNamePlayer2());
			pnlPlayer2.add(getCbxSimbolsP2());
		}
		return pnlPlayer2;
	}
	public JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Player 1");
			lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 30));
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setBounds(35, 11, 395, 70);
		}
		return lblNewLabel;
	}
	public JLabel getLblPlayer() {
		if (lblPlayer == null) {
			lblPlayer = new JLabel("Player 2");
			lblPlayer.setHorizontalAlignment(SwingConstants.CENTER);
			lblPlayer.setFont(new Font("Times New Roman", Font.PLAIN, 30));
			lblPlayer.setBounds(459, 11, 395, 70);
		}
		return lblPlayer;
	}
	public JTextField getTxtNamePlayer1() {
		if (txtNamePlayer1 == null) {
			txtNamePlayer1 = new JTextField();
			txtNamePlayer1.setHorizontalAlignment(SwingConstants.CENTER);
			txtNamePlayer1.setFont(new Font("Tahoma", Font.PLAIN, 30));
			txtNamePlayer1.setText("\r\n");
			txtNamePlayer1.setBounds(27, 44, 341, 61);
			txtNamePlayer1.setColumns(10);
		}
		return txtNamePlayer1;
	}
	public JTextField getTxtNamePlayer2() {
		if (txtNamePlayer2 == null) {
			txtNamePlayer2 = new JTextField();
			txtNamePlayer2.setFont(new Font("Tahoma", Font.PLAIN, 30));
			txtNamePlayer2.setHorizontalAlignment(SwingConstants.CENTER);
			txtNamePlayer2.setColumns(10);
			txtNamePlayer2.setBounds(29, 40, 341, 61);
		}
		return txtNamePlayer2;
	}
	public JComboBox<String> getCbxSimbolsP1() {
		if (cbxSimbolsP1 == null) {
			cbxSimbolsP1 = new JComboBox<>();
			cbxSimbolsP1.setFont(new Font("Tahoma", Font.PLAIN, 30));
			cbxSimbolsP1.addItem("X");
			cbxSimbolsP1.addItem("O");
			cbxSimbolsP1.addItem(":(");
			cbxSimbolsP1.addItem(":)");
			cbxSimbolsP1.addItem(":-P");
			cbxSimbolsP1.addItem("@");
			cbxSimbolsP1.setBounds(61, 115, 264, 52);
		}
		return cbxSimbolsP1;
	}
	public JComboBox<String> getCbxSimbolsP2() {
		if (cbxSimbolsP2 == null) {
			cbxSimbolsP2 = new JComboBox<>();
			cbxSimbolsP2.addItem("X");
			cbxSimbolsP2.addItem("O");
			cbxSimbolsP2.addItem(":(");
			cbxSimbolsP2.addItem(":)");
			cbxSimbolsP2.addItem(":-P");
			cbxSimbolsP2.addItem("@");
			cbxSimbolsP2.setFont(new Font("Tahoma", Font.PLAIN, 30));
			cbxSimbolsP2.setBounds(62, 117, 264, 52);
		}
		return cbxSimbolsP2;
	}
	public JButton getBtnRegisterP1() {
		if (btnRegisterP1 == null) {
			btnRegisterP1 = new JButton("Registrar");
			btnRegisterP1.setFont(new Font("Tahoma", Font.PLAIN, 20));
			btnRegisterP1.setBounds(158, 334, 142, 45);
		}
		return btnRegisterP1;
	}
	public JButton getBtnRegisterP2() {
		if (btnRegisterP2 == null) {
			btnRegisterP2 = new JButton("Registrar");
			btnRegisterP2.setFont(new Font("Tahoma", Font.PLAIN, 20));
			btnRegisterP2.setBounds(588, 334, 142, 45);
		}
		return btnRegisterP2;
	}
	public JLabel getLblNivel() {
		if (lblNivel == null) {
			lblNivel = new JLabel("Nivel");
			lblNivel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNivel.setFont(new Font("Times New Roman", Font.PLAIN, 20));
			lblNivel.setBounds(247, 0, 395, 31);
		}
		return lblNivel;
	}
	public JComboBox<String> getCbxLevels() {
		if (cbxLevels == null) {
			cbxLevels = new JComboBox<>();
			cbxLevels.setFont(new Font("Tahoma", Font.PLAIN, 15));
			cbxLevels.addItem("Nivel 1");
			cbxLevels.addItem("Nivel 2");
			cbxLevels.addItem("Nivel 3");
			cbxLevels.setBounds(372, 41, 154, 22);
		}
		return cbxLevels;
	}
}
