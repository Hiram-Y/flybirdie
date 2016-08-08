package bo;

/**
 * 游客信心
 * @author caijing
 *
 */

public class Customer {
	
	private  String age;
	private  String  name;
	private String job ;
	
	public  Customer(){
		
	}
	
	
	public Customer(String age, String name, String job) {
	setAge(age);
	setJob(job);
	setName(name);
	}
	
	
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}


	@Override
	public String toString() {
		return "Customer [age=" + age + ", name=" + name + ", job=" + job + "]";
	}
	
	
	

}
