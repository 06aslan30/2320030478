package com.adapter;

public class VoltageAdapter implements Charger {
	private Socket socket;
	public VoltageAdapter(Socket socket)
	{
		this.socket=socket;
	}
	@Override
	public int getVolt() {
	System.out.println("Convert");
		return convert(socket.getVoltage());
	}
	private int convert(int voltage) {
        System.out.println("COnverteddd");
        return 3;
	}

}
