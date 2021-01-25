package entities;

public class BusinessAccount extends Account {
	protected Double loadLimit;
	
	
	public BusinessAccount(){
		super();
		
	}
	public BusinessAccount(Integer number, String holder, Double balance, Double loadLimit) {
		super(number, holder, balance);
		this.loadLimit = loadLimit;
		
	}
	
	public Double getLoadLimit() {
		return loadLimit;
		
	}
	public void setLoadLimit(Double loadLimit) {
		this.loadLimit = loadLimit;
	}
	
	public void load(double amount) {
		if(amount <= loadLimit) {
			balance += amount - 10.0;
		}
	}
	
	public void withdraw(double amount) {
		super.withdraw(amount);
		balance -= 2.0;
	}

}
