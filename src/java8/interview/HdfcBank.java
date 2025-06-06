package java8.interview;

public class HdfcBank {
	
	private String name;
	private int accountNum;
	double balance;
	
	HdfcBank(){
		
	}
     HdfcBank( String name,int accountNum,double balance){
    	 this.name=name;
    	 this.accountNum=accountNum;
    	 this.balance=balance;
    	 
		
	   }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAccountNum() {
		return accountNum;
	}
	public void setAccountNum(int accountNum) {
		this.accountNum = accountNum;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "HdfcBank [name=" + name + ", accountNum=" + accountNum + ", bal=" + balance + "]";
	}
     
     
	
	

}
