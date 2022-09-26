package Que5;
class employee{
	private String firstName, lastName, designation;
	private int age;
	//Default Constructor
	public employee() {
	}
	
	//Parameterized Constructor
	public employee(String fname, String lname, int ag, String designat) {
		this.firstName=fname;
		this.lastName=lname;
		this.age=ag;
		this.designation = designat;
	}
	
	//Copy Constructor
	public employee(employee emp) {
		this.firstName = emp.firstName;
		this.lastName = emp.lastName;
		this.age = emp.age;
		this.designation = emp.designation;
	}
	
	//Getter
	public String getFirstName()
	{
		return firstName;
	}
	public String getLastName()
	{
		return lastName;
	}
	public int getAge()
	{
		return age;
	}
	public String getDesignation() {
		return designation;
	}
	
	//Setter
	public void setFirstName(String fName)
	{
		firstName = fName;
	}
	public void setLastName (String lName)
	{
		lastName = lName;
	}
	public void setAge(int ag) {
		age = ag;
	}
	public void setDesignation(String design) {
		designation = design;
	}
	
	//To String Function
	public String toString()
	{
		return firstName + " " + lastName + " " + age+" "+designation;
	}
}
public class que5 {
	public static void main(String args[]) {
		employee emp = new employee();
		System.out.println(emp.toString());
		emp = new employee("Shubham","Kumar",24,"SE");
		System.out.println(emp.toString());
		employee emp1 = new employee(emp);
		System.out.println(emp1.toString());
	}

}
