package study;

import javax.swing.*;

/**
*@className:ManyThread
*@author:wqkenqing
*@describe:
*@date:2017/1/19
**/
public class ManyThread  extends Thread{
    static  int d=0;
    @Override
    public void run() {
        d++;
        System.out.print("this is 多线程测试"+d);
        System.out.println("\n");
    }

    public static void main(String[] args) {
        JFrame jFrame=new JFrame("this is a test");
    }
}
