package generics.com;

import java.util.ArrayList;

import generics.com.account.Account;
import generics.com.bank.Bank;

public class MainBankClass {
	public static void main(String[] args) {
		
		ArrayList<Account> al= new ArrayList<Account>();
		Bank bank= new Bank();
		ArrayList<Account> accountslist=bank.geAccountList(al);
		System.out.println("Account No \t AccountName \t AccountType");
		System.out.println("============================================");
		for (Account accoun1t : accountslist) {
			System.out.println(accoun1t.getAccountNO()+"\t"+accoun1t.getAccountName()+"\t"+accoun1t.getAccountType());
		}
	}

}
