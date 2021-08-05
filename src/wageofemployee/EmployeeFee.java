package wageofemployee;

public class EmployeeFee {
	public static void main(String[] args) {

		final int IS_PRESENT = 1;
		final int IS_PART_TIME_PRESENT = 2;
		final int WAGE_PER_HOUR = 20;

		int empHrs = 0;
		int empWage = 0;
		int empCheck = (int) Math.floor(Math.random() * 10) % 3;
		switch (empCheck) {
		case IS_PRESENT:
			empHrs = 8;
			System.out.println("Employee is present");
			break;
		case IS_PART_TIME_PRESENT:
			empHrs = 4;
			System.out.println("Employe is part time present");
			break;
		default:
			empHrs = 0;
		}
		empWage = empHrs * WAGE_PER_HOUR;
		System.out.println("Emp Wage: " + empWage);

	}
}
