package com.adapter;

public class Main {

	public static void main(String[] args) {
		Socket socket = new Socket();
        VoltageAdapter adapter = new VoltageAdapter(socket);
        Mobile mobile = new Mobile(adapter);

        mobile.charge();
	}

}
