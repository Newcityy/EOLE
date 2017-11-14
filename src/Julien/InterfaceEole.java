package Julien;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class InterfaceEole extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfaceEole frame = new InterfaceEole();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public InterfaceEole() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 434, 262);
		contentPane.add(panel);
		JButton btnCli = new JButton("Utilisateur");
		btnCli.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Test Client");
				// public void setstart() {
				//	 setstart =
				// }
			}
		});
		panel.setLayout(null);
		btnCli.setBounds(143, 5, 81, 23);
		panel.add(btnCli);
		
		JButton btnAdm = new JButton("Admin");
		btnAdm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Test Admin");
			}
		});
		btnAdm.setBounds(229, 5, 61, 23);
		panel.add(btnAdm);
		
		JLabel lblBienvenue = new JLabel("Bienvenue sur l'interface d'Eole, veuillez cliquer sur l'un des deux boutons.");
		lblBienvenue.setBounds(39, 33, 355, 14);
		panel.add(lblBienvenue);
		
		JLabel lblImage = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/LogoEole.png")).getImage();
		lblImage.setIcon (new ImageIcon(img));
		lblImage.setBounds(90, 52, 254, 132);
		panel.add(lblImage);
		
	}
}