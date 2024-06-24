package Management;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Model.Department;
import Model.Emp;

public class EmpManagement {
	Scanner sc = new Scanner(System.in);
	private List<Emp> empList;
	private List<Department> depList;
	private DepManagement depManagement;

	public EmpManagement() {
		empList = new ArrayList<>();
		depManagement = new DepManagement();
	}

	public List<Emp> getEmpList() {
		return this.empList;
	}

	public void addEmp() {
		Emp e = new Emp();
		int size = empList.size();
		e.setStt(size + 1);
		e.setIdEmp(size + 1);
		System.out.println("Nhap ten nhan vien: ");
		String name = sc.next();
		e.setNameEmp(name);
		System.out.println("Nhap tuoi: ");
		int age = sc.nextInt();
		e.setAge(age);
		System.out.println("Nhap ngay gio: ");
		String dateTime = sc.next();
		e.setNameEmp(dateTime);

		Department d = selectDepartment();
		if (d != null) {
			e.setDeparment(d);
			depManagement.updateEmpQuantity(e, "add", d);
		}
		empList.add(e);
	}

	public Department selectDepartment() {
		depList = depManagement.getList();
		for (Department department : depList) {
			System.out.println("Id:" + department.getId() + "	Ten:" + department.getName());
		}
		System.out.println("Nhap id phong ban: ");
		int id = sc.nextInt();
		for (int i = 0; i < depList.size(); i++) {
			if (depList.get(i).getId() == id) {
				return depList.get(i);
			}
		}
		return null;
	}

	public void updateName(Emp emp) {
		Scanner sc = new Scanner(System.in);

		for (Emp e : empList) {
			if (emp.getIdEmp() == e.getIdEmp()) {

				System.out.print("Nhập tên mới cho phần tử: ");
				String newName = sc.next();
				e.setNameEmp(newName);
				System.out.println("Update thành công !");
				break;
			} else {
				System.out.println("Update thất bại !");
			}
		}
	}

	public void updateAge(Emp emp) {

		for (Emp e : empList) {
			if (emp.getIdEmp() == e.getIdEmp()) {

				System.out.print("Nhập tuoi: ");
				int newAge = sc.nextInt();
				e.setAge(newAge);
				System.out.println("Update thành công !");
				break;
			} else {
				System.out.println("Update thất bại !");
			}
		}
	}

	public void updateDepartment(Emp emp) {

		for (Emp e : empList) {
			if (emp.getIdEmp() == e.getIdEmp()) {

				Department d = selectDepartment();
				if (d != null) {
					depManagement.updateEmpQuantity(emp, "delete", d);
					System.out.println("Update thành công !");
					break;
				}
			} else {
				System.out.println("Update thất bại !");
			}
		}
	}

	public void deleteEmp(Emp emp) {
		for (Emp e : empList) {
			if (emp.getIdEmp() == e.getIdEmp()) {
				empList.remove(e);
				System.out.println("Update thành công !");
				break;
			} else {
				System.out.println("Update thất bại !");
			}
		}
	}
}
