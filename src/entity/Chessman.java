package entity;

import java.awt.*;

/**
 * Created by 廷江 on 2017/6/3.
 */
public class Chessman {
    private Color color;
    private int posX,posY;

    public Chessman() {
        color = java.awt.Color.BLACK;
        posX = posY = 0;
    }

    public Chessman(Color color) {
        this.color = color;
    }

    public Chessman(Color color, int posX, int posY) {
        this.color = color;
        this.posX = posX;
        this.posY = posY;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }
}
