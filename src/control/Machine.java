package control;

import entity.Chessman;

/**
 * Created by 廷江 on 2017/6/3.
 */
public class Machine {
    private int x,y;
    private int[][] chessboardArray;
    private int[][] scoreArray;

    public Machine(int[][] chessboardArray) {
        this.chessboardArray = chessboardArray;
        scoreArray = new int[16][16];
    }

    public void findNextPosition(Chessman chessman){

    }

    /**
     * 扫描整个棋盘，对pos进行加分
     */
    private void scanAllChessboard(){

    }

    private void HVscan(){
        for (int i = 0;i<11;i++){
            for (int j = 0;j<15;j++){

            }
        }
        for (int i = 0;i<11;i++){
            for (int j = 0;j<15;j++){

            }
        }
    }

    /**
     * 重置积分板
     */
    private void initScoreArray(){
        scoreArray = new int[16][16];
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
