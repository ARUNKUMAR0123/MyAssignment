package System;

public class Desktop extends Computer {
	
public void desktopSize() {
	System.out.println("16.5 inch");
}

public static void main(String[] args) {
	Desktop mypc = new Desktop();
	mypc.desktopSize();
	mypc.ComputerModel();
	System.out.println(mypc);
}
}
