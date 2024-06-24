package Model;

public class Emp {
	private int stt;
	private int idEmp;
	private String nameEmp;
	private int age;
	private String join;
	private Department deparment;

	public Department getDeparment() {
		return deparment;
	}

	public void setDeparment(Department deparment) {
		this.deparment = deparment;
	}

	public int getStt() {
		return stt;
	}

	public int getIdEmp() {
		return idEmp;
	}

	public String getNameEmp() {
		return nameEmp;
	}

	public int getAge() {
		return age;
	}

	public String getJoin() {
		return join;
	}

	public void setStt(int stt) {
		this.stt = stt;
	}

	public void setIdEmp(int idEmp) {
		this.idEmp = idEmp;
	}

	public void setNameEmp(String nameEmp) {
		this.nameEmp = nameEmp;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setJoin(String join) {
		this.join = join;
	}

}
