package Patient;
public class Patient
{
	private final String firstName;
	private final String middleName;
	private final String lastName;
	private final int age;
	private final int weight;
	private SexType sexType;
	private final int height;
	private final boolean organDonor;
	private BloodType bloodType;


public enum BloodType
{
	NONE("None"), A_POSITIVE("A+"), A_NEGATIVE("A-"), AB_POSITIVE("AB+"), AB_NEGATIVE("AB-"), B_POSITIVE("B+"),
	B_NEGATIVE("B-"), O_POSITIVE("O+"), O_NEGATIVE("O-");

    private String bloodType;

    private BloodType(String bloodType)
    {
        this.bloodType = bloodType;
    }

    public String getBloodType()
    {
        return this.bloodType;
    }
}
public enum SexType
{
	NONE("None"), MALE("Male"), FEMALE("Female");

    private String sexType;

    private SexType(String sexType)
    {
        this.sexType = sexType;
    }

    public String getSexType()
    {
        return this.sexType;
    }
}

//builder
private Patient(PatientBuilder builder) {
	this.firstName=builder.firstName;
	this.middleName=builder.middleName;
	this.lastName=builder.lastName;
	this.age=builder.age;
	this.weight=builder.weight;
	this.sexType=builder.sexType;
	this.height=builder.height;
	this.organDonor=builder.organDonor;
	this.bloodType=builder.bloodType;
}

//GETTERS
public String getFirstName() {
    return firstName;
}

public String getMiddleName() {
    return middleName;
}

public String getLastName() {
    return lastName;
}

public int getAge() {
    return age;
}

public int getWeight() {
    return weight;
}

public int getHeight() {
    return height;
}

public boolean getOrganDonor() {
    return organDonor;
}



//Patient Builder
public static class PatientBuilder
{
	private final String firstName;
	private final String middleName;
	private final String lastName;
	private final int age;
	private final int weight;
	private SexType sexType;
	private final int height;
	private final boolean organDonor;
	private BloodType bloodType;

    public PatientBuilder(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    public PatientBuilder age(int age) {
        this.age = age;
        return this;
    }
    
    public PatientBuilder weight(int weight) {
        this.weight = weight;
        return this;
    }
    
    public PatientBuilder height(int height) {
        this.height = height;
        return this;
    }

    public PatientBuilder sexType(SexType sexType)
    {
        this.sexType = sexType;
        return this;
    }
    
    public PatientBuilder organDonor(boolean organDonor)
    {
        this.organDonor = organDonor;
        return this;
    }
    
    public PatientBuilder bloodType(BloodType bloodType)
    {
        this.bloodType = bloodType;
        return this;
    }

    public Patient build() {
    	Patient patient =  new Patient(this);
        return patient;
    }

}
}
