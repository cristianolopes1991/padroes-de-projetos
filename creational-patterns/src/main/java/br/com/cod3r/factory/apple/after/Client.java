package br.com.cod3r.factory.apple.after;

import br.com.cod3r.factory.apple.after.factory.Iphone11Factory;
import br.com.cod3r.factory.apple.after.factory.Iphone11ProFactory;
import br.com.cod3r.factory.apple.after.factory.IphoneFactory;
import br.com.cod3r.factory.apple.after.model.Iphone;

public class Client {

    public static void main(String[] args) {
        IphoneFactory iphoneFactory = new Iphone11Factory();
        IphoneFactory iphone11ProFactory = new Iphone11ProFactory();

        System.out.println("### Ordering an iphone x");
        Iphone iphone = iphoneFactory.orderIphone();
        System.out.println(iphone);

        System.out.println("\n\n### Ordering an iphone 11 HigEnd");
        Iphone iphone2 = iphone11ProFactory.orderIphone();
        System.out.println(iphone2);
    }
}
