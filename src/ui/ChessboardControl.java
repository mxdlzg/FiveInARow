package ui;

import control.Machine;
import control.VictoryInspector;
import entity.Chessman;
import entity.Config;
import util.ChessPosRound;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

/**
 * Created by 廷江 on 2017/6/4.
 */
public class ChessboardControl {
    private JPanel mainPanel;
    private JPanel chessboardPanel;
    private JPanel controlPanel;
    private JLabel background;
    private int userColor = Config.COLOR_WHITE;
    private int machineColor = Config.COLOR_BLACK;
    private boolean isUserTurn = true;

    private Chessman[][] maxRect;    //00左上 01右上 10左下 11右下

    private int[][] chessboardArray ;
    private VictoryInspector victoryInspector;
    private Machine machine;

    private Chessman lastPosition;

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
        maxRect = new Chessman[2][2];
        lastPosition = new Chessman();
        chessboardArray = new int[16][16];
        victoryInspector = new VictoryInspector();
        machine = new Machine(chessboardArray);
    }

    /**
     * 重设棋局
     */
    public void reset(){

    }

    public void initUserColor(){
        Random random = new Random();
    }

    public void changeOperator(){

    }

    /**
     * 机器下子
     */
    public void machineAction(){
        if (!isUserTurn){
            System.out.println("机器下子");

        }
        isUserTurn = true;
    }

    /**
     * 用户下子
     * @param x x
     * @param y y
     */
    public void userAction(int x,int y){
        if (isUserTurn && posIsAllowed(x,y)){
            System.out.println("用户下子");
            onActionDown(x,y);
            lastPosition.setColor(userColor);
            lastPosition.setPosX(x/50);
            lastPosition.setPosY(y/50);
            // TODO: 2017/6/5 在这里对用户行为进行victory检查

            
            isUserTurn = false;
            // TODO: 2017/6/5 用户下子后，启动machine线程，对现场进行判断，给出机器下子位置
            machineAction();
            // TODO: 2017/6/5 在这里对机器行为进行victory检查
        }
    }

    /**
     * 用户点击事件
     * @param x 横坐标
     * @param y 纵坐标
     */
    private void onActionDown(int x, int y){
        drawChessman(x,y,userColor);
        chessboardArray[x/50][y/50] = userColor;
    }

    /**
     * 绘制棋子
     * @param x x
     * @param y y
     * @param color 颜色
     */
    private void drawChessman(int x,int y,int color){
        Graphics graphics = background.getGraphics();
        if (color == Config.COLOR_WHITE){
            graphics.setColor(Color.WHITE);
        }else {
            graphics.setColor(Color.BLACK);
        }
        x = ChessPosRound.posRound(x);
        y = ChessPosRound.posRound(y);
        graphics.fillOval(x - 15, y - 15, 30, 30);
    }

    /**
     * @param x x
     * @param y y
     * @return 当前位置是否允许下子
     */
    private boolean posIsAllowed(int x,int y){
        return chessboardArray[x / 50][y / 50] == 0;
    }

    /**
     * 检查最大边界，每添加一个新的棋子就检查一次
     * @param x x
     * @param y y
     */
    private void checkMaxRect(int x,int y){
        // TODO: 2017/6/5 最大边界检查 
        x = x/50;
        y = y/50;
        if (x>maxRect[1][1].getPosX()&& y>maxRect[1][1].getPosY()){
            maxRect[1][1].setPosX(x);
            maxRect[1][1].setPosY(y);
        }
    }

    /**
     * 棋局结束之后对ui进行更新和提示胜利
     * @param color 胜利者的棋子颜色
     */
    private void victoryAction(int color){

    }


    /**
     * @return 玩家最后一步棋的位置
     */
    public Chessman getLastPosition() {
        return lastPosition;
    }

    /**
     * @param lastPosition 最后一步棋
     */
    public void setLastPosition(Chessman lastPosition) {
        this.lastPosition = lastPosition;
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

    /**
     * @return 当前是否为用户操作
     */
    public boolean isUserTurn() {
        return isUserTurn;
    }

    /**
     * @param userTurn 当前是否为用户操作
     */
    public void setUserTurn(boolean userTurn) {
        isUserTurn = userTurn;
    }
}
