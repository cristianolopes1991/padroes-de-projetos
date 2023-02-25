package br.com.cod3r.factory.apple;

import br.com.cod3r.factory.apple.before.model.*;

public class Client {

	public Iphone orderIphone(String generation, String level) {
		Iphone device = null;

		if(generation.equals("X")) {
			if(level.equals("standard")) {
				device = new IphoneX();
			} else if(level.equals("higEnd")) {
				device = new IphoneXSMax();
			}

		} else if(generation.equals("11")) {
			if(level.equals("standard")) {
				device = new Iphone11();
			} else if(level.equals("higEnd")) {
				device = new Iphone11Pro();
			}
		}

		device.getHardware();
		device.assembler();
		device.certificates();
		device.pack();

		return device;
	}
	public static void main(String[] args) {
		Client client = new Client();

		System.out.println("### Ordering an iphone X");
		Iphone iphone = client.orderIphone("X", "standard");
		System.out.println(iphone);

		System.out.println("\n\n### Ordering an iphone 11 HigEnd");
		Iphone iphone2 = client.orderIphone("11", "higEnd");
		System.out.println(iphone2);
	}
}
