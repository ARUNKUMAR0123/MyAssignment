package Week1.day1;

public class twoWheeler {
	  int noOfwheels = 2;
	  short noOfmirrors = 2;
	  long chassisNumber = 1652579365753827526L;
	  boolean isPunctured = false;
	  double runningKilometer = 19623.13423;
	  String bikeName = "Duke390cc";
public static void main(String[] args) {
	twoWheeler bike = new twoWheeler();
	System.out.println(bike.noOfwheels);
	System.out.println(bike.noOfmirrors);
	System.out.println(bike.chassisNumber);
	System.out.println(bike.isPunctured);
	System.out.println(bike.runningKilometer);
	System.out.println("BikeName - " + bike.bikeName);
}
}
