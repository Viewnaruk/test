package lab06;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee Somying = new Employee();
		Somying.setName("Somying");
		Somying.setSalary(25000);
		
		
		System.out.printf("%s's salary is %,d bath/month (%,d bath/year).", Somying.getName(),Somying.getSalary(),Somying.calculatesalayear());
		Somying.calculatesalarypredic(10);
		
	}

}
