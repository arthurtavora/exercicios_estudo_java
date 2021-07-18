package entities;

public class BankAccount {
	
	private String accname;
	private int accnumber;
	private double accbalance;
	
	public BankAccount() {	
	}
	public BankAccount(String accname, int accnumber) {
		this.accname = accname;
		this.accnumber = accnumber;
	}
	public BankAccount(String accname, int accnumber, double accbalance) {
		this.accname = accname;
		this.accnumber = accnumber;
		this.accbalance = accbalance;
	}
	public String getName() {
		return accname;
	}
	public void setName(String accname) {
		this.accname = accname;
	}
	public int getAccnumber() {
		return accnumber;
	}
	public void setAccnumber(int accnumber) {
		this.accnumber = accnumber;
	}
	public double getAccbalance() {
		return accbalance;
	}
	public void deposit(double deposit) {
		accbalance += deposit;
	}
	public void withdraw(double withdraw) {
		accbalance -= (withdraw + 5.00);
	}
	public String toString() {
		return "Account "
				+ accnumber
				+ ", Holder: "
				+ accname
				+ ", Balance: $ "
				+ String.format("%.2f", accbalance);
	}
}
