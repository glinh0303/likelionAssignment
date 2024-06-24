package Model;

import java.util.List;

public class Department {
	private int stt;
	private int id;
	private String name;
	private List<Emp> employees;
	
	

	public int getStt() {
		return stt;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public List<Emp> getEmployees() {
		return employees;
	}

	public void setStt(int stt) {
		this.stt = stt;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmployees(List<Emp> employees) {
		this.employees = employees;
	}

}
