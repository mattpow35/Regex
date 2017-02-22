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
	
	public String isValidFirstName(String input)
	{
		String response = "";
		
		return response;
	}
	
	public String isValidLastName(String input)
	{
		String response = "";
		
		return response;
	}
	
	public String isValidPhoneNumber(String input)
	{
		String response = "";
		
		return response;
	}
	
	public String isValidEmail(String input)
	{
		String response = "";
		
		return response;
	}

}
