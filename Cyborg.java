// This subclass takes from superclass BodyType and expounds on Cyborgs
// Written by Zack Rosales

package Aliens;

public class Cyborg extends BodyType
{
	// subclass attributes
	protected String details;
	
	// three-argument constructor
	public Cyborg(String details, String size, String consistency)
	{
		super(size, consistency);
		setCyborg(details);
	}
	
	// no-argument constructor
	public Cyborg()
	{
		this(null, null, null);
	}
	
	// copy constructor
	public Cyborg(Cyborg cyborg)
	{
		this(cyborg.getDetails(), cyborg.getSize(), cyborg.getConsistency());
	}
	
	// class set method
	private void setCyborg(String details)
	{
		setDetails(details);
	}
	
	// details set method
	public void setDetails(String d)
	{
		details = d;
	}
	
	// class get method
	public Cyborg getCyborg()
	{
		return this;
	}
	
	// details get method
	public String getDetails()
	{
		return details;
	}
	
	@Override // overrides BodyType toString method
	public String toString()
	{
		return "Cyborg" + super.toString() + "\nCyborg Description: " + details;
	}

}
