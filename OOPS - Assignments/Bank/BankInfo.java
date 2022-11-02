package Bank;

public class BankInfo {
	
	public void saving() {
		System.out.println("SAVING :" + "4300 Rupees");
	}
    public void fixed() {
    	System.out.println("FIXING :" + "20000 Rupees");
    }
    public void deposit() {
    	System.out.println("DEPOSIT MONEY :"+ "5000 Rupees");
    }
    
    public static void main(String[] args) {
    	BankInfo task = new BankInfo();
    	task.saving();
    	task.fixed();
    	task.deposit();
    	System.out.println(task);
	}
}
