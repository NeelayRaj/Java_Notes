package encapsulation;

public class Students {
	
	private String name;
	private int age;
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		if (age > 20) {
			System.out.println("you are overaged");
		} else {
			this.age = age;
		}
	}
	

}
