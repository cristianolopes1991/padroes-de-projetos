package br.com.cod3r.factory.apple.simple;

import br.com.cod3r.factory.apple.simple.factory.IphoneSimpleFactory;
import br.com.cod3r.factory.apple.simple.model.IPhone;

public class Client {

    public static void main(String[] args) {
        System.out.println("### Ordering an iPhone X");
        IPhone iphone = IphoneSimpleFactory.orderIPhone("X", "standard");
        System.out.println(iphone);

        System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
        IPhone iphone2 = IphoneSimpleFactory.orderIPhone("11", "highEnd");
        System.out.println(iphone2);
    }
}