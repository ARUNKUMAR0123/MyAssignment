package college;

public class Student extends Department {
	
public void studentName() {
	System.out.println("NAME :"+"ARUNKUMAR M");
}	
public void studentDept() {
	System.out.println("STUDENT DEP :"+ "Plastic Technology");
}
public void studentId() {
	System.out.println("ID :" + "31031822000");
}
public static void main(String[] args) {
	Student me = new Student();
	me.collegeName();
	me.collegeCode();
	me.collegeRank();
	me.deptName();
	me.studentName();
	me.studentDept();
	me.studentId();
	System.out.println(me);
	
}
}

