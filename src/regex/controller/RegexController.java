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
	
	public boolean isValidFirstName(String input)
	{
		boolean valid = false;
		
		return valid;
	}
	
	public boolean isValidLastName(String input)
	{
		boolean valid = false;
		
		return valid;
	}
	
	public boolean isValidPhoneNumber(String input)
	{
		boolean valid = false;
		
		return valid;
	}
	
	public boolean isValidEmail(String input)
	{
		boolean valid = false;
		
		return valid;
	}

}
