// This superclass holds the shared attributes of all aliens.
// Written by Zack Rosales

package Aliens;

public abstract class Alien
{
	
	// class attributes
	protected String race, // race name
		   alignment, // attitude towards other races
		   origin; // planet of origin
	
	BodyType body;
	
	// five-argument class constructor
	public Alien(String race, String alignment, String origin, BodyType body)
	{
		setAlien(race, alignment, origin, body); // call to class set method
	}
	
	// no-argument constructor
	public Alien()
	{
		this(null, null, null, null); // call to five-argument constructor
	}
	
	// copy constructor
	public Alien(Alien alien)
	{
		this(alien.getRace(), alien.getAlignment(), alien.getOrigin(), alien.getBody()); // call to five-argument constructor
	}
	
	// class set method
	private void setAlien(String race, String alignment, String origin, BodyType body)
	{
		setRace(race); // call to race set method
		setAlignment(alignment); // call to alignment set method
		setOrigin(origin); // call to origin set method
		setBody(body); // call to body set method
	}
	
	// race set method
	private void setRace(String r)
	{
		race = r;
	}
	
	// alignment set method
	private void setAlignment(String a)
	{
		alignment = a;
	}
	
	// origin set method
	private void setOrigin(String o)
	{
		origin = o;
	}
	
	// body set method
	private void setBody(BodyType b)
	{
		body = b;
	}
	
	// class get method
	public Alien getAlien()
	{
		return this;
	}
	
	// race get method
	public String getRace()
	{
		return race;
	}
	
	// alignment get method
	public String getAlignment()
	{
		return alignment;
	}
	
	// origin get method
	public String getOrigin()
	{
		return origin;
	}
	
	// body set method
	public BodyType getBody()
	{
		return body;
	}
	

	@Override // overrides java.lang.Object.toString method
	public String toString()
	{
		return "\nRace: " + getRace() + "\nAlignment: " + getAlignment() +
				"\nPlanet of origin: " + getOrigin() + "\nBody Type: " +
				getBody();
	}

}
