package week3.day1.assignment3and4;

public class AxisBank extends BankInfo {

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		// super.deposit();
		System.out.println("Deposit Account of Axis Bank");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AxisBank axis = new AxisBank();
		axis.saving();
		axis.fixed();
		axis.deposit();
	}

}
