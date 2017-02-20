package study;

import study.inter.Aanimal;
import study.num.Season;

/**
 * Created by wqkenqing on 2017/2/15.
 */
public class Dog implements Aanimal{
    public  Dog(){
        System.out.println("创建了dog" );
    }
    public void eat() {
        System.out.println("dog is eating");
    }

    public void sleep() {
        System.out.println("dog is sleeping");
    }

    public void run() {
        System.out.println("dog is running");
    }

    public static void main(String[] args) {
//        Dog dog =new Dog();
//        dog.run();
//        dog.eat();
//        dog.sleep();
         Season season=Season.SPRING;
        System.out.println(season.getName());;
    }
}
