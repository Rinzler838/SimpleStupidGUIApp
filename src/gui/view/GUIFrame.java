package gui.view;

import javax.swing.JFrame;
import gui.controller.GUIController;

public class GUIFrame extends JFrame
{
	private GUIController basicController;
	
	public GUIFrame(GUIController baseController)
	{
		this.basicController = baseController;
	}
	
	private void setupFrame()
	{
		this.setSize(400,400);
		this.setVisible(true);
	}
}
