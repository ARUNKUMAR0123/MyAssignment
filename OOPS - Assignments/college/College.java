package college;

public class College {
	
public  void collegeName() {
	System.out.println("Name: "+ "CIPET:IPT");
}
public void collegeCode() {
	System.out.println("Code :"+"3103");
}
public void collegeRank() {
	System.out.println("Rank :" + "7th");
}
public static void main(String[] args) {
	College mycollege = new College();
	mycollege.collegeName();
	mycollege.collegeCode();
	mycollege.collegeRank();
	System.out.println(mycollege);
}

}
