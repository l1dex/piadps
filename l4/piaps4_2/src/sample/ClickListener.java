package sample;

import sample.img.Proxy;
import sample.img.ProxyImage;

import java.awt.*;
import java.awt.event.*;
import java.awt.im.spi.InputMethod;
import java.awt.image.BufferedImage;
import javax.swing.*;

public class ClickListener extends MouseAdapter implements ActionListener {
    private final static int clickInterval = (Integer) Toolkit.getDefaultToolkit().getDesktopProperty("awt.multiClickInterval");
//    private static boolean clickListener;
    private MouseEvent lastEvent;
    private Timer timer;
    private ProxyImage proxyImage;
    private static ClickListener clickListener;
    public ClickListener() {
        this(clickInterval);
    }

    private ClickListener(ProxyImage proxyImage){
        this(clickInterval);
        this.proxyImage = proxyImage;
    }

    public static ClickListener getInstance(ProxyImage proxyImage){
        if(clickListener == null){
            clickListener = new ClickListener(proxyImage);
        }
        return clickListener;
    }

    public ClickListener(int delay) {
        timer = new Timer(delay, this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        /*if (e.getClickCount() > 2) {
            return;
        }
        lastEvent = e;
        if (timer.isRunning()) {
            timer.stop();
            doubleClick(lastEvent);
        } else {
            timer.restart();
        }*/

        if (timer.isRunning() && !e.isConsumed() && e.getClickCount() > 1) {


            System.out.println("double");
            proxyImage.activate();
            timer.stop();
        } else {
            timer.restart();
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        timer.stop();
        singleClick(lastEvent);
    }

    public void singleClick(MouseEvent e) {
    }



    public static void visible(BufferedImage res, ProxyImage proxyImage) {
        JFrame frame = new JFrame("Double Click Test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.addMouseListener(ClickListener.getInstance(proxyImage));
        frame.setPreferredSize(new Dimension(res.getWidth(), res.getHeight()));
        frame.pack();
        frame.setVisible(true);
    }
}