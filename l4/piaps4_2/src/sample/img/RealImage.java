package sample.img;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

public class RealImage implements Proxy {

    public RealImage(){

    }

    @Override
    public void activate() {
        JFileChooser fileopen = new JFileChooser();
        int ret = fileopen.showDialog(null, "Открыть файл");
        if (ret == JFileChooser.APPROVE_OPTION) {
            File file = fileopen.getSelectedFile();

            try {
                BufferedImage bufferedImage = ImageIO.read(file);
                Frame[] frames = Frame.getFrames();
                frames[0].setSize(bufferedImage.getWidth(),bufferedImage.getHeight());
                EventQueue.invokeLater(() -> frames[0].getGraphics().drawImage(bufferedImage,0,0,null));
                //frames[0].getGraphics().drawImage(bufferedImage,0,0,null);


            } catch (Exception e){}
        }
    }
}
