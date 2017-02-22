package regex.view;

import javax.swing.*;
import regex.controller.RegexController;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.*;


public class RegexPanel extends JPanel
{
	private RegexController baseController;
	private SpringLayout baseLayout;
	
	private JTextField firstName;
	private JTextField lastName;
	private JTextField phoneNumber;
	private JTextField email;
	
	private JLabel firstNameLabel;
	private JLabel lastNameLabel;
	private JLabel phoneNumberLabel;
	private JLabel emailLabel;
	private JLabel validFirst;
	private JLabel validLast;
	private JLabel validNumber;
	private JLabel validEmail;
	
	private JButton submitButton;
	
	public RegexPanel(RegexController baseController)
	{
		super();
		this.baseController = baseController;
		this.baseLayout = new SpringLayout();
		
		this.firstName = new JTextField(10);
		this.lastName = new JTextField(10);
		this.phoneNumber = new JTextField(10);
		this.email = new JTextField(10);
		
		this.firstNameLabel = new JLabel("First Name:");
		this.lastNameLabel = new JLabel("Last Name:");
		this.phoneNumberLabel = new JLabel("Phone Number:");
		this.emailLabel = new JLabel("Email:");
		this.validFirst = new JLabel("");
		this.validLast = new JLabel("");
		this.validNumber = new JLabel("");
		this.validEmail = new JLabel("");
		
		
		this.submitButton = new JButton("SUBMIT");
		
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setPreferredSize(new Dimension(750,500));
		firstName.setEditable(true);
		lastName.setEditable(true);
		phoneNumber.setEditable(true);
		email.setEditable(true);
		this.add(firstName);
		this.add(lastName);
		this.add(phoneNumber);
		this.add(email);
		this.add(firstNameLabel);
		this.add(lastNameLabel);
		this.add(phoneNumberLabel);
		this.add(emailLabel);
		this.add(submitButton);
		this.add(validFirst);
		this.add(validLast);
		this.add(validNumber);
		this.add(validEmail);
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, lastName, 14, SpringLayout.SOUTH, firstName);
		baseLayout.putConstraint(SpringLayout.EAST, lastName, 0, SpringLayout.EAST, firstName);
		baseLayout.putConstraint(SpringLayout.WEST, phoneNumber, 0, SpringLayout.WEST, firstName);
		baseLayout.putConstraint(SpringLayout.EAST, email, 0, SpringLayout.EAST, firstName);
		baseLayout.putConstraint(SpringLayout.NORTH, phoneNumber, -5, SpringLayout.NORTH, phoneNumberLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, phoneNumberLabel, 25, SpringLayout.SOUTH, lastNameLabel);
		baseLayout.putConstraint(SpringLayout.WEST, phoneNumberLabel, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, email, -5, SpringLayout.NORTH, emailLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, emailLabel, 29, SpringLayout.SOUTH, phoneNumberLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, submitButton, 37, SpringLayout.SOUTH, emailLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, firstName, 5, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, firstName, 53, SpringLayout.EAST, firstNameLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, firstNameLabel, 5, SpringLayout.NORTH, firstName);
		baseLayout.putConstraint(SpringLayout.NORTH, lastNameLabel, 24, SpringLayout.SOUTH, firstNameLabel);
		baseLayout.putConstraint(SpringLayout.WEST, lastNameLabel, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.WEST, firstNameLabel, 0, SpringLayout.WEST, lastNameLabel);
		baseLayout.putConstraint(SpringLayout.WEST, emailLabel, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, validFirst, 5, SpringLayout.NORTH, firstName);
		baseLayout.putConstraint(SpringLayout.WEST, validFirst, 6, SpringLayout.EAST, firstName);
		baseLayout.putConstraint(SpringLayout.NORTH, validLast, 5, SpringLayout.NORTH, lastName);
		baseLayout.putConstraint(SpringLayout.WEST, validLast, 6, SpringLayout.EAST, lastName);
		baseLayout.putConstraint(SpringLayout.EAST, validLast, -222, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, validNumber, 5, SpringLayout.NORTH, phoneNumber);
		baseLayout.putConstraint(SpringLayout.WEST, validNumber, 6, SpringLayout.EAST, phoneNumber);
		baseLayout.putConstraint(SpringLayout.NORTH, validEmail, 5, SpringLayout.NORTH, email);
		baseLayout.putConstraint(SpringLayout.WEST, validEmail, 6, SpringLayout.EAST, email);
		baseLayout.putConstraint(SpringLayout.NORTH, validEmail, 5, SpringLayout.NORTH, email);
		baseLayout.putConstraint(SpringLayout.WEST, validEmail, 6, SpringLayout.EAST, email);
		baseLayout.putConstraint(SpringLayout.WEST, submitButton, 10, SpringLayout.WEST, this);
	}
	
	private void setupListeners()
	{
		submitButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				validFirst.setText(baseController.isValidFirstName(firstName.getText()));
				validLast.setText(baseController.isValidLastName(lastName.getText()));
				validNumber.setText(baseController.isValidPhoneNumber(phoneNumber.getText()));
				validEmail.setText(baseController.isValidEmail(email.getText()));
			}
			
		});
	}

}
