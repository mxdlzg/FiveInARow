package util;

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
}
