// This subclass takes from superclass Alien and expounds on Catkind
// Written by Zack Rosales

package Aliens;

public class Catkind extends Alien
{
	// subclass attributes
	final static String SUBTYPE = "Cat",
						SIZE = "Medium",
						RACE = "Catkind",
						ALIGNMENT = "Good",
						ORIGIN = "New Savannah",
						CONSISTENCY = "Solid";
	final static int ARMS = 2,
					 LEGS = 2,
					 FINGERS = 5,
					 EYES = 2;
	
	// creates Humanoid BodyType
	static BodyType BODY = new Humanoid(ARMS, LEGS, FINGERS, EYES, SIZE, CONSISTENCY);
		
	// no-argument constructor
	public Catkind()
	{
		super(RACE, ALIGNMENT, ORIGIN, BODY);
	}
		
	@Override // overrides Alien toString method
	public String toString()
	{
		return super.toString() + "\nSubtype: " + SUBTYPE;
	}

}
