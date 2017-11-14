package Julien;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JProgressBar;

public class Admin extends JFrame {

	private JPanel contentPane;
	private JTable tableParticipant;
	private DefaultTableModel model;
	private JTable getTable() {
		 {
		        model = new DefaultTableModel();
		        model.setColumnIdentifiers(entetes);
		        table = new JTable(model);
		    } 
		return null;
	}
	//uzhdyuhd
	private void remplir() throws IOException
	{
	    Scanner sc = new Scanner(new File("sauve_login.txt"));
		
	    while (sc.hasNextLine())
	        model.addRow(sc.nextLine().split(";"));
		
	    sc.close();
	}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin frame = new Admin();
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
	public Admin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelAdm = new JPanel();
		panelAdm.setBounds(0, 0, 784, 462);
		contentPane.add(panelAdm);
		panelAdm.setLayout(null);
		
		
		JButton btnAjout = new JButton("Ajouter");
		btnAjout.setBounds(22, 247, 89, 23);
		panelAdm.add(btnAjout);
		
		JButton btnModif = new JButton("Modifier");
		btnModif.setBounds(121, 247, 89, 23);
		panelAdm.add(btnModif);
		
		JButton btnSupr = new JButton("Supprimer");
		btnSupr.setBounds(220, 247, 89, 23);
		panelAdm.add(btnSupr);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(767, 0, 17, 462);
		scrollBar.setMaximum(767);
		panelAdm.add(scrollBar);
		
		tableParticipant = new JTable();
		tableParticipant.setBounds(22, 54, 283, 182);
		panelAdm.add(tableParticipant);

		

		

	}
}
