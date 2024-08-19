package com.bank;

public class Main {	
	public static void main(String[]args)
	{
        Banking bankingProcess = new Banking();

        UserLoginManager loginManager = UserLoginManager.getInstance();
        loginManager.login("user", "password");

        bankingProcess.viewBalance();
        bankingProcess.deposit(200);
        bankingProcess.withdraw(50);

        loginManager.logout();
        bankingProcess.viewBalance();
        bankingProcess.deposit(10000);
        bankingProcess.withdraw(500);

	}
}
