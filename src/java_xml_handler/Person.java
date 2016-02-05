package java_xml_handler;

public class Person
{
	private String firstName;
	private String lastName;
	private Gender gender;
	private boolean hasOscar;
	private boolean hasGoldenGlobe;

	public Person(String firstName, String lastName, Gender gender, boolean hasOscar, boolean hasGoldenGlobe)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.hasOscar = hasOscar;
		this.hasGoldenGlobe = hasGoldenGlobe;
	}

	public String getFirstName()
	{
		return firstName;
	}

	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	public String getLastName()
	{
		return lastName;
	}

	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}

	public Gender getGender()
	{
		return gender;
	}

	public void setGender(Gender gender)
	{
		this.gender = gender;
	}

	public boolean isHasOscar()
	{
		return hasOscar;
	}

	public void setHasOscar(boolean hasOscar)
	{
		this.hasOscar = hasOscar;
	}

	public boolean isHasGoldenGlobe()
	{
		return hasGoldenGlobe;
	}

	public void setHasGoldenGlobe(boolean hasGoldenGlobe)
	{
		this.hasGoldenGlobe = hasGoldenGlobe;
	}

	public String toString()
	{
		return firstName + " " + lastName;
	}

	public String toXMLString()
	{
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("<Person>");
		stringBuffer.append("<FirstName>");
		stringBuffer.append(firstName);
		stringBuffer.append("</FirstName>");
		stringBuffer.append("<LastName>");
		stringBuffer.append(lastName);
		stringBuffer.append("</LastName>");
		stringBuffer.append("<Gender>");
		stringBuffer.append(gender);
		stringBuffer.append("</Gender>");
		stringBuffer.append("<HasOscar>");
		stringBuffer.append(hasOscar);
		stringBuffer.append("</HasOscar>");
		stringBuffer.append("<HasGoldenGlobe>");
		stringBuffer.append(hasGoldenGlobe);
		stringBuffer.append("</HasGoldenGlobe>");
		stringBuffer.append("</Person>");

		return stringBuffer.toString();

	}
}