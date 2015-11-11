package gui.view;

import javax.swing.JFrame;
import gui.controller.GUIController;

public class GUIFrame extends JFrame
{
	private GUIController basicController;
	private GUIPanel basePanel;
	
	public GUIFrame(GUIController baseController)
	{
		this.basicController = baseController;
		basePanel = new GUIPanel(baseController);
		setupFrame();
	}
	
	/**
	 * Required helper method to prepare frame.
	 */
	
	private void setupFrame()
	{
		this.setContentPane(basePanel); 	 //Must be first line of setupFrame - Installs the panel in the frame.
		this.setSize(400,400);				 //Find a good size for the application window.
		this.setTitle("This Stupid App..."); //Advisable, but not required.
		this.setResizable(false); 			 //Advisable, but not required.
		this.setVisible(true); 				 //Must be last line of setupFrame.
	}
	
	public GUIController getBaseController()
	{
		return basicController;
	}
} 
