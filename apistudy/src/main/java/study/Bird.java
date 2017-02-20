package study;

import study.ab.FlyAnimal;

/**
 * Created by wqkenqing on 2017/2/15.
 */
public class Bird extends FlyAnimal{
    public void fly() {
        System.out.println("bird is flying");
    }

    public static void main(String[] args) {
        Bird bird=new Bird();
        bird.fly();
    }
}
