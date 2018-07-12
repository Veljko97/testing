package testgui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JFormattedTextField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JPasswordField;
import javax.swing.LayoutStyle.ComponentPlacement;

public class LogIn extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JPasswordField passwordField;
	boolean isCorrect = false;
	/**
	 * Launch the application.
	 
	public static void main(String[] args) {
		try {
			LogIn dialog = new LogIn();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	 * Create the dialog.
	 */
	public LogIn() {
		setModal(true);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		
		JFormattedTextField frmtdtxtfldUserName = new JFormattedTextField();
		frmtdtxtfldUserName.setHorizontalAlignment(SwingConstants.CENTER);
		frmtdtxtfldUserName.setFont(new Font("Arial", Font.PLAIN, 11));
		frmtdtxtfldUserName.setText("User Name");
		
		passwordField = new JPasswordField();
		passwordField.setText("Password");
		passwordField.setToolTipText("Password");
		passwordField.setHorizontalAlignment(SwingConstants.CENTER);
		
		JButton btnLogIn = new JButton("Log in");
		btnLogIn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(frmtdtxtfldUserName.getText().equals("a")) {
					isCorrect = true;
					setVisible(false);
					dispose();
				}
			}
		});
		
		GroupLayout gl_contentPanel = new GroupLayout(contentPanel);
		gl_contentPanel.setHorizontalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addGap(131)
							.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(frmtdtxtfldUserName, GroupLayout.PREFERRED_SIZE, 154, GroupLayout.PREFERRED_SIZE)
								.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, 154, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addGap(180)
							.addComponent(btnLogIn)))
					.addContainerGap(139, Short.MAX_VALUE))
		);
		gl_contentPanel.setVerticalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addGap(53)
					.addComponent(frmtdtxtfldUserName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(29)
					.addComponent(btnLogIn)
					.addContainerGap(67, Short.MAX_VALUE))
		);
		contentPanel.setLayout(gl_contentPanel);
	}
	
	boolean returnVal() {
		setVisible(true);
		return isCorrect;
	}
}
