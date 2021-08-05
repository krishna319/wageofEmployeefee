package wageofemployee;

public class EmployeeFee {
	public static void main(String[] args) {

		final int IS_PRESENT = 1;
		final int IS_PART_TIME_PRESENT = 2;
		final int WAGE_PER_HOUR = 20;
		final int NUM_OF_WORKING_DAYS = 20;

		int empHrs = 0;
		int empWage = 0;
		int totalEmpWage = 0;
		for (int day = 0; day < NUM_OF_WORKING_DAYS; day++) {
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;
			switch (empCheck) {
			case IS_PRESENT:
				empHrs = 8;
				break;
			case IS_PART_TIME_PRESENT:
				empHrs = 4;
				break;
			default:
				empHrs = 0;
			}
			empWage = empHrs * WAGE_PER_HOUR;
			totalEmpWage += empWage;
		}
		System.out.println("Total Emp Wage:" + totalEmpWage);

	}
}
