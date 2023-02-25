package br.com.cod3r.factory.apple.after.factory;

import br.com.cod3r.factory.apple.after.model.Iphone;
import br.com.cod3r.factory.apple.after.model.IphoneXSMax;

public class IphoneXSMaxFactory extends IphoneFactory{
    @Override
    protected Iphone createIphone() {
        return new IphoneXSMax();
    }
}
