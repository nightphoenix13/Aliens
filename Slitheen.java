// This subclass takes from superclass Alien and expounds on Slitheen
// Written by Zack Rosales

package Aliens;

public class Slitheen extends Alien
{
	// subclass attributes
	final static String RACE = "Slitheen",
						ALIGNMENT = "Evil",
						ORIGIN = "Raxacoricofallapatorius",
						SIZE = "Medium",
						CONSISTENCY = "Solid";
	final static int ARMS = 2,
					 LEGS = 2,
					 FINGERS = 3,
					 EYES = 2;
	
	// creates Humanoid BodyType
	static BodyType BODY = new Humanoid(ARMS, LEGS, FINGERS, EYES, SIZE, CONSISTENCY);
	
	// no-argument constructor
	public Slitheen()
	{
		super(RACE, ALIGNMENT, ORIGIN, BODY);
	}
	
	@Override // overrides Alien toString method
	public String toString()
	{
		return super.toString();
	}

}
