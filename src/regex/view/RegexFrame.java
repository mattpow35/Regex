package regex.view;

import javax.swing.JFrame;
import regex.controller.RegexController;
import java.awt.Dimension;

public class RegexFrame extends JFrame
{
	private RegexController baseController;
	private RegexPanel appPanel;
	
	public RegexFrame(RegexController baseController)
	{
		super();
		this.baseController = baseController;
		this.appPanel = new RegexPanel(baseController);
		
		setupFrame();
	}
	
	public void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setTitle("Regex");
		this.setSize(new Dimension(750, 500));
		this.setVisible(true);
		this.setResizable(false);
	}

}
