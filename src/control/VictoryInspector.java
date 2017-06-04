package control;

import entity.Chessman;

import java.awt.*;
import java.util.List;

/**
 * Created by 廷江 on 2017/6/3.
 */
public class VictoryInspector {
    private Color userColor;
    List<Chessman> chessmanList;

    public VictoryInspector() {
    }

    public VictoryInspector(Color userColor, List<Chessman> chessmanList) {
        this.userColor = userColor;
        this.chessmanList = chessmanList;
    }


}
