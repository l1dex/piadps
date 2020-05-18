package sample.img;

import javax.swing.*;

public class ProxyImage implements Proxy {

    RealImage realImage;
    public ProxyImage(){

    }

    @Override
    public void activate(){
        realImage = new RealImage();
        realImage.activate();
    }
}
