package java_xml_handler;

public class Person {
	private String firstName;
	private String lastName;
	private String gender;
	private boolean hasOscar;
	private boolean hasGoldenGlobe;

	public Person(String firstName, String lastName, String gender, boolean hasOscar, boolean hasGoldenGlobe) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.hasOscar = hasOscar;
		this.hasGoldenGlobe = hasGoldenGlobe;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public boolean isHasOscar() {
		return hasOscar;
	}

	public void setHasOscar(boolean hasOscar) {
		this.hasOscar = hasOscar;
	}

	public boolean isHasGoldenGlobe() {
		return hasGoldenGlobe;
	}

	public void setHasGoldenGlobe(boolean hasGoldenGlobe) {
		this.hasGoldenGlobe = hasGoldenGlobe;
	}

	public String toXMLString() {
		return "";
	}

}
