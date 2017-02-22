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
		
		this.submitButton = new JButton("SUBMIT");
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setPreferredSize(new Dimension(500,500));
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
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, lastName, 14, SpringLayout.SOUTH, firstName);
		baseLayout.putConstraint(SpringLayout.EAST, lastName, 0, SpringLayout.EAST, firstName);
		baseLayout.putConstraint(SpringLayout.WEST, phoneNumber, 0, SpringLayout.WEST, firstName);
		baseLayout.putConstraint(SpringLayout.EAST, email, 0, SpringLayout.EAST, firstName);
		baseLayout.putConstraint(SpringLayout.NORTH, firstName, -5, SpringLayout.NORTH, firstNameLabel);
		baseLayout.putConstraint(SpringLayout.WEST, firstName, 53, SpringLayout.EAST, firstNameLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, firstNameLabel, 10, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, firstNameLabel, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, lastNameLabel, 24, SpringLayout.SOUTH, firstNameLabel);
		baseLayout.putConstraint(SpringLayout.WEST, lastNameLabel, 0, SpringLayout.WEST, firstNameLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, phoneNumber, -5, SpringLayout.NORTH, phoneNumberLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, phoneNumberLabel, 25, SpringLayout.SOUTH, lastNameLabel);
		baseLayout.putConstraint(SpringLayout.WEST, phoneNumberLabel, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, email, -5, SpringLayout.NORTH, emailLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, emailLabel, 29, SpringLayout.SOUTH, phoneNumberLabel);
		baseLayout.putConstraint(SpringLayout.WEST, emailLabel, 0, SpringLayout.WEST, firstNameLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, submitButton, 37, SpringLayout.SOUTH, emailLabel);
		baseLayout.putConstraint(SpringLayout.WEST, submitButton, 0, SpringLayout.WEST, firstNameLabel);
	}
	
	private void setupListeners()
	{
		
	}

}
