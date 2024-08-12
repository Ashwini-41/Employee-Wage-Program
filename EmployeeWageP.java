public class EmployeeWageP {
    public static final int IS_PART_TIME = 2;
    public static final int IS_FULL_TIME = 1;
    public static final int emp_rate_per_hr = 20;

    public static void main(String[] args) {
        System.out.println("Welcome to employee wage program");
       

        int empCheck = (int) Math.floor(Math.random() * 10) % 3;
        if(empCheck == IS_PART_TIME){
            System.out.println("Employee is Part time present");
        }else if (empCheck == IS_FULL_TIME){
            System.out.println("Employee is Present");
        }else{
            System.out.println("Employee is Absent");
        }

        int empHr = 0;
        int empWage = 0;

        switch (empCheck) {
            case IS_PART_TIME:
                empHr = 4;
                break;
            case IS_FULL_TIME:
                empHr = 8;
                break;
            default:
                empHr = 0;
                break;
        }

        empWage = empHr * emp_rate_per_hr;
        System.out.println("Employeee Wage for a day is: " + empWage);
    }
}