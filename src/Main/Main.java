package Main;

import java.util.ArrayList;
import java.util.List;

import Management.DepManagement;
import Management.EmpManagement;
import Management.EmpManagement;
import Model.Department;
import Model.Emp;

public class Main {
	public static void main(String[] args) {
		EmpManagement empManagement = new EmpManagement();
		DepManagement depManagement = new DepManagement();

		List<Emp> emps = empManagement.getEmpList();
		List<Department> deps = depManagement.getList();
		
		Department d = new Department();
		d.setName("A");
//		depManagement.addNewDep();

		Emp e1 = new Emp();
		e1.setStt(1);
		e1.setIdEmp(1);
		e1.setNameEmp("Emp A");
		e1.setAge(25);
		e1.setJoin("06/24/2024 7:50");

		Emp e2 = new Emp();
		e2.setStt(2);
		e2.setIdEmp(2);
		e2.setNameEmp("Emp B");
		e2.setAge(30);
		e2.setJoin("06/24/2024 8:15");

		Emp e3 = new Emp();
		e3.setStt(3);
		e3.setIdEmp(3);
		e3.setNameEmp("Emp C");
		e3.setAge(28);
		e3.setJoin("06/24/2024 8:30");

		Emp e4 = new Emp();
		e4.setStt(4);
		e4.setIdEmp(4);
		e4.setNameEmp("Emp D");
		e4.setAge(32);
		e4.setJoin("06/24/2024 9:00");

		emps.add(e1);
		emps.add(e2);
		emps.add(e3);
		emps.add(e4);
		
		d.setEmployees(emps);
		
		deps.add(d);

		for (Department department : deps) {
			System.out.println(department.getId() + " " + department.getName());
			for (Emp emp : department.getEmployees()) {
				System.out.println(emp.getIdEmp() + " " + emp.getNameEmp());

			}
		}
	

//		for (Emp emp : emps) {
//			System.out.println(emp.getNameEmp() + " " + emp.getIdEmp());
//		}

//		empManagement.updateName(e1);

//		empManagement.addEmp();
		
//		System.out.println("----------");
//		for (Emp emp : emps) {
//			System.out.println(emp.getNameEmp() + " " + emp.getIdEmp());
//		}

	}

}
