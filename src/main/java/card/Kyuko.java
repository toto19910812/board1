package card;
import java.util.ArrayList;
import main.Command;
public abstract class Kyuko {
    private int number;//サイコロの個数
    public Kyuko() {
        this.number = 2;
    }
    public int use(){
        int total=0;//合計値を格納する変数
        for(int i = 0; i < number; i++){//カードによるサイコロの個数分繰り返す
            total += Command.useDice();
        }
        return total;//合計値を戻り値にする
    }

}
