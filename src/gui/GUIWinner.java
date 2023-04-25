package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;

public class GUIWinner extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel winner;

	
	
	public GUIWinner() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 759, 295);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getWinner());
		contentPane.add(getLblNewLabel());
		
		setVisible(true);
	}
	public JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("hola");
			lblNewLabel.setLabelFor(lblNewLabel);
			lblNewLabel.setForeground(Color.WHITE);
			lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 43));
			lblNewLabel.setIcon(new ImageIcon("Cat Game/src/img/imag.jpg"));
			lblNewLabel.setBounds(0, 0, 745, 258);
		}
		return lblNewLabel;
	}
	public JLabel getWinner() {
		if (winner == null) {
			winner = new JLabel("");
			winner.setFont(new Font("MingLiU_HKSCS-ExtB", Font.PLAIN, 25));
			winner.setHorizontalAlignment(SwingConstants.CENTER);
			winner.setForeground(Color.WHITE);
			winner.setBounds(77, 41, 604, 170);
		}
		return winner;
	}
}
