package entities;

public class SavingsAccount extends Account {

	private Double interestRate;
	
	public SavingsAccount() {
		super();
	}

	public SavingsAccount(Integer number, String holder, Double balance, Double interesRate) {
		super(number, holder, balance);
		this.interestRate = interesRate;
	}

	public Double getInteresRate() {
		return interestRate;
	}

	public void setInteresRate(Double interesRate) {
		this.interestRate = interesRate;
	}
	
	public void updatebalance() {
		balance += balance * interestRate; 	
	}
	
	@Override
	public void withdraw(double amount) {
		balance -= amount;
	}
}
