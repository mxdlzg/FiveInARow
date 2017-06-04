package control;

import entity.Chessman;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 廷江 on 2017/6/3.
 */
public class PositionControl {
    private List<Chessman> chessmanList = new ArrayList<>();

    public PositionControl(List<Chessman> chessmanList) {
        this.chessmanList = chessmanList;
    }

    public void addChessman(Chessman chessman){
        chessmanList.add(chessman);
    }

    public void removeChessman(int x,int y){
        for (Chessman chessman : chessmanList){
            if (chessman.getPosX() == x && chessman.getPosY() == y){
                chessmanList.remove(chessman);
                break;
            }
        }
    }

    public void removeChessman(Chessman chessman){
        for (Chessman cm : chessmanList){
            if (cm.equals(chessman)){
                chessmanList.remove(cm);
                break;
            }
        }
    }

    public void resetChessboard(){
        try {
            chessmanList.clear();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
