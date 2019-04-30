package gg;

import java.sql.*;
import java.sql.Connection;

import java.sql.PreparedStatement;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import base_de_donne.sqlconn;
import net.proteanit.sql.DbUtils;

import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSplitPane;


public class tableA extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tableA frame = new tableA();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
Connection connection=null;
private JTable table;
private JScrollPane scrollPane;
	public tableA() {
		connection=sqlconn.dbconn();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 937, 561);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("load");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = new DefaultTableModel();
				model.addColumn("N°");
				model.addColumn("Site");
				model.addColumn("Type");
				model.addColumn("Puissance(KVA)");
				model.addColumn("Tension(Kvolts)");
				try {
					String query = "SELECT * FROM pfe.`liste postes transfo`";
					Statement st = connection.createStatement();
					ResultSet rs = st.executeQuery(query);
					while(rs.next()) {
						model.addRow(new Object[] {
							rs.getString("N°"),
							rs.getString("Site"),
							rs.getString("Type"),
							rs.getString("Puissance(KVA)"),
							rs.getString("Tension(Kvolts")
						});
					}
					rs.close();
					st.close();
					connection.close();
					table.setModel(model);
					table.setAutoResizeMode(0);
					table.getColumnModel().getColumn(0).setPreferredWidth(40);
					table.getColumnModel().getColumn(1).setPreferredWidth(40);
					table.getColumnModel().getColumn(2).setPreferredWidth(40);
					table.getColumnModel().getColumn(3).setPreferredWidth(40);
					table.getColumnModel().getColumn(4).setPreferredWidth(40);

					} catch (Exception e1) {
					System.out.print("error: "+e1);
				}
			}
		});
		btnNewButton.setBounds(376, 13, 97, 25);
		contentPane.add(btnNewButton);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(204, 137, 526, 241);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
	}
}
