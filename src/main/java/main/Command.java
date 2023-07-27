package main;

public class Command {
//    行動をおいておくクラス
//    プレイヤーだけでなく、イベントやNPCが使い回すことも考慮し、コマンドクラスとした。
    public static int useDice(){
        //サイコロをふるメソッド。サイコロをnewし、出目を出してその目を返す。
        Dice dice = new Dice();
        dice.use();
        return dice.getValue();
    }
}
