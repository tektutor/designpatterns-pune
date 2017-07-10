import java.util.ArrayList;

public class Department {
	private ArrayList<Department> departments;
	private ArrayList<Employee> employees;
	private String name;

	public Department( String name ) {
		this.name = name;

		departments = new ArrayList<Department>();
		employees = new ArrayList<Employee>();
	}

	public void addDepartment ( Department department ) {
		departments.add ( department );
	}

	public void addEmployee ( Employee employee ) {
		employees.add ( employee );
	}

	public void print() {
		System.out.println ( name );

		for ( Department department : departments ) 
			department.print();

		for ( Employee employee : employees ) 
			employee.print();

	}

}
