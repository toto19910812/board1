package main;

import java.util.Scanner;

public class Player {
    private long money;
    private String name;
    private String directer;
    private int positionR;
    private int positionC;


    public long getMoney() {
        return money;
    }
    public void setMoney(long money) {
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
                case 1:

                    direction--;
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                default:
                    System.out.println("エラー");
            }
        }
    }

}
