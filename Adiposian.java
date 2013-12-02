// This subclass takes from superclass Alien and expounds on Adiposians
// Written by Zack Rosales

package Aliens;

public class Adiposian extends Alien
{
	// subclass attributes
	final static String ORIGIN = "Adipose 3",
						RACE = "Adiposian",
						ALIGNMENT = "Neutral",
						SIZE = "Diminutive",
						CONSISTENCY = "Fatty Tissue";
	final static int ARMS = 2,
					 LEGS = 2,
					 FINGERS = 5,
					 EYES = 2;
	
	// creates Humanoid BodyType
	static BodyType BODY = new Humanoid(ARMS, LEGS, FINGERS, EYES, SIZE, CONSISTENCY);
	
	// no-argument constructor
	public Adiposian()
	{
		super(RACE, ALIGNMENT, ORIGIN, BODY);
	}
	
	@Override // overrides Alien toString method
	public String toString()
	{
		return super.toString();
	}

}
