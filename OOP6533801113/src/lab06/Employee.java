package lab06;

public class Employee {

	public String name;
	public int salary;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	public Employee() {
		
		name = "B";
		salary = 0;
		
	}
	public  int calculatesalayear() {
		int Salayear=0;
		Salayear=this.salary*12;
		return Salayear;
	}
	public void calculatesalarypredic(int present) {
		int Salapre=0;
		if (present<=0 && present>=101) {
			System.out.printf("\n%d is invalid persent",present);
		}
		else Salapre=((present*this.salary)/100)+this.salary;{
			System.out.printf("\nIf salary is raised %d, the salary will be %d bath/month",present,Salapre);
		}
				
	}
}
