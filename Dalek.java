// This subclass takes from superclass Alien and expounds on Daleks
// Written by Zack Rosales

package Aliens;

public class Dalek extends Alien
{
	// subclass attributes
	final static String RACE = "Dalek",
						ALIGNMENT = "Evil",
						ORIGIN = "Skaro",
						DETAILS = "One-eyed, tentacled mutant encapsulated in a Dalekanium housing",
						SIZE = "Medium",
						CONSISTENCY = "Solid",
						FLY = "Flying, Temporal Shift";
	
	// creates Cyborg BodyType
	static BodyType BODY = new Cyborg(DETAILS, SIZE, CONSISTENCY);
	
	// no-argument constructor
	public Dalek()
	{
		super(RACE, ALIGNMENT, ORIGIN, BODY);
	}
	
	@Override // overrides Alien toString method
	public String toString()
	{
		return super.toString() + "\nMethod of Travel: " + FLY;
	}

}
