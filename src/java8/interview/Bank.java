package java8.interview;

public class Bank {
       	 String name;
    	 int balance;
		public Bank() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Bank(String name, int balance) {
			super();
			this.name = name;
			this.balance = balance;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getBalance() {
			return balance;
		}
		public void setBalance(int balance) {
			this.balance = balance;
		}
		@Override
		public String toString() {
			return "Bank [name=" + name + ", balance=" + balance + "]";
		}
    	 
    	 
    	 
	
}
