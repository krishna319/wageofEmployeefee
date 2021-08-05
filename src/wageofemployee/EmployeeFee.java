package wageofemployee;

public class EmployeeFee {
	public static void main(String[] args) {

		int IS_PRESENT = 1;
		int WAGE_PER_HOUR = 20;
		int FULL_TIME = 8;
		int dailyWage = 0;
		double empCheck = Math.floor(Math.random() * 10) % 3;
		if (empCheck == IS_PRESENT) {
			System.out.println("Employee is present");
			dailyWage = WAGE_PER_HOUR * FULL_TIME;
		}

		else {
			System.out.println("Employee is absent");
		}
		System.out.println("Emp Wage: " + dailyWage);

	}
}
