package pharmacy;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

import doctor.Doctor;
import login.Login;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Pharmacy extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldRecerenceNum;
	private JTextField textFieldDose;
	private JTextField textFieldNumTablets;
	private JTextField textFieldLot;
	private JTextField textFieldIssueDate;
	private JTextField textFieldExpirDate;
	private JTextField textFieldDailyDose;
	private JTextField textFieldSideEffects;
	private JTextField textFieldInfo;
	private JTextField textFieldStoraAdv;
	private JTextField textFieldAdmin;
	private JTextField textFieldDrivMach;
	private JTextField textFieldHowTo;
	private JTextField textFieldPatieID;
	private JTextField textFieldDocNhsNo;
	private JTable tableInformation;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pharmacy frame = new Pharmacy();
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
	public Pharmacy() {

		setTitle("PHARMACY INVENTORY");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1350, 760);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setForeground(Color.LIGHT_GRAY);
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);

		// Contenido de los labels y textFields

		JLabel lblNameTablet = new JLabel("Name of Tablets:");
		lblNameTablet.setFont(new Font("Arial", Font.BOLD, 24));
		lblNameTablet.setBounds(36, 49, 227, 34);
		contentPane.add(lblNameTablet);

		textFieldRecerenceNum = new JTextField();
		textFieldRecerenceNum.setEditable(false);
		textFieldRecerenceNum.setFont(new Font("Arial", Font.BOLD, 24));
		textFieldRecerenceNum.setColumns(10);
		textFieldRecerenceNum.setBounds(275, 105, 312, 30);
		contentPane.add(textFieldRecerenceNum);

		JLabel lblReferenceNum = new JLabel("Reference No.");
		lblReferenceNum.setFont(new Font("Arial", Font.BOLD, 24));
		lblReferenceNum.setBounds(36, 103, 167, 34);
		contentPane.add(lblReferenceNum);

		textFieldDose = new JTextField();
		textFieldDose.setEditable(false);
		textFieldDose.setFont(new Font("Arial", Font.BOLD, 24));
		textFieldDose.setColumns(10);
		textFieldDose.setBounds(275, 160, 312, 30);
		contentPane.add(textFieldDose);

		JLabel lblDosemg = new JLabel("Dose (mg)");
		lblDosemg.setFont(new Font("Arial", Font.BOLD, 24));
		lblDosemg.setBounds(36, 158, 167, 34);
		contentPane.add(lblDosemg);

		textFieldNumTablets = new JTextField();
		textFieldNumTablets.setEditable(false);
		textFieldNumTablets.setFont(new Font("Arial", Font.BOLD, 24));
		textFieldNumTablets.setColumns(10);
		textFieldNumTablets.setBounds(275, 221, 312, 30);
		contentPane.add(textFieldNumTablets);

		JLabel lblNumTab = new JLabel("Number of Tablets");
		lblNumTab.setFont(new Font("Arial", Font.BOLD, 24));
		lblNumTab.setBounds(36, 219, 227, 34);
		contentPane.add(lblNumTab);

		textFieldLot = new JTextField();
		textFieldLot.setEditable(false);
		textFieldLot.setFont(new Font("Arial", Font.BOLD, 24));
		textFieldLot.setColumns(10);
		textFieldLot.setBounds(275, 288, 312, 30);
		contentPane.add(textFieldLot);

		JLabel lblLot = new JLabel("LOT:");
		lblLot.setFont(new Font("Arial", Font.BOLD, 24));
		lblLot.setBounds(36, 286, 167, 34);
		contentPane.add(lblLot);

		textFieldIssueDate = new JTextField();
		textFieldIssueDate.setEditable(false);
		textFieldIssueDate.setFont(new Font("Arial", Font.BOLD, 24));
		textFieldIssueDate.setColumns(10);
		textFieldIssueDate.setBounds(275, 352, 312, 30);
		contentPane.add(textFieldIssueDate);

		JLabel lblIssuedDate = new JLabel("Issued Date:");
		lblIssuedDate.setFont(new Font("Arial", Font.BOLD, 24));
		lblIssuedDate.setBounds(36, 350, 167, 34);
		contentPane.add(lblIssuedDate);

		textFieldExpirDate = new JTextField();
		textFieldExpirDate.setEditable(false);
		textFieldExpirDate.setFont(new Font("Arial", Font.BOLD, 24));
		textFieldExpirDate.setColumns(10);
		textFieldExpirDate.setBounds(275, 414, 312, 30);
		contentPane.add(textFieldExpirDate);

		JLabel lblExpDate = new JLabel("Exp Date:");
		lblExpDate.setFont(new Font("Arial", Font.BOLD, 24));
		lblExpDate.setBounds(36, 412, 167, 34);
		contentPane.add(lblExpDate);

		textFieldDailyDose = new JTextField();
		textFieldDailyDose.setEditable(false);
		textFieldDailyDose.setFont(new Font("Arial", Font.BOLD, 24));
		textFieldDailyDose.setColumns(10);
		textFieldDailyDose.setBounds(275, 478, 312, 30);
		contentPane.add(textFieldDailyDose);

		JLabel lblDailyDose = new JLabel("Daily Dose:");
		lblDailyDose.setFont(new Font("Arial", Font.BOLD, 24));
		lblDailyDose.setBounds(36, 476, 167, 34);
		contentPane.add(lblDailyDose);

		textFieldSideEffects = new JTextField();
		textFieldSideEffects.setEditable(false);
		textFieldSideEffects.setFont(new Font("Arial", Font.BOLD, 24));
		textFieldSideEffects.setColumns(10);
		textFieldSideEffects.setBounds(912, 51, 312, 30);
		contentPane.add(textFieldSideEffects);

		JLabel lblPossibleSideEffects = new JLabel("Possible Side Effects");
		lblPossibleSideEffects.setFont(new Font("Arial", Font.BOLD, 24));
		lblPossibleSideEffects.setBounds(634, 49, 266, 34);
		contentPane.add(lblPossibleSideEffects);

		textFieldInfo = new JTextField();
		textFieldInfo.setEditable(false);
		textFieldInfo.setFont(new Font("Arial", Font.BOLD, 24));
		textFieldInfo.setColumns(10);
		textFieldInfo.setBounds(912, 109, 312, 30);
		contentPane.add(textFieldInfo);

		JLabel lblFurtherInformation = new JLabel("Further Information");
		lblFurtherInformation.setFont(new Font("Arial", Font.BOLD, 24));
		lblFurtherInformation.setBounds(634, 105, 266, 34);
		contentPane.add(lblFurtherInformation);

		textFieldStoraAdv = new JTextField();
		textFieldStoraAdv.setEditable(false);
		textFieldStoraAdv.setFont(new Font("Arial", Font.BOLD, 24));
		textFieldStoraAdv.setColumns(10);
		textFieldStoraAdv.setBounds(912, 160, 312, 30);
		contentPane.add(textFieldStoraAdv);

		JLabel lblStorageAdvice = new JLabel("Storage Advice");
		lblStorageAdvice.setFont(new Font("Arial", Font.BOLD, 24));
		lblStorageAdvice.setBounds(634, 160, 266, 34);
		contentPane.add(lblStorageAdvice);

		textFieldAdmin = new JTextField();
		textFieldAdmin.setEditable(false);
		textFieldAdmin.setFont(new Font("Arial", Font.BOLD, 24));
		textFieldAdmin.setColumns(10);
		textFieldAdmin.setBounds(912, 223, 312, 30);
		contentPane.add(textFieldAdmin);

		JLabel lblAdministration = new JLabel("Administration");
		lblAdministration.setFont(new Font("Arial", Font.BOLD, 24));
		lblAdministration.setBounds(634, 221, 266, 34);
		contentPane.add(lblAdministration);

		textFieldDrivMach = new JTextField();
		textFieldDrivMach.setEditable(false);
		textFieldDrivMach.setFont(new Font("Arial", Font.BOLD, 24));
		textFieldDrivMach.setColumns(10);
		textFieldDrivMach.setBounds(912, 288, 312, 30);
		contentPane.add(textFieldDrivMach);

		JLabel lblDrivingAndMach = new JLabel("Driving and Machines");
		lblDrivingAndMach.setFont(new Font("Arial", Font.BOLD, 24));
		lblDrivingAndMach.setBounds(634, 286, 266, 34);
		contentPane.add(lblDrivingAndMach);

		textFieldHowTo = new JTextField();
		textFieldHowTo.setEditable(false);
		textFieldHowTo.setFont(new Font("Arial", Font.BOLD, 24));
		textFieldHowTo.setColumns(10);
		textFieldHowTo.setBounds(912, 354, 312, 30);
		contentPane.add(textFieldHowTo);

		JLabel lblHowToUse = new JLabel("How to Use Medication");
		lblHowToUse.setFont(new Font("Arial", Font.BOLD, 24));
		lblHowToUse.setBounds(634, 352, 266, 34);
		contentPane.add(lblHowToUse);

		textFieldPatieID = new JTextField();
		textFieldPatieID.setEditable(false);
		textFieldPatieID.setFont(new Font("Arial", Font.BOLD, 24));
		textFieldPatieID.setColumns(10);
		textFieldPatieID.setBounds(914, 414, 312, 30);
		contentPane.add(textFieldPatieID);

		JLabel lblPatientId = new JLabel("Patient ID:");
		lblPatientId.setFont(new Font("Arial", Font.BOLD, 24));
		lblPatientId.setBounds(634, 412, 167, 34);
		contentPane.add(lblPatientId);

		textFieldDocNhsNo = new JTextField();
		textFieldDocNhsNo.setEditable(false);
		textFieldDocNhsNo.setFont(new Font("Arial", Font.BOLD, 24));
		textFieldDocNhsNo.setColumns(10);
		textFieldDocNhsNo.setBounds(914, 480, 312, 30);
		contentPane.add(textFieldDocNhsNo);

		JLabel lblDoctorsNhsNo = new JLabel("Doctors NHS No:");
		lblDoctorsNhsNo.setFont(new Font("Arial", Font.BOLD, 24));
		lblDoctorsNhsNo.setBounds(634, 478, 268, 34);
		contentPane.add(lblDoctorsNhsNo);

		JComboBox nameTabletsComboBox = new JComboBox();
		nameTabletsComboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Funcion que ayuda a ejecutar lo que ocurre al seleccionar los items del
				// ComboBox
				if (nameTabletsComboBox.getSelectedItem().equals("Ibuprofeno")) {

					textFieldRecerenceNum.setText("Ibu005875");
					textFieldDose.setText("200 mg");
					textFieldNumTablets.setText("2 every 6 hours");
					textFieldLot.setText("000126548");
					textFieldIssueDate.setText("29/04/2019");
					textFieldExpirDate.setText("27/08/2020");
					textFieldDailyDose.setText("2 times a day");
					textFieldSideEffects.setText("Possible nauseas");
					textFieldInfo.setText("No prescription needed");
					textFieldStoraAdv.setText("Keep in a fresh area");
					textFieldAdmin.setText("No available");
					textFieldDrivMach.setText("No available");
					textFieldHowTo.setText("Drink with water");
					textFieldPatieID.setText("340005632");
					textFieldDocNhsNo.setText("00123");

				}
			}
		});
		nameTabletsComboBox.setModel(new DefaultComboBoxModel(new String[] { "Eliga un medicamento", "Paracetamol","Ibuprofeno", "Co-codamol", "Amidiopine", "Naproxeno" }));
		nameTabletsComboBox.setFont(new Font("Arial", Font.BOLD, 24));
		nameTabletsComboBox.setBounds(275, 49, 315, 34);
		contentPane.add(nameTabletsComboBox);

		tableInformation = new JTable(1, 15);
		tableInformation.setBackground(Color.LIGHT_GRAY);
		tableInformation.setBorder(new LineBorder(new Color(0, 0, 0)));

		tableInformation.setFont(new Font("Arial", Font.PLAIN, 12));
		tableInformation.setFillsViewportHeight(true);
		tableInformation.setRowSelectionAllowed(true);
		tableInformation.setBounds(36, 569, 1188, 142);
		tableInformation.getAutoCreateColumnsFromModel();;
		setTitle("Colums");
		contentPane.add(tableInformation);
	

		// Panel with buttons:

		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(35, 522, 1188, 50);
		contentPane.add(panel);

		JButton btnNewButton_1 = new JButton("Delete");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) tableInformation.getModel();
				
				if(tableInformation.getSelectedRow() == -1) {
					if(tableInformation.getRowCount() == 0) {
						
						JOptionPane.showMessageDialog(null, "No data to delete",
								"Pharmacy Management System", JOptionPane.OK_OPTION);
					} else {
						JOptionPane.showMessageDialog(null, "Select a row to delete ",
								"Pharmacy Management System", JOptionPane.OK_OPTION);
					} 
				} else {
					model.removeRow(tableInformation.getSelectedRow());
				}
				

			}
		});
		panel.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("Update");
		btnNewButton_2.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				DefaultTableModel model = (DefaultTableModel) tableInformation.getModel();

				if ((nameTabletsComboBox.getSelectedItem().equals("Ibuprofeno"))) {

					model.addRow(new Object[] { textFieldRecerenceNum.getText(), textFieldDose.getText(),
							textFieldNumTablets.getText(), textFieldLot.getText(), textFieldIssueDate.getText(),
							textFieldExpirDate.getText(), textFieldDailyDose.getText(), textFieldSideEffects.getText(),
							textFieldInfo.getText(), textFieldStoraAdv.getText(), textFieldAdmin.getText(),
							textFieldDrivMach.getText(), textFieldHowTo.getText(), textFieldPatieID.getText(),
							textFieldDocNhsNo.getText() });

				}
			}
		});
		panel.add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("Doctor");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Doctor doctor = new Doctor();
				doctor.setVisible(true);
			}
		});
		panel.add(btnNewButton_3);

		JButton btnNewButton_4 = new JButton("GP Appointment");
		panel.add(btnNewButton_4);

		JButton btnNewButton_5 = new JButton("Patient");
		panel.add(btnNewButton_5);

		JButton btnNewButton_6 = new JButton("Payment");
		panel.add(btnNewButton_6);

		JButton btnNewButton_7 = new JButton("Pharmacy Office");
		panel.add(btnNewButton_7);

		JButton button = new JButton("Login");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login backtoLogin = new Login();
				backtoLogin.setVisible(true);
			}
		});
		panel.add(button);

		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (JOptionPane.showConfirmDialog(null, "Confirm if you want to exit", "Pharmacy Management System",
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		panel.add(btnExit);
	}

}
