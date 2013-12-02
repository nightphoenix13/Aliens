// This superclass sets a base for body type
// I know the BodyType superclass seems pointless with 2 aliens but this is just version 1.0
// Written by Zack Rosales

package Aliens;

public abstract class BodyType
{
	// class attributes
	String size,
		   consistency;
	
	// two-argument constructor
	public BodyType(String size, String consistency)
	{
		setBodyType(size, consistency); // call to class set method
	}
	
	// no-argument constructor
	public BodyType()
	{
		this(null, null); // call to two-argument constructor
	}
	
	// copy constructor
	public BodyType(BodyType body)
	{
		this(body.getSize(), body.getConsistency()); // call to two-argument constructor
	}
	
	// class set method
	private void setBodyType(String size, String consistency)
	{
		setSize(size);
		setConsistency(consistency);
	}
	
	// size set method
	private void setSize(String s)
	{
		size = s;
	}
	
	// consistency set method
	private void setConsistency(String c)
	{
		consistency = c;
	}
	
	// class get method
	public BodyType getBodyType()
	{
		return this;
	}
	
	// size get method
	public String getSize()
	{
		return size;
	}
	
	// consistency get method
	public String getConsistency()
	{
		return consistency;
	}
	
	@Override // overrides java.lang.Object.toString method
	public String toString()
	{
		return "\nSize: " + getSize() + "\nConsistency: " + getConsistency();
	}

}
