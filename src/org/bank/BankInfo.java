package org.bank;

public class BankInfo extends AxisBank {
	private void saving() {
		System.out.println("Savings");
	}
	private void fixed() {
		System.out.println("Fixed");
	}
	public static void main(String[] args) {
		BankInfo b=new BankInfo();
		b.saving();
		b.fixed();
		b.deposit();
	}

}
