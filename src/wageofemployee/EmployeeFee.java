package wageofemployee;

public class EmployeeFee {

	public static final int IS_PRESENT = 1;
	public static final int IS_PART_TIME_PRESENT = 2;
	public static final int WAGE_PER_HOUR = 20;
	public static final int NUM_OF_WORKING_DAYS = 20;
	public static final int MAX_HRS_IN_MONTH = 10;

	public static void main(String[] args) {

		int empHrs = 0;
		int totalEmpHrs = 0;
		int totalWorkingDays = 0;
		while (totalEmpHrs <= MAX_HRS_IN_MONTH
				&& totalWorkingDays < NUM_OF_WORKING_DAYS) {
			totalWorkingDays++;
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
			totalEmpHrs += empHrs;
			System.out
					.println("day: " + totalWorkingDays + "Emp Hr: " + empHrs);
		}
		int totalEmpWage = totalEmpHrs * WAGE_PER_HOUR;
		System.out.println("Total Emp Wage:" + totalEmpWage);

	}
}
