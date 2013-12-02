// This subclass takes from superclass Alien and expounds on Martians(Ice Warriors)
// Written by Zack Rosales

package Aliens;

public class Martian extends Alien
{
	// subclass attributes
	final static String SUBTYPE = "Reptilian",
						CLASS = "Warrior",
						SIZE = "Medium",
						ARMOR = "Bio-Mechanical",
						CONSISTENCY = "Solid",
						RACE = "Ice Warrior",
						ALIGNMENT = "Neutral",
						ORIGIN = "Mars";
	final static int ARMS = 2,
					 LEGS = 2,
					 FINGERS = 3,
					 EYES = 2;
	
	// creates Humanoid BodyType
	static BodyType BODY = new Humanoid(ARMS, LEGS, FINGERS, EYES, SIZE, CONSISTENCY);
	
	// no-argument constructor
	public Martian()
	{
		super(RACE, ALIGNMENT, ORIGIN, BODY);
	}
	
	@Override // overrides Alien toString method
	public String toString()
	{
		return super.toString() + "\nSubtype: " + SUBTYPE + "\nClass: " + CLASS +
				"\nArmor: " + ARMOR;
	}

}
