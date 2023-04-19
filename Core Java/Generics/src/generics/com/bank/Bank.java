package generics.com.bank;

import java.util.ArrayList;

import generics.com.account.Account;

public class Bank {
	
	public ArrayList<Account> geAccountList(ArrayList<Account>al){
		
		al.add(new Account("a1251","AAAA","Saving"));
		al.add(new Account("a2521","BBBB","Saving"));
		al.add(new Account("C526", "CCC", "Carunt"));
		
		return al;
	}

	

}
