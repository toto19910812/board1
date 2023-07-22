package card;
import java.util.ArrayList;
public abstract class Kyuko {
    private int number;//サイコロの個数

    public Kyuko() {
        this.number = 2;
    }
    public void use(){
        ArrayList<Dice> dices = new ArrayList<Dice>();
        for(int i = 0; i < number; i++){
            Dice d = new Dice();
            dices.add(d);
            //△サイコロを作った。次は目の判定と、合算した値を戻り値にする。
        }

    }

}
