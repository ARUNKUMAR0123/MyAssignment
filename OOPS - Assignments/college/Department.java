package college;

public class Department extends College {
public void deptName() {
	System.out.println("DEP :"+"B.TECH ");
}
public static void main(String[] args) {
	Department mydep = new Department();
	mydep.collegeName();
	mydep.collegeCode();
	mydep.collegeRank();
	mydep.deptName();
	System.out.println(mydep);
	
}
}
