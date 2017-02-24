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
	public String isValidFirstName(String input)
	{
		String response = "";
		
		if (input.length() >= 2 && input.length() <= 30 && input.matches(".*[A-Za-z]"))
		{
			response = "valid name";
		}
		else
		{
			response = "First Name is invalid";
		}
		
		return response;
	}
	
	public String isValidLastName(String input)
	{
		String response = "";
		
		if(input.length() >= 2 && input.length() <= 40 && input.matches(".*[A-Za-z].*[-,.'\\w\\s]"))
		{
			response = "valid last name";
		}
		else
		{
			response = "Last name is invalid";
		}
		
		return response;
	}
	
	public String isValidPhoneNumber(String input)
	{
		String response = "Phone Number is invalid";
		
		return response;
	}
	
	public String isValidEmail(String input)
	{
		String response = "Email is invalid";
		
		return response;
	}

}
