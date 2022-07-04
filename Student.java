
public class Student {
	//property initialization
	private String name;
    private String email;
    private int age;

    
    public Student() {
		
	}

	public Student(String name, String email, int age) {
		this.name = name;
		this.email = email;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	//From the above information, create a method to export student information
	public void println() {
        System.out.format("%12s %32s %16d \n" , name, email, age);
    }

}
