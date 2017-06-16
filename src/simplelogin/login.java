package simplelogin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;

public class login {

	private JFrame frame;
	private JTextField textUsername;
	private JPasswordField textPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login window = new login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(200, 200, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lbTitle = new JLabel("Login");
		lbTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lbTitle.setBounds(198, 11, 46, 14);
		frame.getContentPane().add(lbTitle);
		
		JLabel lbUsername = new JLabel("Username:");
		lbUsername.setBounds(22, 68, 65, 14);
		frame.getContentPane().add(lbUsername);
		
		JLabel lbPassword = new JLabel("Password:");
		lbPassword.setBounds(22, 142, 65, 14);
		frame.getContentPane().add(lbPassword);
		
		textUsername = new JTextField();
		textUsername.setBounds(180, 65, 86, 20);
		frame.getContentPane().add(textUsername);
		textUsername.setColumns(10);
		
		textPassword = new JPasswordField();
		textPassword.setBounds(181, 139, 85, 20);
		frame.getContentPane().add(textPassword);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String username;
				String password;
				username = textUsername.getText();
				password = textPassword.getText();
				
				switch(username){
				case "Jason":
					if(password.equals("password")){
						textUsername.setText(null);
						textPassword.setText(null);
						JOptionPane.showMessageDialog(null, "Login Granted");
					}
					else{
						JOptionPane.showMessageDialog(null, "Login Failed");
					}
					break;
				case "two":
					if(password.equals("hi")){
						textUsername.setText(null);
						textPassword.setText(null);
						JOptionPane.showMessageDialog(null, "Login Granted");
					}
					else{
						JOptionPane.showMessageDialog(null, "Login Failed");
					}
					break;
				default:
					JOptionPane.showMessageDialog(null, "Login Failed");
					break;
				}
			}
		});
		btnLogin.setBounds(22, 204, 89, 23);
		frame.getContentPane().add(btnLogin);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textUsername.setText(null);
				textPassword.setText(null);
			}
		});
		btnReset.setBounds(155, 204, 89, 23);
		frame.getContentPane().add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
			}
		});
		btnExit.setBounds(277, 204, 89, 23);
		frame.getContentPane().add(btnExit);
	}
}
