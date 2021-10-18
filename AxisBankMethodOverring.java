package week3.day2;

public class AxisBankMethodOverring extends BankInfo {
	
	public void deposit() {
		System.out.println("Deposits info of Axis bank");//Method Overriding 

	}
	public static void main(String[] args) {
		AxisBankMethodOverring axis=new AxisBankMethodOverring();
		axis.deposit();
		
		BankInfo bank=new BankInfo();
		bank.deposit();
		bank.fixed();
		bank.saving();
		
	}

}
