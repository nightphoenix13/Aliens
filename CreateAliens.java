// This program creates various aliens and shows their attributes.
// written by Zack Rosales

package Aliens;

import javax.swing.JOptionPane;

public class CreateAliens 
{

	public static void main(String[] args)
	{
		// creating array of class Alien
		Alien[] aliens = new Alien[9];
		
		// creating new Aliens
		aliens[0] = new Martian();
		aliens[1] = new Jupitarian();
		aliens[2] = new Abzorbalovian();
		aliens[3] = new Adiposian();
		aliens[4] = new Carrionite();
		aliens[5] = new Catkind();
		aliens[6] = new Cybermen();
		aliens[7] = new Dalek();
		aliens[8] = new Slitheen();
		
		for (int x = 0; x < aliens.length; x++)
		{
			JOptionPane.showMessageDialog(null, aliens[x], aliens[x].getRace() + " Information",
					JOptionPane.INFORMATION_MESSAGE);
		}

	}

}
