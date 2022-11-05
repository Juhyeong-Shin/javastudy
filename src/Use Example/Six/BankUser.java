package Six;
//상속불가
public enum BankUser{	
	User1("토스", "서수진", 4),
	User2("토스", "송우기", 10);

	private final String Bank;
	private final String Name;
	private final int Value;
	
	
	private BankUser(String bank, String name, int value) {
		this.Bank = bank;
		this.Name = name;
		this.Value = value;
	}	
	
	public String getBank() {
		return this.Bank;
	}
	
	public String getName() {
		return this.Name;
	}
	
	public int getValue() {
		return this.Value;
	}
	
	
	public void printAllBankUser() {	
		for (BankUser user : BankUser.values()) {
			System.out.println(user.getName());
		}
	}
	
	public void printCompareUser(String putUser){
		BankUser user1 = BankUser.User1;
		System.out.println(user1.compareTo(BankUser.User2));

	}
}

