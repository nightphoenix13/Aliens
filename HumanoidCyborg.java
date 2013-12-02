// This subclass takes from superclass Humanoid and expounds on Humanoid Cyborgs
// Written by Zack Rosales

package Aliens;

public class HumanoidCyborg extends Humanoid
{
	// subclass attributes
	protected String details;
	
	// seven-argument constructor
	public HumanoidCyborg(String details, int arms, int legs, int fingers, int eyes,
			String size, String consistency)
	{
		super(arms, legs, fingers, eyes, size, consistency);
		setHumanoidCyborg(details);
	}
	
	// no-argument constructor
	public HumanoidCyborg()
	{
		this(null, 0, 0, 0, 0, null, null);
	}
	
	// two-argument constructor for Humanoid BodyType object
	public HumanoidCyborg(String details, Humanoid humanoid)
	{
		this(details, humanoid.getArms(), humanoid.getLegs(), humanoid.getFingers(),
				humanoid.getEyes(), humanoid.getSize(), humanoid.getConsistency());
	}
	
	// two-argument constructor for Humanoid and Cyborg BodyType objects
	public HumanoidCyborg(Cyborg cyborg, Humanoid humanoid)
	{
		this(cyborg.getDetails(), humanoid.getArms(), humanoid.getLegs(),
				humanoid.getFingers(), humanoid.getEyes(), humanoid.getSize(),
				humanoid.getConsistency());
	}
	
	// copy constructor
	public HumanoidCyborg(HumanoidCyborg hc)
	{
		this(hc.getDetails(), hc.getArms(), hc.getLegs(), hc.getFingers(), hc.getEyes(),
				hc.getSize(), hc.getConsistency());
	}
	
	// class set method
	public void setHumanoidCyborg(String details)
	{
		setDetails(details);
	}
	
	// details set method
	public void setDetails(String d)
	{
		details = d;
	}
	
	// class get method
	public HumanoidCyborg getHumanoidCyborg()
	{
		return this;
	}
	
	// details get method
	public String getDetails()
	{
		return details;
	}
	
	@Override // overrides Humanoid toString method
	public String toString()
	{
		return "Cyborg " + super.toString() + "\nCyborg Description: " + details;
	}

}
