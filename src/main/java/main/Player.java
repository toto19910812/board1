package main;

import java.util.Scanner;

public class Player {
    private int money;

    public int getMoney() {
        return money;
    }
    public void setMoney(int money) {
        this.money = money;
    }

    //以下コマンド
    public void Saikoro(){
        int value = Command.useDice();
        while(value ==0){
            int direction;//選んだ方向
            Scanner sc = new Scanner(System.in);
            System.out.println("どちらへ向かいますか？1:↑　2:↓　3:←　4:→　5:もどる");
            direction = sc.nextInt();
            switch (direction){
//                case
                //次回、選んだ方向と挙動を作成する。
            }
        }
    }

}
