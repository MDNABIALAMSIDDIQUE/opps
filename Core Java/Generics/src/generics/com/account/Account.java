package generics.com.account;

public class Account {

	
	
		String accountNO;
		String AccountName;
		String AccountType;
		
		 public Account(String accountNO, String AccountName, String AccountType) {
			this.accountNO=accountNO;
			this.AccountName=AccountName;
			this.AccountType=AccountType;
			
		}

		public String getAccountNO() {
			return accountNO;
		}

		public void setAccountNO(String accountNO) {
			this.accountNO = accountNO;
		}

		public String getAccountName() {
			return AccountName;
		}

		public void setAccountName(String accountName) {
			AccountName = accountName;
		}

		public String getAccountType() {
			return AccountType;
		}

		public void setAccountType(String accountType) {
			AccountType = accountType;
		}

		@Override
		public String toString() {
			return "Account [accountNO=" + accountNO + ", AccountName=" + AccountName + ", AccountType=" + AccountType
					+ "]";
		}
		 
	

}
