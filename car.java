package Week1.day2;

public class car {
 public void applyBreak() {
	 System.out.println("applyBreak");
 }
  public void applyGear() {
	  System.out.println("applyGear");
  }
  public void switchOnAc() {
	  System.out.println("switchOnAc");
  }
  public void applyAccelerate() {
	  System.out.println("applyAccelerate");
  }
  public static void main(String[] args) {
	car vehicle = new car();
	vehicle.applyBreak();
	vehicle.applyGear();
	vehicle.switchOnAc();
	vehicle.applyAccelerate();
}
}
