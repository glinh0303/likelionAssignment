package Management;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Model.Department;
import Model.Emp;

public class DepManagement {
	Scanner sc = new Scanner(System.in);

	private List<Department> departments;

	public DepManagement() {
		departments = new ArrayList<>();
	}

	public List<Department> getList() {
		return this.departments;
	}

	public void addNewDep() {
		Department d = new Department();

		d.setStt(departments.size() + 1);
		d.setId(departments.size() + 1);
		System.out.println("Nhap ten phong ban: ");
		String name = sc.next();
		d.setName(name);
		d.setEmployees(new ArrayList<>());
		departments.add(d);
	}

	public void updateDepName(Department d) {

		for (Department department : departments) {
			if (d.getId() == department.getId()) {
				System.out.println("Nhap ten moi: ");
				String newName = sc.next();
				department.setName(newName);
				System.out.println("Update successfully!");
			} else {
				System.out.println("Update unsuccessfully!");
			}
		}
	}

	public void updateEmpQuantity(Emp e, String service, Department d) {
		List<Emp> emps = d.getEmployees();
		if (service.equalsIgnoreCase("add")) {
			if (emps.size() < 3) {
				emps.add(e);
			} else {
				System.out.println("Vui long chon phong ban khac.");
			}
		} else {
			for (int i = 0; i < emps.size(); i++) {
				if (emps.get(i).getIdEmp() == e.getIdEmp()) {
					emps.remove(emps.get(i));
				}
			}
		}
	}
}
