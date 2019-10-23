package ru.mirea.lab2;

public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball(70, 120);
        System.out.println(b1);
        b1.move(53, 13);
        System.out.println(b1);
    }
}
