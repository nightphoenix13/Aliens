// This subclass takes from superclass Alien and expounds on Jupitarians(Jovians)
// Written by Zack Rosales

package Aliens;

public class Jupitarian extends Alien
{
	// subclass attributes
	final static String FLY = "Flying",
						SIZE = "Colossal",
						CONSISTENCY = "Incorporeal",
						RACE = "Jovian",
						ALIGNMENT = "Neutral",
						ORIGIN = "Jupiter";
	
	// creates Aberration BodyType
	static BodyType BODY = new Aberration(SIZE, CONSISTENCY);
	
	// no-argument constructor
	public Jupitarian()
	{
		super(RACE, ALIGNMENT, ORIGIN, BODY);
	}
	
	@Override // overrides Alien toString method
	public String toString()
	{
		return super.toString() + "\nMethod of travel: " + FLY;
	}

}
