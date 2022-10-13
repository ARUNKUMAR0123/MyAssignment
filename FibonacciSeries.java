package Week1.day3;

public class FibonacciSeries {
 public static void main(String[] args) {
	int m1 = 1;
	int m2 = 2;
	int m3;
	System.out.println(m1 + ""+ m2);
	for (int i = 6 ; i<=9; i++ ) {
		m3 =  m1+m2;
		System.out.println(""+m3);
		m1 = m2;
		m2 = m3;
	}
		
}
}
