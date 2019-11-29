package doctor;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;

public class Doctor extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Doctor frame = new Doctor();
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
	public Doctor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1450, 800);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(176, 224, 230));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel doctorRefNum = new JLabel("Doctor's Ref Num:");
		doctorRefNum.setFont(new Font("Arial", Font.BOLD, 18));
		doctorRefNum.setBounds(44, 36, 265, 53);
		contentPane.add(doctorRefNum);
		
		textField = new JTextField();
		textField.setBounds(227, 41, 356, 44);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblDoctorsNhsNum = new JLabel("Doctors NHS Num");
		lblDoctorsNhsNum.setFont(new Font("Arial", Font.BOLD, 18));
		lblDoctorsNhsNum.setBounds(44, 118, 265, 53);
		contentPane.add(lblDoctorsNhsNum);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(227, 123, 356, 44);
		contentPane.add(textField_1);
		
		JLabel lblFirstname = new JLabel("Firstname:");
		lblFirstname.setFont(new Font("Arial", Font.BOLD, 18));
		lblFirstname.setBounds(44, 208, 265, 53);
		contentPane.add(lblFirstname);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(227, 213, 356, 44);
		contentPane.add(textField_2);
		
		JLabel lblSurname = new JLabel("Surname:");
		lblSurname.setFont(new Font("Arial", Font.BOLD, 18));
		lblSurname.setBounds(44, 297, 265, 53);
		contentPane.add(lblSurname);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(227, 302, 356, 44);
		contentPane.add(textField_3);
		
		JLabel lblAdress = new JLabel("Address:");
		lblAdress.setFont(new Font("Arial", Font.BOLD, 18));
		lblAdress.setBounds(44, 382, 265, 53);
		contentPane.add(lblAdress);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(227, 387, 356, 44);
		contentPane.add(textField_4);
		
		JLabel lblPostCode = new JLabel("Post Code:");
		lblPostCode.setFont(new Font("Arial", Font.BOLD, 18));
		lblPostCode.setBounds(44, 471, 265, 53);
		contentPane.add(lblPostCode);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(227, 476, 356, 44);
		contentPane.add(textField_5);
		
		JLabel label_5 = new JLabel("Doctor's Ref Num:");
		label_5.setFont(new Font("Arial", Font.BOLD, 18));
		label_5.setBounds(44, 579, 265, 53);
		contentPane.add(label_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(227, 584, 356, 44);
		contentPane.add(textField_6);
		
		JLabel lblMedicalCentre = new JLabel("Medical Centre:");
		lblMedicalCentre.setFont(new Font("Arial", Font.BOLD, 18));
		lblMedicalCentre.setBounds(688, 36, 265, 53);
		contentPane.add(lblMedicalCentre);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(871, 41, 356, 44);
		contentPane.add(textField_7);
		
		JLabel lblOffficePhone = new JLabel("Office Phone 1:");
		lblOffficePhone.setFont(new Font("Arial", Font.BOLD, 18));
		lblOffficePhone.setBounds(688, 118, 265, 53);
		contentPane.add(lblOffficePhone);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(871, 123, 356, 44);
		contentPane.add(textField_8);
		
		JLabel lblOfficePhone = new JLabel("Office Phone 2:");
		lblOfficePhone.setFont(new Font("Arial", Font.BOLD, 18));
		lblOfficePhone.setBounds(688, 208, 265, 53);
		contentPane.add(lblOfficePhone);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(871, 213, 356, 44);
		contentPane.add(textField_9);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setFont(new Font("Arial", Font.BOLD, 18));
		lblEmail.setBounds(688, 297, 265, 53);
		contentPane.add(lblEmail);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(871, 302, 356, 44);
		contentPane.add(textField_10);
		
		JLabel lblSpecialty = new JLabel("Specialty:");
		lblSpecialty.setFont(new Font("Arial", Font.BOLD, 18));
		lblSpecialty.setBounds(688, 382, 265, 53);
		contentPane.add(lblSpecialty);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(871, 387, 356, 44);
		contentPane.add(textField_11);
		
		JLabel lblAppointmentRef = new JLabel("Appointment Ref:");
		lblAppointmentRef.setFont(new Font("Arial", Font.BOLD, 18));
		lblAppointmentRef.setBounds(688, 471, 265, 53);
		contentPane.add(lblAppointmentRef);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(871, 476, 356, 44);
		contentPane.add(textField_12);
		
		JLabel label_12 = new JLabel("Doctor's Ref Num:");
		label_12.setFont(new Font("Arial", Font.BOLD, 18));
		label_12.setBounds(688, 579, 265, 53);
		contentPane.add(label_12);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(871, 584, 356, 44);
		contentPane.add(textField_13);
	}
}
