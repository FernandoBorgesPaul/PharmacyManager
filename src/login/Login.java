package login;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.LineBorder;

import doctor.Doctor;
import pharmacy.Pharmacy;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {
	
	int attempt = 3;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtUserName;
	private JPasswordField passwordField;
	
	
	@SuppressWarnings("unused")
	private void formWindowActivaded(java.awt.event.WindowEvent evt) {
		
	
		
	}
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
	
		
		setBackground(Color.LIGHT_GRAY);
		setTitle("LOG IN");
		setForeground(Color.GRAY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 250, 1350, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton buttonDoctor = new JButton("Doctor");
		buttonDoctor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Doctor doctor = new Doctor();
				doctor.setVisible(true);
				
			}
		});
		buttonDoctor.setEnabled(false);
		buttonDoctor.setBounds(172, 147, 138, 38);
		contentPane.add(buttonDoctor);
		
		JButton buttonPharmacy = new JButton("Pharmacy");
		buttonPharmacy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {          // funcion que ejecuta el boton Pharmacy al ser presionado
				
				Pharmacy myPharmacy = new Pharmacy();             // AL presionar el boton, llama a la instacia de la clase Pharmacy que en este caso es el otro JFrame
				myPharmacy.setVisible(true);
			}
		});
		buttonPharmacy.setEnabled(false);
		buttonPharmacy.setBounds(172, 219, 138, 38);
		contentPane.add(buttonPharmacy);
		
		JButton buttonPatient = new JButton("Patient");
		buttonPatient.setEnabled(false);
		buttonPatient.setBounds(172, 286, 138, 38);
		contentPane.add(buttonPatient);
		
		JButton buttonPayment = new JButton("Payment");
		buttonPayment.setEnabled(false);
		buttonPayment.setBounds(172, 352, 138, 38);
		contentPane.add(buttonPayment);
		
		JButton buttonGPAppoint = new JButton("GPAppointment");
		buttonGPAppoint.setEnabled(false);
		buttonGPAppoint.setBounds(172, 415, 138, 38);
		contentPane.add(buttonGPAppoint);
		
		JButton buttonPharPOffi = new JButton("Pharmacy Office");
		buttonPharPOffi.setEnabled(false);
		buttonPharPOffi.setBounds(172, 480, 138, 38);
		contentPane.add(buttonPharPOffi);
		
		JButton buttonSurgery = new JButton("Surgery");
		buttonSurgery.setEnabled(false);
		buttonSurgery.setBounds(985, 146, 138, 38);
		contentPane.add(buttonSurgery);
		
		JButton buttonHospital = new JButton("Hospital");
		buttonHospital.setEnabled(false);
		buttonHospital.setBounds(985, 219, 138, 38);
		contentPane.add(buttonHospital);
		
		JButton buttonSpecialist = new JButton("Specialist");
		buttonSpecialist.setEnabled(false);
		buttonSpecialist.setBounds(985, 279, 138, 38);
		contentPane.add(buttonSpecialist);
		
		JButton buttonConsultant = new JButton("Consultant");
		buttonConsultant.setEnabled(false);
		buttonConsultant.setBounds(985, 352, 138, 38);
		contentPane.add(buttonConsultant);
		
		JButton buttonPharmacist = new JButton("Pharmacist");
		buttonPharmacist.setEnabled(false);
		buttonPharmacist.setBounds(985, 407, 138, 38);
		contentPane.add(buttonPharmacist);
		
		JButton buttonHelp = new JButton("Help");
		buttonHelp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "Introduzca un usuario y contraseña validos \npara habilitar las funciones del Sistema.");
			}
		});
		buttonHelp.setBounds(985, 480, 138, 38);
		contentPane.add(buttonHelp);

		JPanel panel = new JPanel();
		panel.setBounds(322, 146, 637, 372);
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.setBackground(Color.LIGHT_GRAY);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblUserName = new JLabel("Password:");
		lblUserName.setBounds(77, 189, 138, 28);
		lblUserName.setHorizontalAlignment(SwingConstants.LEFT);
		lblUserName.setFont(new Font("Arial", Font.BOLD, 24));
		panel.add(lblUserName);

		txtUserName = new JTextField();
		txtUserName.setBounds(227, 120, 336, 38);
		txtUserName.setFont(new Font("Arial", Font.PLAIN, 24));
		txtUserName.setColumns(10);
		panel.add(txtUserName);

		JLabel label = new JLabel("User Name: ");
		label.setHorizontalAlignment(SwingConstants.LEFT);
		label.setFont(new Font("Arial", Font.BOLD, 24));
		label.setBounds(77, 125, 138, 28);
		panel.add(label);

		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Arial", Font.PLAIN, 24));
		passwordField.setBounds(227, 187, 336, 38);
		panel.add(passwordField);
		
		//Acciones que ocurren al introducir el usuario y password correctos y apretar el boton Login

		JButton buttonLogin = new JButton("Login");
		buttonLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String userName = txtUserName.getText();
				@SuppressWarnings("deprecation")
				String password = passwordField.getText();
				
				if(userName.contains("one")&& password.contains("borpol")) {
					
					//Si usuario igual a one y pasword es borpol, los textFields de username y password vuelven a estar vacios.
					txtUserName.setText("");
					passwordField.setText("");
					//Los botones se habilitan igual:
					buttonDoctor.setEnabled(true);
					buttonPharmacy.setEnabled(true);
					buttonPatient.setEnabled(true);
					buttonPayment.setEnabled(true);
					buttonGPAppoint.setEnabled(true);
					buttonPharPOffi.setEnabled(true);
					buttonSurgery.setEnabled(true);
					buttonHospital.setEnabled(true);
					buttonSpecialist.setEnabled(true);
					buttonConsultant.setEnabled(true);
					buttonPharmacist.setEnabled(true);
					
				} else if (!(userName.contains("one")&& password.contains("borpol"))){
					
					txtUserName.setText("");
					passwordField.setText("");
					
					//Al no coincidir con los datos, los botones se mantienen desactivados.
					buttonDoctor.setEnabled(false);
					buttonPharmacy.setEnabled(false);
					buttonPatient.setEnabled(false);
					buttonPayment.setEnabled(false);
					buttonGPAppoint.setEnabled(false);
					buttonPharPOffi.setEnabled(false);
					buttonSurgery.setEnabled(false);
					buttonHospital.setEnabled(false);
					buttonSpecialist.setEnabled(false);
					buttonConsultant.setEnabled(false);
					buttonPharmacist.setEnabled(false);
					attempt -= 1;                        // El numero de intentos se reducirá si el usuario introduce información incorrecta
					
					
					JOptionPane.showMessageDialog(null, "You introduced and incorrect password.\nPlease try again.\nAttempts left: " + attempt);
					
					if (attempt == 0) {
						System.exit(0);  // Si el usuario introduce su información incorrectamente 3 veces, el sistema se cierra. 
					}
					
				}
			}
		});
		buttonLogin.setBounds(77, 259, 138, 38);
		panel.add(buttonLogin);
		

		//Boton Cancel y su acción.
		JButton buttonCancel = new JButton("Cancel");
		buttonCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { // Al apretar cancel el texto del username y password se vuelven a string vacio.
				txtUserName.setText("");
				passwordField.setText("");
			}
		});
		buttonCancel.setBounds(251, 259, 138, 38);
		panel.add(buttonCancel);

		
		//Boton Exit y su acción
		JButton buttonExit = new JButton("Exit");
		buttonExit.addActionListener(new ActionListener() {
			JFrame frame;
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame("Exit");
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Pharmacy Management System", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0); // Se sale del Sistema al confirmar con Sí. 
				};
				
			}
		});
		buttonExit.setBounds(425, 259, 138, 38);
		panel.add(buttonExit);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(172, 22, 951, 109);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		JLabel lblNewLabel = new JLabel("Pharmacy Management System");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 38));
		lblNewLabel.setBounds(133, 18, 663, 62);
		panel_1.add(lblNewLabel);
	}
}
