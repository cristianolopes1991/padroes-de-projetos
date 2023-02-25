package br.com.cod3r.factory.apple.after.factory;

import br.com.cod3r.factory.apple.after.model.Iphone;

public abstract class IphoneFactory {

    public Iphone orderIphone() {
        Iphone device = null;

        device = createIphone();

        device.getHardware();
        device.assembler();
        device.certificates();
        device.pack();

        return device;
    }

    protected abstract Iphone createIphone();
}
