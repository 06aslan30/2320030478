package com.bank;

public class UserLoginManager {
	 private static UserLoginManager instance;
	    private boolean loggedIn = false;


	    private UserLoginManager() {
	    	
	    }

	    public static UserLoginManager getInstance() {
	        if (instance == null) {
	            instance = new UserLoginManager();
	        }
	        return instance;
	    }
	    public void login(String username, String password) {

	        loggedIn = true;
	        System.out.println("User logged in successfully.");
	    }

	    public void logout() {
	        loggedIn = false;
	        System.out.println("User logged out successfully.");
	    }

	 
	    public boolean isLoggedIn() {
	        return loggedIn;
	    }
	}
	
