package br.com.cod3r.factory.apple.after.factory;

import br.com.cod3r.factory.apple.after.model.Iphone;
import br.com.cod3r.factory.apple.after.model.Iphone11Pro;

public class Iphone11ProFactory extends IphoneFactory{
    @Override
    protected Iphone createIphone() {
        return new Iphone11Pro();
    }
}
