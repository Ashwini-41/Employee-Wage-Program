public class EmployeeWageP {
    public static void main(String[] args) {
        System.out.println("Welcome to employee wage program");
        int IS_PART_TIME = 2;
        int IS_FULL_TIME = 1;
        int emp_rate_per_hr = 20;

        double empCheck = Math.floor(Math.random() * 10) % 2;
        if(empCheck == IS_PART_TIME){
            System.out.println("Employee is Part time present");
        }else if (empCheck == IS_FULL_TIME){
            System.out.println("Employee is Present");
        }else{
            System.out.println("Employee is Absent");
        }

        int empHr = 0;
        int empWage = 0;
        if(empCheck == IS_PART_TIME){
            empHr = 4;
        } else if (empCheck == IS_FULL_TIME) {
            empHr = 8;
        } else {
            empHr = 0;
        }

        empWage = empHr * emp_rate_per_hr;
        System.out.println("Employeee Wage for a day is: " + empWage);
    }
}