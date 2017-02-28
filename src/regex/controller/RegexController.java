package regex.controller;

import javax.swing.JOptionPane;
import regex.view.RegexFrame;

public class RegexController 
{
	private RegexFrame baseFrame;
	
	public RegexController()
	{
		this.baseFrame = new RegexFrame(this);
	}
	
	public void start()
	{
		JOptionPane.showMessageDialog(baseFrame, "Please enter valid info into each field.");
	}
	
	//Must be 2-30 characters
	//Cannot contain symbols.
	public boolean validateFirstName(String input)
	{
		boolean valid = false;
		
		if (input.length() >= 2 && input.length() <= 30 && input.matches(".*[A-Za-z]"))
		{
			valid = true;
		}
		
		
		return valid;
	}
	// must be between 2 and 40 characters
	// can include - , . '
	public boolean validateLastName(String input)
	{
		boolean valid = false;
		
		if(input.length() >= 2 && input.length() <= 40 && input.matches(".*[A-Za-z].*[-,.'\\w\\s]"))
		{
			valid = true;
		}
		
		return valid;
	}
	
	public boolean validatePhone(String input)
	{
		boolean valid = false;
		
		if(input.length() == 10 && input.matches(".*[0-9]"))
		{
			valid = true;
		}
		
		
		return valid;
	}
	
	public boolean validateEmail(String input)
	{
		boolean valid = false;
		if (input.matches("^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})$"))
		{
			valid = true;
		}
		
		return valid;
	}
	
	public String validationMessage(String firstName, String lastName, String phone, String email)
	{
		String response = "Checking validation...";
		if (validateFirstName(firstName) == false)
		{
			response += "\n First Name is not valid.";
		}
		else
		{
			response += "\n First name is valid.";
		}
		
		if (validateLastName(lastName) == false)
		{
			response += "\n Last Name is not valid.";
		}
		else
		{
			response += "\n Last name is valid.";
		}
		
		if (validatePhone(phone) == false)
		{
			response += "\n Phone number is not valid.";
		}
		else
		{
			response += "\n Phone number is valid.";
		}
		
		if (validateEmail(email) == false)
		{
			response += "\n Email is not valid.";
		}
		else
		{
			response += "\n Email is valid.";
		}
		
		return response;
	}

}
