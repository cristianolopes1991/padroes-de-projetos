package br.com.cod3r.factory.apple.after.factory;

import br.com.cod3r.factory.apple.after.model.Iphone;
import br.com.cod3r.factory.apple.after.model.IphoneX;

public class IphoneXFacroty extends IphoneFactory {
    @Override
    protected Iphone createIphone() {
        return new IphoneX();
    }
}
