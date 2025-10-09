package jdbcprograms.executor;

import jdbcprograms.services.CrudOperations;

public class JDBCMain {

	public static void main(String[] args) {
		CrudOperations.addStudent(101, "Sravya");
		CrudOperations.addStudent(102, "Chinni");
		CrudOperations.addStudent(103, "Rajasri");

	}

}