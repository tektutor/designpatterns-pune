public class Main {

	public static void main ( String args[] ) {

		Employee rishi = new Employee("Rishi");
		Employee arun = new Employee("Arun");
		Employee nitesh= new Employee("Nitesh");
		Employee sriram= new Employee("Sriram");

		Employee seniorManager = new Employee ( "Sr. Manager" );

		seniorManager.addEmployee ( rishi );
		seniorManager.addEmployee ( arun);

		nitesh.addEmployee ( sriram );

		seniorManager.addEmployee ( nitesh );


		Department trainingDepartment = new Department ("Training Dept.");
		trainingDepartment.addEmployee ( seniorManager );

		Company amdocs = new Company ( "Amdocs" );
		amdocs.addDepartment ( trainingDepartment );

		amdocs.print();

	}

}
