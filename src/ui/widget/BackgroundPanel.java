package ui.widget;

import javax.swing.*;
import java.awt.*;

/**
 * Created by 廷江 on 2017/6/4.
 */
public class BackgroundPanel extends JPanel {
    private static final long serialVersionUID = 1L;
    private Image imageIcon;

    /**
     * @param imageIcon 背景图片
     */
    public BackgroundPanel(Image imageIcon) {
        this.imageIcon = imageIcon;
    }

    /**
     * 重绘背景
     * @param graphics graphics
     */
    protected void paintComponent(Graphics graphics){
        graphics.drawImage(imageIcon,0,0,1000,1000,this);
    }
}
