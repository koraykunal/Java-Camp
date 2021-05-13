package Entities;

public class Customer {
	private int id;
	private String firstName;
	private String lastName;
	private int yearOfBirth;
	private String nationalityId;
	public Customer() {}
	public Customer(int id, String firstName, String lastName, int yearOfBirth, String nationalityId) {
		super();
		this.firstName=firstName;
		this.id=id;
		this.lastName=lastName;
		this.nationalityId=nationalityId;
		this.yearOfBirth=yearOfBirth;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public int getYearOfBirth() {
		return yearOfBirth;
	}
	public void setYearOfBirth(int yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}
	public String getNationalityId() {
		return nationalityId;
	}
	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}
	
}
