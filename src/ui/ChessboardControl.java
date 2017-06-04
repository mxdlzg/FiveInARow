package ui;

import control.Machine;
import control.VictoryInspector;
import entity.Config;
import util.ChessPosRound;

import javax.swing.*;
import java.awt.*;

/**
 * Created by 廷江 on 2017/6/4.
 */
public class ChessboardControl {
    private JPanel mainPanel;
    private JPanel chessboardPanel;
    private JPanel controlPanel;
    private JLabel background;
    private int userColor;

    private int[][] chessboardArray ;
    private VictoryInspector victoryInspector;
    private Machine machine;

    /**
     * 暂时无用
     * @param mainPanel 主panel
     * @param chessboardPanel 棋盘
     * @param background 棋盘背景
     */
    public ChessboardControl(JPanel mainPanel,JPanel chessboardPanel,JLabel background) {
        this.mainPanel = mainPanel;
        this.chessboardPanel = chessboardPanel;
        this.background = background;
        init();
    }

    /**
     * @param background 如果外部只需要调用点击效果，只需要给background初始化
     */
    ChessboardControl(JLabel background) {
        this.background = background;
        init();
    }

    /**
     * 初始化控制器用到的参数和对象
     */
    private void init(){
        chessboardArray = new int[15][15];
        victoryInspector = new VictoryInspector();
        machine = new Machine();
    }

    /**
     * 用户点击事件
     * @param x 横坐标
     * @param y 纵坐标
     */
    void onActionDown(int x, int y){
        Graphics graphics = background.getGraphics();
        if (userColor == Config.COLOR_BLACK){
            graphics.setColor(Color.BLACK);
        }else {
            graphics.setColor(Color.WHITE);
        }
        chessboardArray[x/50][y/50] = 1;
        x = ChessPosRound.posRound(x);
        y = ChessPosRound.posRound(y);
        graphics.fillOval(x - 15, y - 15, 30, 30);
    }


    /**
     * @return 用户当前使用的棋子颜色
     */
    public int getUserColor() {
        return userColor;
    }

    /**
     * @param userColor 用户的棋子颜色
     */
    public void setUserColor(int userColor) {
        this.userColor = userColor;
    }

}
