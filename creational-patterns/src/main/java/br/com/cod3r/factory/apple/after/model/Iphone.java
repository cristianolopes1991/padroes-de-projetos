package br.com.cod3r.factory.apple.after.model;

public abstract class Iphone {

    public abstract void getHardware();

    public void assembler(){
        System.out.println("Assembling all the hardware");
    }

    public void certificates(){
        System.out.println("Testing all the certificates");
    }

    public void pack() {
        System.out.println("Packing the device");
    }


}
