package Week1.day2;

public class EmployeeDetails {
 public void employeeName() {
	 String empName = "ArunKumar M";
	 int empId = 7767;
    System.out.println("EmpName : " + empName);
    System.out.println("ID : " + empId);
 }
 public void EmployeeAddress() {
	 String empAddress = "Chennai";
	 System.out.println(empAddress);
	 
 }
 public void employeeSalary() {
	 double empSalary = 355555.234154;
	 System.out.println(empSalary); 
 }
 
 public void employeeMobnumber() {
	 long empMobnum = 9876543210L;
	 System.out.println(empMobnum);
 }
 public static void main(String[] args) {
	 EmployeeDetails details = new EmployeeDetails();
	 details.employeeName();
	 details.EmployeeAddress();
	 details.employeeSalary();
	 details.employeeMobnumber();
}
}

