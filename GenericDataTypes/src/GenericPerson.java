
public class GenericPerson <T, K> {
	private T age;
	private K gender;
	private String names;
	
	public GenericPerson(T age, K gender, String names) {
		this.age = age;
		this.gender = gender;
		this.names = names;
	}

	public T getAge() {
		return age;
	}

	public void setAge(T age) {
		this.age = age;
	}

	public K getGender() {
		return gender;
	}

	public void setGender(K gender) {
		this.gender = gender;
	}

	public String getNames() {
		return names;
	}

	public void setNames(String names) {
		this.names = names;
	}

	public void output() {
		System.out.println("Person Data:\n Age: "+this.age + " \n Gender: "+ this.gender + " \n Names: "+ this.names);		
	}
	
	public static void main(String[] args) {
		GenericPerson<Integer, String> person = new GenericPerson<Integer, String>(20,"male","Alex");
		GenericPerson<String, String> person1 = new GenericPerson<String, String>("19","female","alia");
		GenericPerson<Integer, Integer> person2 = new GenericPerson<Integer, Integer>(19,2,"alia");
		person2.output();
	}
}
