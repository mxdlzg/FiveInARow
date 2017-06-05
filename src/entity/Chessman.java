package entity;

/**
 * Created by 廷江 on 2017/6/3.
 */
public class Chessman {
    private int color;
    private int posX,posY;

    public Chessman() {
        color = Config.COLOR_BLACK;
        posX = posY = 0;
    }

    public Chessman(int color) {
        this.color = color;
    }

    public Chessman(int color, int posX, int posY) {
        this.color = color;
        this.posX = posX;
        this.posY = posY;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
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
