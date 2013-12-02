// This subclass takes from superclass Alien and expounds on Abzorbalovians
// Written by Zack Rosales

package Aliens;

public class Abzorbalovian extends Alien
{
	// subclass attributes
	final static String SIZE = "Medium",
						CONSISTENCY = "Solid",
						RACE = "Abzorbalovian",
						ALIGNMENT = "Evil",
						ORIGIN = "Clom";
	final static int ARMS = 2,
					 LEGS = 2,
					 FINGERS = 3,
					 EYES = 2;
	
	// creates Humanoid BodyType
	static BodyType BODY = new Humanoid(ARMS, LEGS, FINGERS, EYES, SIZE, CONSISTENCY);
	
	// no-argument constructor
	public Abzorbalovian()
	{
		super(RACE, ALIGNMENT, ORIGIN, BODY);
	}
	
	@Override // overrides Alien toString method
	public String toString()
	{
		return super.toString() + "\nAdditional faces: They absorb victims by touch. May have one or more faces of\nstill-living victims on surface of body.";
	}
}
