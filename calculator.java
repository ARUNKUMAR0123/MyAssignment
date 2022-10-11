package Week1.day2;

public class calculator {
    
	public void addTwoNumbers(int a , int b) {
    	int c = a+b;
    	System.out.println(c);
    }
    
    public void subTwonumbers(int a , int b) {
    	int c = a - b;
    	System.out.println(c);
    }
    
    public void multiTwonumbers (int a , int b) {
    	int c = a*b;
    	System.out.println(c);
    }
    
    public void divTwonumbers (int a , int b) {
    	int c = a/b;
    	System.out.println(c);
    }
 public static void main(String[] args) {
		calculator calc = new calculator();
		calc.addTwoNumbers(21, 10);
		calc.subTwonumbers(20, 10);
		calc.multiTwonumbers(5, 6);
		calc.divTwonumbers(36, 6);
		
	}
    
}
