package br.com.cod3r.factory.apple.after.factory;

import br.com.cod3r.factory.apple.after.model.Iphone;
import br.com.cod3r.factory.apple.after.model.Iphone11;

public class Iphone11Factory extends IphoneFactory{
    @Override
    protected Iphone createIphone() {
        return new Iphone11();
    }
}
