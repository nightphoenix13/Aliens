// This subclass takes from superclass BodyType and expounds on Humanoids
// Written by Zack Rosales

package Aliens;

public class Humanoid extends BodyType
{
	// Humanoid class attributes
	protected int arms,
				  legs,
				  fingers,
				  eyes;
	
	// six-argument constructor 
	public Humanoid(int arms, int legs, int fingers, int eyes, String size,
			String consistency)
	{
		super(size, consistency);
		setHumanoid(arms, legs, fingers, eyes);		
	}
	
	// no-argument constructor
	public Humanoid()
	{
		this(0, 0, 0, 0, null, null);
	}
	
	// copy constructor
	public Humanoid(Humanoid humanoid)
	{
		this(humanoid.getArms(), humanoid.getLegs(), humanoid.getFingers(),
				humanoid.getEyes(), humanoid.getSize(), humanoid.getConsistency());
	}
	
	// class set method
	private void setHumanoid(int arms, int legs, int fingers, int eyes)
	{
		setArms(arms); // call to arms set method
		setLegs(legs); // call to legs set method
		setFingers(fingers); // call to fingers set method
		setEyes(eyes); // call to eyes set method
	}
	
	// arms set method
	private void setArms(int a)
	{
		arms = a;
	}
	
	// legs set method
	private void setLegs(int l)
	{
		legs = l;
	}
	
	// fingers set method
	private void setFingers(int f)
	{
		fingers = f;
	}
	
	// eyes set method
	private void setEyes(int e)
	{
		eyes = e;
	}
	
	// class get method
	public Humanoid getHumanoid()
	{
		return this;
	}
	
	// arms get method
	public int getArms()
	{
		return arms;
	}
	
	// legs set method
	public int getLegs()
	{
		return legs;
	}
	
	// fingers get method
	public int getFingers()
	{
		return fingers;
	}
	
	// eyes get method
	public int getEyes()
	{
		return eyes;
	}
	
	@Override // overrides BodyType toString method
	public String toString()
	{
		return "Humanoid" + super.toString() + "\nArms: " + getArms() + "\nLegs: " +
				getLegs() + "\nFingers: " + getFingers() + "\nEyes: " + getEyes();
	}

}
