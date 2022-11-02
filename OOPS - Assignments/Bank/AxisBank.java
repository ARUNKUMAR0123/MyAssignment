package Bank;

public class AxisBank extends BankInfo {
	public void deposit() {
		System.out.println("DEPOSIT MONEY : 10000 Rupees Successfully");
	}
	public static void main(String[] args) {
		AxisBank mybank = new AxisBank();
		mybank.saving();
		mybank.fixed();
		mybank.deposit();
		System.out.println(mybank);
	}

}
