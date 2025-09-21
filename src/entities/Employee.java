package entities;

public class Employee {
	
	private String name;
	private Integer id;
	private Double salary;
	
	
	public Employee(String name, Integer id, Double salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public Integer getId() {
		return id;
	}


	public Double getSalary() {
		return salary;
	}


	public void increaseSalary(double percentage){
		salary += getSalary() *(percentage/100);
	}
	
	public String toString() {
		return getId() + ", " + getName() + ", R$ " + String.format("%.2f", getSalary());
	}

	
	
	
	
	

}
