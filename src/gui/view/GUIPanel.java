package gui.view;

import javax.swing.*;
import java.awt.Color;
import java.awt.event.*;
import gui.controller.GUIController;

public class GUIPanel extends JPanel
{
		private GUIController baseController;
		private JButton firstButton;
		private JTextField firstField;
		private SpringLayout baseLayout;
	
	public GUIPanel(GUIController baseController)
	{
		this.baseController = baseController;
		
		baseLayout = new SpringLayout();
		firstButton = new JButton("CLICK HERE FOR SARCASM...");
		firstField = new JTextField("You can type words here...");
	
		setupPanel();
		setupLayout();
		setupListeners();
	}
	/**
	 * Helper method to load all GUI components into the panel.
	 */
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground(Color.CYAN);
		this.add(firstButton);
		this.add(firstField);
	}
	
	/**
	 * Helper method for arranging panel.
	 * Dumping ground for generated code/garbage panel code.
	 */
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, firstField, 10, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, firstField, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.EAST, firstField, -10, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, firstButton, 138, SpringLayout.SOUTH, firstField);
		baseLayout.putConstraint(SpringLayout.WEST, firstButton, 42, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, firstButton, -82, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, firstButton, -38, SpringLayout.EAST, this);
	}
	
	private void changeColor()
	{
		int red, green, blue;
		red = (int) (Math.random() * 256);
		green = (int) (Math.random() * 256);
		blue = (int) (Math.random() * 256);
		
		this.setBackground(new Color(red, green, blue));
	}
	
	private void setupListeners()
	{
		 firstButton.addActionListener(new ActionListener()
		 {
			 public void actionPerformed(ActionEvent click)
			 {
				 firstField.setText("Wow, that was an amazing click...");
			 }
		 });
		 

		this.addMouseListener(new MouseListener()
		{
			public void mouseClicked(MouseEvent click)
			{
				changeColor();
			}

			public void mousePressed(MouseEvent pressed)
			{
				
			}

			public void mouseReleased(MouseEvent released)
			{			
				
			}

			public void mouseEntered(MouseEvent entered)
			{
				//changeColor();
			}

			public void mouseExited(MouseEvent exited)
			{			
				//changeColor();
			}	
		});
		
		this.addMouseMotionListener(new MouseMotionListener()
		{
			public void mouseMoved(MouseEvent moved)
			{
				if (moved.isAltDown())
				{
					changeColor();
				}
				
				if ((Math.abs(moved.getX() - firstButton.getX()) < 5) &&
						(Math.abs(moved.getY() - firstButton.getY()) < 5))
				{		
					firstButton.setLocation((int) (Math.random() * 400), (int) (Math.random() * 400));
				}
			}
			
			public void mouseDragged(MouseEvent dragged)
			{
				changeColor();
			}
		});
	}
}















