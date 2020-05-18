package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sample.img.Proxy;
import sample.img.ProxyImage;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Main {




    public static void main(String[] args) throws IOException {

        File file = new File("C:\\Users\\Кирилл\\Desktop\\sem5\\piaps4\\resoures\\test.jpg");
        BufferedImage res = ImageIO.read(file);

        ProxyImage proxyImage = new ProxyImage();
        ClickListener.visible(res,proxyImage);

    }
}
