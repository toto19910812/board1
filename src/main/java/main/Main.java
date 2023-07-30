package main;

import map.Creater;

public class Main {
    public static void main(String[] args){
        Player pc = new Player();
        Creater.create_test();

//        プレイヤーの１行動をメインメソッドに一度再現してから、Commandクラスに切り離す
        System.out.println("ももたろ社長、おじかんです！");
        pc.Saikoro();




    }
}
