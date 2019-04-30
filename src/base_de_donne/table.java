package base_de_donne;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class table extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JPanel panel;
	private JPanel panel_2;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_1;
	private JTextField textField_4;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					table frame = new table();
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
	public table() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 956, 611);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel = new JPanel();
		panel.setBackground(new Color(123, 104, 238));
		panel.setBorder(new MatteBorder(14, 14, 14, 14, (Color) new Color(75, 0, 130)));
		panel.setBounds(0, 0, 938, 564);
		contentPane.add(panel);
		panel.setLayout(null);
		
		panel_2 = new JPanel();
		panel_2.setBounds(42, 40, 848, 81);
		panel.add(panel_2);
		panel_2.setLayout(null);
		panel_2.setBorder(new MatteBorder(14, 14, 14, 14, (Color) new Color(75, 0, 130)));
		panel_2.setBackground(new Color(123, 104, 238));
		
		JLabel lblListePostesTransfo = new JLabel("Liste Postes Transfo");
		lblListePostesTransfo.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 50));
		lblListePostesTransfo.setBounds(75, 13, 675, 44);
		panel_2.add(lblListePostesTransfo);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new MatteBorder(14, 14, 14, 14, (Color) new Color(75, 0, 130)));
		panel_1.setBackground(new Color(123, 104, 238));
		panel_1.setBounds(42, 140, 282, 296);
		panel.add(panel_1);
		
		textField = new JTextField();
		textField.setBounds(122, 64, 116, 22);
		panel_1.add(textField);
		textField.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(122, 134, 116, 22);
		panel_1.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(122, 174, 116, 22);
		panel_1.add(textField_3);
		
		JLabel lblN = new JLabel("Site");
		lblN.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblN.setBounds(40, 65, 56, 16);
		panel_1.add(lblN);
		
		JLabel lblType = new JLabel("Type");
		lblType.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblType.setBounds(40, 91, 66, 30);
		panel_1.add(lblType);
		
		JLabel lblPuissance = new JLabel("Puissance");
		lblPuissance.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblPuissance.setBounds(24, 137, 93, 19);
		panel_1.add(lblPuissance);
		
		JLabel lblTensionPrimaire = new JLabel("Tension");
		lblTensionPrimaire.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblTensionPrimaire.setBounds(24, 177, 86, 16);
		panel_1.add(lblTensionPrimaire);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select", "Classique", "Pr\u00E9fabriqu\u00E9", "A\u00E9rien"}));
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 18));
		comboBox.setBounds(122, 99, 116, 22);
		panel_1.add(comboBox);
		
		JLabel lblN_1 = new JLabel("N\u00B0");
		lblN_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblN_1.setBounds(40, 30, 56, 16);
		panel_1.add(lblN_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(122, 29, 116, 22);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Search");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(24, 225, 72, 16);
		panel_1.add(lblNewLabel);
		
		textField_4 = new JTextField();
		textField_4.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				DefaultTableModel model =(DefaultTableModel) table.getModel();
				String search=  textField_4.getText();
				TableRowSorter<DefaultTableModel> tr= new TableRowSorter<DefaultTableModel>(model);
				table.setRowSorter(tr);
				tr.setRowFilter(RowFilter.regexFilter(search));
				
			} 
		});
		textField_4.setBounds(122, 224, 116, 22);
		panel_1.add(textField_4);
		textField_4.setColumns(10);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBorder(new MatteBorder(14, 14, 14, 14, (Color) new Color(75, 0, 130)));
		panel_4.setBackground(new Color(123, 104, 238));
		panel_4.setBounds(42, 449, 848, 81);
		panel.add(panel_4);
		
		JButton btnNewButton = new JButton("add");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model =(DefaultTableModel) table.getModel();
				model.addRow(new Object[]{
						textField_1.getText(),
					textField.getText(),
					comboBox.getSelectedItem(),
					textField_2.getText(),
					textField_3.getText(),
					});
				if(table.getSelectedRow()== -1) {
					if(table.getSelectedRow()==0) {
						JOptionPane.showMessageDialog(null, "added successfully","Liste postes Transfo" , JOptionPane.OK_OPTION);
					}
				}}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(38, 26, 136, 25);
		panel_4.add(btnNewButton);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_1.setText("");
				
				textField.setText("");
				comboBox.setSelectedItem("Select");
				textField_2.setText("");
				textField_3.setText("");
				
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnReset.setBounds(186, 26, 136, 25);
		panel_4.add(btnReset);
		
		JButton btnDelete = new JButton("Print");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					table.print();
				}
				catch(java.awt.print.PrinterException e) {
					System.err.format("no printer found",e.getMessage());
				}
			}
		});
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnDelete.setBounds(336, 26, 136, 25);
		panel_4.add(btnDelete);
		
		JButton btnDelete_1 = new JButton("Delete");
		btnDelete_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model =(DefaultTableModel) table.getModel();
				if(table.getSelectedRow()==1) {
					if(table.getSelectedRow()==0) {
						JOptionPane.showMessageDialog(null, "no Data to Delete" , "Liste postes Transfo",JOptionPane.OK_OPTION);
					}else {
						JOptionPane.showMessageDialog(null, "Select a row to Delete" , "Liste postes Transfo", JOptionPane.OK_OPTION);
				
					}}else {
						model.removeRow(table.getSelectedRow());
					}
				}
		
		});
		btnDelete_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnDelete_1.setBounds(484, 26, 136, 25);
		panel_4.add(btnDelete_1);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame frame = new JFrame();
				if (JOptionPane.showConfirmDialog(frame,"confirm if you want to exit","Liste poste Transfo",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnExit.setBounds(638, 26, 136, 25);
		panel_4.add(btnExit);
		
		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBorder(new MatteBorder(14, 14, 14, 14, (Color) new Color(75, 0, 130)));
		panel_5.setBackground(new Color(123, 104, 238));
		panel_5.setBounds(353, 134, 537, 296);
		panel.add(panel_5);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 13, 513, 268);
		panel_5.add(scrollPane);
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.BOLD, 13));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"1", "Skanes", "Classique", "315", "30"},
				{"2", "Complexe Monastir", "Pr\u00E9fabriqu\u00E9", "250", "30"},
				{"3", "Ouerdanine", "A\u00E9rien", "40", "30"},
				{"4", "Sahline", "Pr\u00E9fabriqu\u00E9", "63", "30"},
				{"5", "Jemmel", "Classique", "125", "30"},
				{"6", "Bir Ettaieb", "A\u00E9rien", "40", "30"},
				{"7", "Amiret Hatem", "A\u00E9rien", "40", "30"},
				{"8", "Mzougha", "A\u00E9rien", "40", "30"},
				{"9", "Hdadra", "A\u00E9rien", "40", "30"},
				{"10", "Menzel Hayet", "A\u00E9rien", "40", "30"},
				{"11", "Moknine", "Pr\u00E9fabriqu\u00E9", "250", "30"},
				{"12", "Ksar Hellel", "A\u00E9rien", "125", "30"},
				{"13", "Teboulba", "Pr\u00E9fabriqu\u00E9", "160", "30"},
				{"14", "Ksibet El M\u00E9diouni", "A\u00E9rien", "63", "30"},
				{"15", "Menzel Fersi", "Pr\u00E9fabriqu\u00E9", "63", "30"},
			},
			new String[] {
				"N\u00B0", "Site", "Type", "Puissance(KVA)", "Tension primaire(Kvolts)"
			}
		));
		table.getColumnModel().getColumn(1).setPreferredWidth(140);
		table.getColumnModel().getColumn(2).setPreferredWidth(113);
		table.getColumnModel().getColumn(3).setPreferredWidth(109);
		table.getColumnModel().getColumn(4).setPreferredWidth(155);
		scrollPane.setViewportView(table);
	}
}
