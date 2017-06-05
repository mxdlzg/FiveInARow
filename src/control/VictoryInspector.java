package control;

import entity.Chessman;

import java.util.List;

/**
 * Created by 廷江 on 2017/6/3.
 */
public class VictoryInspector {
    private int userColor;
    private int[][] chessboardArray;
    List<Chessman> chessmanList;

    public VictoryInspector() {
    }

    public VictoryInspector(int userColor, int[][] chessboardArray) {
        this.userColor = userColor;
        this.chessboardArray = chessboardArray;
    }


}
