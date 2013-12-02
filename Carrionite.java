// This subclass takes from superclass Alien and expounds on Carrionites
// Written by Zack Rosales

package Aliens;

public class Carrionite extends Alien
{
	// subclass attributes
	final static String SIZE = "Medium",
						CONSISTENCY = "Solid",
						RACE = "Carrionite",
						ALIGNMENT = "Evil",
						ORIGIN = "Rexel 4",
						FLY = "Flying",
						DETAIL = "Shapechanger";
	final static int ARMS = 2,
					 LEGS = 2,
					 FINGERS = 5,
					 EYES = 2;
	
	// creates Humanoid BodyType
	static BodyType BODY = new Humanoid(ARMS, LEGS, FINGERS, EYES, SIZE, CONSISTENCY);
	
	// no-argument constructor
	public Carrionite()
	{
		super(RACE, ALIGNMENT, ORIGIN, BODY);
	}
	
	@Override // overrides Alien toString method
	public String toString()
	{
		return super.toString() + "\nMethod of travel: " + FLY + "\nAppearance: " + DETAIL;
	}

}
