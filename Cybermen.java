// This subclass takes from superclass Alien and expounds on Cybermen
// Written by Zack Rosales

package Aliens;

public class Cybermen extends Alien
{
	// subclass attributes
	final static String RACE = "Cybermen",
						ALIGNMENT = "Evil",
						ORIGIN = "Mondas (Earth's twin planet)",
						SIZE = "Medium",
						CONSISTENCY = "Solid",
						DETAILS = "Once humans, physically and mentally \"upgraded\" to Cybermen. Stripped of all emotion";
	final static int ARMS = 2,
					 LEGS = 2,
					 FINGERS = 5,
					 EYES = 2;
	
	// creates HumanoidCyborg BodyType
	static BodyType BODY = new HumanoidCyborg(DETAILS, ARMS, LEGS, FINGERS, EYES, SIZE,
			CONSISTENCY);
	
	// no-argument constructor
	public Cybermen()
	{
		super(RACE, ALIGNMENT, ORIGIN, BODY);
	}
	
	@Override // overrides Alien toString method
	public String toString()
	{
		return super.toString();
	}

}
