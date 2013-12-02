// This subclass takes from superclass BodyType and expounds on Humanoid
// Written by Zack Rosales

package Aliens;

public class Aberration extends BodyType
{
	// two-argument constructor
	public Aberration(String size, String consistency)
	{
		super(size, consistency);
	}
	
	// no-argument constructor
	public Aberration()
	{
		this(null, null);
	}
	
	// copy constructor
	public Aberration(Aberration aberration)
	{
		this(aberration.getSize(), aberration.getConsistency());
	}
	
	@Override // overrides BodyType toString method
	public String toString()
	{
		return "Aberration" + super.toString();
	}

}
