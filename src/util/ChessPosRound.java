package util;

import entity.Config;

/**
 * Created by 廷江 on 2017/6/4.
 */
public class ChessPosRound {

    /**
     * 坐标去整，靠拢交叉点
     * @param value 坐标x或者y
     * @return 取整之后靠近交叉点的坐标
     */
    public static int posRound(int value){
        int count = value/50;
        return (int) (count*49+30);
    }

    /**
     * @param chesses 5元祖
     * @return 评分
     */
    public static int rankScore(Integer...chesses){
        int whiteCount = 0;
        int blackCount = 0;
        int score = 0;
        boolean isBlack = false;
        for (int i = 0;i<5;i++){
            if (chesses[i] == Config.COLOR_WHITE){
                whiteCount++;
            }else if (chesses[i]==Config.COLOR_BLACK){
                blackCount++;
            }
        }
        if (whiteCount != 0 && blackCount!=0){
            return 0;
        }
        if (whiteCount == 0 && blackCount == 0){
            return 7;
        }
        isBlack = whiteCount == 0;
        switch (isBlack?blackCount:whiteCount){
            case 1:
                if (isBlack){
                    score = 35;
                }else {
                    score = 15;
                }
                break;
            case 2:
                if (isBlack){
                    score = 800;
                }else {
                    score = 400;
                }
                break;
            case 3:
                if (isBlack){
                    score = 15000;
                }else {
                    score = 1800;
                }
                break;
            case 4:
                if (isBlack){
                    score = 800000;
                }else {
                    score = 100000;
                }
                break;
        }
        return score;
    }
}
